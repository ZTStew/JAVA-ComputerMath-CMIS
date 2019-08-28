public class ComputerMath{
    private int val1;
    private int val2;
    private String opp;

    public ComputerMath(){ }

    public void calculate(int inVal1, int inVal2, String inOpp){
        val1 = inVal1;
        val2 = inVal2;
        opp = inOpp;

        /* checks if 'opp' contains the specified and prints the assosiated opperation */
        if(this.opp.contains("+")){
            System.out.printf("\n%d + %d = %d", this.val1, this.val2, this.val1 + this.val2);
        } else if(this.opp.contains("-")){
            System.out.printf("\n%d - %d = %d", this.val1, this.val2, this.val1 - this.val2);
        } else if(this.opp.contains("*") || this.opp.contains("x")){
            System.out.printf("\n%d x %d = %d", this.val1, this.val2, this.val1 * this.val2);
        } else if(this.opp.contains("/")){
            /* checks if 'val2' is 0, if it is, the opperation cannot be completed and a predefined value is returned */
            if(this.val2 == 0){
                System.out.printf("\n%d / %d = N/A", this.val1, this.val2);
            } else {
                System.out.printf("\n%d / %d = %,.2f", this.val1, this.val2, (float)this.val1 / this.val2);
            }
        } else if(this.opp.contains("%")){
            System.out.println("\n" + this.val1 + " % " + this.val2 + " = " + (this.val1 % this.val2));
        } else {
            /* 
             * if the opperation given is not one of the ones checked for above,
             * returns predeined error 
             */
            System.out.println("\nValue Unknown");
        }
    }
}
