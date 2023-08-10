class Solution {
    public int reverse(int x) {
        
	int reversed=reverseNumberUsingRecursion(x);
	
	if(reversed<Math.pow(-2,31) || reversed>Math.pow(2,31) )
        return 0;
    else 
        return reversed;
    }
    public int reverseNumberUsingRecursion(int num) {
	    return reverseHelper(num, 0);
	}
    private int reverseHelper(int num, int reversed) {
	    if (num == 0) {
	        return reversed;
	    }
	    return reverseHelper(num / 10, reversed * 10 + num % 10);
	}
}
