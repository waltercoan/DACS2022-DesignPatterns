package adapter;

public class Adapter implements ClienteInterface{
    
    private Service service;

    public Service getService() {
        return service;
    }
    public void setService(Service service) {
        this.service = service;
    }
    @Override
    public void method(String xml) {
        // DEVERIA TER UM CODIGO MUITO DOIDO QUE 
        //TRANSFORMA XML Em JSON
        String json = xml;
        service.ServiceMethod(json);
        
    }
    
}
