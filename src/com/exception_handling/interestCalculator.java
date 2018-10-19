package com.exception_handling;

import static com.exception_handling.InvalidDuration.MAX_Duration;
import static com.exception_handling.InvalidDuration.MIN_Duration;
import static com.exception_handling.InvalidPrincipalException.MAX_Principal;
import static com.exception_handling.InvalidPrincipalException.MIN_Principal;
import static com.exception_handling.InvalidRateofInterest.MAX_InterestRate;
import static com.exception_handling.InvalidRateofInterest.MIN_InterestRate;

public class interestCalculator {

    static  void calc(double p, double r, int d) throws Exception{

        if(p<MIN_Principal || p>MAX_Principal)
            //throw new Exception("Principal amount must be in range 10000 to 1000000");
            throw new InvalidPrincipalException();

        if (r< MIN_InterestRate || r>MAX_InterestRate)
            //throw  new Exception("Rate of interest must be in range 4 to 25");
            throw new InvalidRateofInterest();

        if(d<MIN_Duration || d>MAX_Duration)
            //throw new Exception("Duration must be in range 12 to 240 months");
            throw  new  InvalidDuration();

        double interest = p*r/100/12*d;


    }
}
