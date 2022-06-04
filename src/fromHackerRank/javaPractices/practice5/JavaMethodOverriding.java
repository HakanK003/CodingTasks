package fromHackerRank.javaPractices.practice5;

class JavaMethodOverriding {

    class Sports{

        String getName(){
            return "Generic Sports";
        }

        void getNumberOfTeamMembers(){
            System.out.println( "Each team has n players in " + getName() );
        }
    }

    class Soccer extends Sports{
        @Override
        String getName(){
            return "Soccer Class";
        }
        @Override
        public void getNumberOfTeamMembers(){
            System.out.println("Each team has 11 players in Soccer Class");
        }
        // Write your overridden getNumberOfTeamMembers method here

    }

    public class Solution{

        public void main(String[] args){
            Sports c1 = new Sports();
            Soccer c2 = new Soccer();
            System.out.println(c1.getName());
            c1.getNumberOfTeamMembers();
            System.out.println(c2.getName());
            c2.getNumberOfTeamMembers();
        }
    }


}