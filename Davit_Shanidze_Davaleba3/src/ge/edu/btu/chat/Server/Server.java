package ge.edu.btu.chat.Server;

public class Server {
    public void answerQuestion(String input){
        if (input.contains("გამარჯობა")){
            System.out.println("გამარჯობა");
        }
        else if (input.contains("კურსი")){
            System.out.println("ვალუტის კურსია: 3.24");
        }
        else if (input.contains("მაჩვენე ფილიალები")){
            System.out.println("ჭავჭავაძის 32, ვარკეთილის IV, აფრიკა");
        }
        else{
            System.out.println("სამწუხაროდ ამ კითხვაზე პასუხი არ მაქვს");
        }

    }
}
