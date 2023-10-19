/**This is Due March 20th 12:00am */
public class JavaStudentPoll{
    public static void main(String[] args){
        int[] responses = {1,2,1,2,1,3,4,5,5,3,2,1,5,5,3,5,1,2,4,5,15};
        System.out.println(responses.length);
        /** The int array frequency is being capped off at 6*/
        int[] frequency = new int[20];
        /** Writing a for loop for the lenght of the array while implementing a try catch
         * method to catch the ArrayIndexOutOfBounds error that occured 
        */
        for (int answer = 2; answer < responses.length; answer++){
           try{
            ++frequency[responses[answer]];
           }
           catch(ArrayIndexOutOfBoundsException errArrayIndexOutOfBounds){
                System.err.println(errArrayIndexOutOfBounds);
                System.out.printf("responses[%d] = %d\n\n", answer, responses[answer]);
           }
        }

        System.out.printf("%s%10s\n", "Rating", "Frequency");
        /** Make a for loop for the lenght and frequency of the arrays while combining them into
         * one answer
         */
        for(int rating = 1; rating < frequency.length; rating++){
            System.out.printf("%6d%10d\n", rating, frequency[rating]);
        }

    }
    
    /**On line 7 if you change it to 20 it changes the lenght of the array.
     * Also messing with the nums on line 25,11 and 4 changes the right side more than the left
     * Because of the ArrayIndexOutOfBoundsException you can keep add more values
     * Oh by making the values all equal to 200 it stop working
     */
}