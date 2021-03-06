/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2018-10-08 17:45:39 UTC)
 * on 2020-07-22 at 10:19:03 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.search.model;

/**
 * Model definition for Order.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Search Engine. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings( "javadoc" )
public final class Order
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String companyId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String owner;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> productCodes;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCompanyId()
    {
        return companyId;
    }

    /**
     * @param companyId companyId or {@code null} for none
     */
    public Order setCompanyId( java.lang.String companyId )
    {
        this.companyId = companyId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getId()
    {
        return id;
    }

    /**
     * @param id id or {@code null} for none
     */
    public Order setId( java.lang.String id )
    {
        this.id = id;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getName()
    {
        return name;
    }

    /**
     * @param name name or {@code null} for none
     */
    public Order setName( java.lang.String name )
    {
        this.name = name;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getOwner()
    {
        return owner;
    }

    /**
     * @param owner owner or {@code null} for none
     */
    public Order setOwner( java.lang.String owner )
    {
        this.owner = owner;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getProductCodes()
    {
        return productCodes;
    }

    /**
     * @param productCodes productCodes or {@code null} for none
     */
    public Order setProductCodes( java.util.List<java.lang.String> productCodes )
    {
        this.productCodes = productCodes;
        return this;
    }

    @Override
    public Order set( String fieldName, Object value )
    {
        return ( Order ) super.set( fieldName, value );
    }

    @Override
    public Order clone()
    {
        return ( Order ) super.clone();
    }

}
