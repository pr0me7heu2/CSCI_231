public class BrasherBryanProject10_MyString {

    private char[] data;

    //creates MyString object
    public BrasherBryanProject10_MyString(char[] chars) {
        this.data = chars;
    }

    // returns char at index i in data
    // throws exception if is less than zero or
    // greater than the largest index in data
    public char charAt(int i) {
        if(i >= 0 && i < data.length) {
            return data[i];
        }
        // outside of data
        else {
            throw new IllegalArgumentException();
        }
    }

    // returns length of data
    public int length() {
        return data.length;
    }

    // returns MyString object with data containing
    // subset of calling object data from index begin
    // through (and including) index end
    public BrasherBryanProject10_MyString substring(int begin, int end) {
        if(begin >= 0 && end < data.length) {
            char[] mySubChar = new char[end - begin + 1];
            for (int i = begin; i < end + 1 ; i++) {
                mySubChar[i - begin] = data[i];
            }
            return new BrasherBryanProject10_MyString(mySubChar);
        }
        // outside of data
        else {
            throw new IllegalArgumentException();
        }
    }

    // returns a MyString object equivalent to
    // calling object but with all upper case ASCII
    // characters in this.data replaced with their
    // lower case equivalent
    public BrasherBryanProject10_MyString toLowerCase() {
        char[] myLowerChar = new char[this.length()];

        for (int i = 0; i < this.length(); i++) {
            //if data[i] is uppercase ASCII character
            if(this.data[i] >= 65 && this.data[i] <= 90) {
                myLowerChar[i] = (char) (this.data[i] + 32);
            }
            else {
                myLowerChar[i] = this.data[i];
            }
        }
        return new BrasherBryanProject10_MyString(myLowerChar);
    }

    // returns true if and only if other.data == this.data
    public boolean equals(BrasherBryanProject10_MyString other) {
        // if different length, false
        if (this.length() != other.length()) {
            return false;
        }
        // else must be identical for each index
        // e.g. this.data[i] == other.data[i] for all i
        else {
            for (int i = 0; i < this.length(); i++) {
                if(other.charAt(i) != this.data[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // returns MyString object whose data member
    // contains the individual base-10 representations
    // of int i e.g,, 10423 becomes {'1','0','4','2','3'}
   public static BrasherBryanProject10_MyString valueOf(int i) {
        //first need to determine "length" of i
        //while preserving the value of i
       int intCount = 0;
       int tempi = i;
       while(tempi > 0) {
           tempi /= 10;
           intCount++;
       }
       //create int array to hold individual numbers of i
       int[] intArr = new int[intCount];

       //fill int array with individual digits of i
       for (int j = 0; j < intCount; j++) {
           intArr[j] = i % 10;
           i /= 10;
       }

       // fill a char array with members of intArr
       char[] intCharArr = new char[intCount];
       int charCount = 0;  // needed to cycle up through char array
       for (int j = intCount -1; j >= 0 ; j--) {
           intCharArr[charCount] = (char)(intArr[j] + 48); //convert int to char
           charCount++;
       }

       return new BrasherBryanProject10_MyString(intCharArr);

   }

   // getter function
   public char[] getData() {
        return this.data;
   }

}
