public class Restaurant {

    public static void main (String[] args ){
        // all my tasks start as not assigned and will be assigned later
        boolean dish_washing = false;
        boolean kitchen_cleaning = false;
        boolean dining_hall_cleaning = false;
        boolean exterior_cleaning = false;
        boolean manage_supplies = false;
        boolean manage_linens = false;
        boolean miscellaneous = false;

        System.out.println("Hi Team, I am your manager for the day and to be fair, I will assign tasks randomly between you. Here it is:");
        //loop that creates employee, delimits to 7 and then adds 1 every count
        for (int employee = 1; employee<= 7; employee++){
            //creates the variable to random the choice
            int taskNumber; // will hold random number between 0 and 7
            boolean alreadyUsed;

            // will make a random selection and will choose a task that is not yet assigned
            do{
                taskNumber= (int)(Math.random() * 7); //generates the random numbers
                alreadyUsed = false; //assumes that task is available

                //connects numeric task value to the boolean
                if (taskNumber == 0) {
                    alreadyUsed = dish_washing;
                } else if (taskNumber == 1) {
                    alreadyUsed = kitchen_cleaning;
                } else if (taskNumber ==2){
                    alreadyUsed = dining_hall_cleaning;
                } else if (taskNumber ==3){
                    alreadyUsed = exterior_cleaning;
                } else if (taskNumber ==4){
                    alreadyUsed = manage_supplies;
                } else if (taskNumber ==5){
                    alreadyUsed = manage_linens;
                } else if (taskNumber ==6){
                    alreadyUsed = miscellaneous;
                }
            } while (alreadyUsed); //if the random number was a duplicate it tries again

            System.out.println("\nAssigning task to employee " + employee);

            switch (taskNumber){
                case 0:
                    dish_washing = true; // marks the task as assigned
                    System.out.println("Dish Washing"); // prints the corresponding name
                    break;
                case 1:
                    kitchen_cleaning = true;
                    System.out.println("Kitchen Cleaning");
                    break;
                case 2:
                    dining_hall_cleaning = true;
                    System.out.println("Dining Hall Cleaning");
                    break;
                case 3:
                    exterior_cleaning = true;
                    System.out.println("Exterior Cleaning");
                    break;
                case 4:
                    manage_supplies = true;
                    System.out.println("Manage Supplies");
                    break;
                case 5:
                    manage_linens = true;
                    System.out.println("Manage Linens");
                    break;
                case 6:
                    miscellaneous = true;
                    System.out.println("Miscellaneous");
                    break;
            }
        }
    }
}
