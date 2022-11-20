
/**
 * @param {number} x
 * @return {number}
 */

 /*
     Related Topics
     -> Math

     Constraints
     //Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */

// S1 - Math
// Time Complexity O(log(n)) | Space Complexity O(1)
var reverse = function(x) {

        var rev = 0;

        while (x != 0) {

            var pop = x % 10;
            x = Math.trunc(x / 10); // trims the decimal, leaving only the integer

            if ( (rev > 214748364) || ((rev == 214748364) && (pop > 7)) ) { return 0;}
            if ( (rev < -214748364) || ((rev == -214748364) && (pop < -8)) ) { return 0;}

            rev = (rev * 10) + pop;

        }

        return rev;

};
