/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;
/*
Student Id- 991631228
*/

/**
 * MidTerm Exam
 * @author srinivsi
 * @author Sukhmanpreet Kaur
 */

public class StausUser 
{
    public enum StatusS{
        ZERO("0"),ONE("1"),TWO("2"),THREE("3");
        public String code;
        StatusS(String code){
            this.code=code;
        }

        @Override
        public String toString() {
            return code;
        }

    }
   public void statusDetail(StatusS code)
{
switch(code)
        {
        case ZERO: System.out.println("REJECTED");
        break;
        case ONE: System.out.println("PENDING");
        break;
        case TWO:
        System.out.println("PROCESSING");
        break;
        case THREE: 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
 
}
