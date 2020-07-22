package biz.turnonline.ecosystem.search.facade.adaptee;

import biz.turnonline.ecosystem.search.SearchEngine;
import biz.turnonline.ecosystem.search.model.Contact;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.DeleteExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.GetExecutorAdaptee;
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
 * The {@link Contact} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
@Singleton
public class ContactAdaptee
        extends AbstractGoogleClientAdaptee<SearchEngine>
        implements GetExecutorAdaptee<Contact>, ListExecutorAdaptee<Contact>, DeleteExecutorAdaptee<Contact>
{
    @Inject
    public ContactAdaptee( Provider<SearchEngine> client )
    {
        super( client );
    }

    @Override
    public Object prepareDelete( @Nonnull Identifier identifier ) throws IOException
    {
        return client().orders().delete( identifier.getString() );
    }

    @Override
    public Object executeDelete( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }

    @Override
    public Object prepareGet( @Nonnull Identifier identifier ) throws IOException
    {
        return client().orders().get( identifier.getString() );
    }

    @Override
    public Contact executeGet( @Nonnull Object request,
                               @Nullable Map<String, Object> parameters,
                               @Nullable Locale locale ) throws IOException
    {
        return ( Contact ) execute( request, parameters );
    }

    @Override
    public Object prepareList( @Nullable Identifier parentKey ) throws IOException
    {
        return client().orders().list( "" );
    }

    @Override
    public List<Contact> executeList( @Nonnull Object request,
                                      @Nullable Map<String, Object> parameters,
                                      @Nullable Locale locale,
                                      @Nullable Integer offset,
                                      @Nullable Integer limit,
                                      @Nullable String orderBy,
                                      @Nullable Boolean ascending ) throws IOException
    {
        SearchEngine.Contacts.List list = ( SearchEngine.Contacts.List ) request;

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
