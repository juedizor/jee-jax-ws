
package co.com.client.ws.servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.client.ws.servicio package. 
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

    private final static QName _GetUsuariosResponse_QNAME = new QName("http://iface.service.jee.com.co/", "getUsuariosResponse");
    private final static QName _GetUsuarios_QNAME = new QName("http://iface.service.jee.com.co/", "getUsuarios");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.client.ws.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUsuarios }
     * 
     */
    public GetUsuarios createGetUsuarios() {
        return new GetUsuarios();
    }

    /**
     * Create an instance of {@link GetUsuariosResponse }
     * 
     */
    public GetUsuariosResponse createGetUsuariosResponse() {
        return new GetUsuariosResponse();
    }

    /**
     * Create an instance of {@link UsuarioVO }
     * 
     */
    public UsuarioVO createUsuarioVO() {
        return new UsuarioVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iface.service.jee.com.co/", name = "getUsuariosResponse")
    public JAXBElement<GetUsuariosResponse> createGetUsuariosResponse(GetUsuariosResponse value) {
        return new JAXBElement<GetUsuariosResponse>(_GetUsuariosResponse_QNAME, GetUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iface.service.jee.com.co/", name = "getUsuarios")
    public JAXBElement<GetUsuarios> createGetUsuarios(GetUsuarios value) {
        return new JAXBElement<GetUsuarios>(_GetUsuarios_QNAME, GetUsuarios.class, null, value);
    }

}
