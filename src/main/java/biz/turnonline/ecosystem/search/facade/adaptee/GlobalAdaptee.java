package biz.turnonline.ecosystem.search.facade.adaptee;

import biz.turnonline.ecosystem.search.SearchEngine;
import biz.turnonline.ecosystem.search.model.Global;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.ListExecutorAdaptee;
import org.ctoolkit.restapi.client.adapter.AbstractGoogleClientAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * The {@link Global} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
@Singleton
public class GlobalAdaptee
        extends AbstractGoogleClientAdaptee<SearchEngine>
        implements ListExecutorAdaptee<Global>
{
    @Inject
    public GlobalAdaptee( Provider<SearchEngine> client )
    {
        super( client );
    }

    @Override
    public Object prepareList( @Nullable Identifier parentKey ) throws IOException
    {
        return client().global( "" );
    }

    @Override
    public List<Global> executeList( @Nonnull Object request,
                                     @Nullable Map<String, Object> parameters,
                                     @Nullable Locale locale,
                                     @Nullable Integer offset,
                                     @Nullable Integer limit,
                                     @Nullable String orderBy,
                                     @Nullable Boolean ascending ) throws IOException
    {
        SearchEngine.Global list = ( SearchEngine.Global ) request;

        if ( offset != null && offset > 0 )
        {
            list.setOffset( offset );
        }
        if ( limit != null && limit > 0 )
        {
            list.setLimit( limit );
        }

        if ( parameters != null )
        {
            list.setQuery( ( String ) parameters.get( "query" ) );
        }

        fill( request, parameters );
        return list.execute().getItems();
    }
}
