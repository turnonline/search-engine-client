/*
 * Copyright (c) 2020 TurnOnline.biz s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package biz.turnonline.ecosystem.search.facade;

import biz.turnonline.ecosystem.search.facade.adaptee.AccountAdaptee;
import biz.turnonline.ecosystem.search.facade.adaptee.ContactAdaptee;
import biz.turnonline.ecosystem.search.facade.adaptee.GlobalAdaptee;
import biz.turnonline.ecosystem.search.facade.adaptee.InvoiceAdaptee;
import biz.turnonline.ecosystem.search.facade.adaptee.OrderAdaptee;
import biz.turnonline.ecosystem.search.facade.adaptee.ProductAdaptee;
import biz.turnonline.ecosystem.search.model.Account;
import biz.turnonline.ecosystem.search.model.Contact;
import biz.turnonline.ecosystem.search.model.Global;
import biz.turnonline.ecosystem.search.model.Invoice;
import biz.turnonline.ecosystem.search.model.Order;
import biz.turnonline.ecosystem.search.model.Product;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import org.ctoolkit.restapi.client.adaptee.DeleteExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.GetExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.ListExecutorAdaptee;

/**
 * The product billing guice default adaptee configuration.
 *
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
 */
public class SearchEngineAdapteeModule
        extends AbstractModule
{
    @Override
    protected void configure()
    {
        // Account
        bind( new TypeLiteral<GetExecutorAdaptee<Account>>()
        {
        } ).to( AccountAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<Account>>()
        {
        } ).to( AccountAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<Account>>()
        {
        } ).to( AccountAdaptee.class );

        // Contact
        bind( new TypeLiteral<GetExecutorAdaptee<Contact>>()
        {
        } ).to( ContactAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<Contact>>()
        {
        } ).to( ContactAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<Contact>>()
        {
        } ).to( ContactAdaptee.class );

        // Invoice
        bind( new TypeLiteral<GetExecutorAdaptee<Invoice>>()
        {
        } ).to( InvoiceAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<Invoice>>()
        {
        } ).to( InvoiceAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<Invoice>>()
        {
        } ).to( InvoiceAdaptee.class );

        // Order
        bind( new TypeLiteral<GetExecutorAdaptee<Order>>()
        {
        } ).to( OrderAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<Order>>()
        {
        } ).to( OrderAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<Order>>()
        {
        } ).to( OrderAdaptee.class );

        // Product
        bind( new TypeLiteral<GetExecutorAdaptee<Product>>()
        {
        } ).to( ProductAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<Product>>()
        {
        } ).to( ProductAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<Product>>()
        {
        } ).to( ProductAdaptee.class );

        // Global
        bind( new TypeLiteral<ListExecutorAdaptee<Global>>()
        {
        } ).to( GlobalAdaptee.class );


    }
}
