public class Routes {

    @WebRoute(path = "/test1")
    public void test1(){
        System.out.println("test1");
    }

    @WebRoute(path = "/test2")
    public void test2(){
        System.out.println("test2");
    }

}
