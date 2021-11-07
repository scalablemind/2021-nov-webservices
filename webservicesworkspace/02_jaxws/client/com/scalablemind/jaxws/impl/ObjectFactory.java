
package com.scalablemind.jaxws.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scalablemind.jaxws.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateOrderResponse_QNAME = new QName("http://impl.jaxws.scalablemind.com/", "updateOrderResponse");
    private final static QName _UpdateOrder_QNAME = new QName("http://impl.jaxws.scalablemind.com/", "updateOrder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scalablemind.jaxws.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateOrderResponse }
     * 
     */
    public UpdateOrderResponse createUpdateOrderResponse() {
        return new UpdateOrderResponse();
    }

    /**
     * Create an instance of {@link UpdateOrder }
     * 
     */
    public UpdateOrder createUpdateOrder() {
        return new UpdateOrder();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.jaxws.scalablemind.com/", name = "updateOrderResponse")
    public JAXBElement<UpdateOrderResponse> createUpdateOrderResponse(UpdateOrderResponse value) {
        return new JAXBElement<UpdateOrderResponse>(_UpdateOrderResponse_QNAME, UpdateOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.jaxws.scalablemind.com/", name = "updateOrder")
    public JAXBElement<UpdateOrder> createUpdateOrder(UpdateOrder value) {
        return new JAXBElement<UpdateOrder>(_UpdateOrder_QNAME, UpdateOrder.class, null, value);
    }

}
