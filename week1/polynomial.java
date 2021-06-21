class Solution1{

    public void polynomial(int x, int[] A){

        int power = 1;
        int result = A[0];

        for(int i=1; i<A.length; i++){

            power = power*x;

            result+=A[i]*power;

        }

        System.out.println(result);

    }
}

class Solution2{

    public void polynomial(int x, int[] A){

        int n = A.length-1;

        int result = A[n];

        for(int i=1; i<A.length; i++){
            n--;
            result = result*x+A[n];
        }


        System.out.println(result);


    }
}