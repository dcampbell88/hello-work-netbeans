public class HelloMain {
    private String msg = "I say hello.";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HelloMain myHello = new HelloMain();
        System.out.println(myHello.getMsg());
    }
}
