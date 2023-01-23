class 383_Ransom_Note
 {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] arr1 = ransomNote.toCharArray();
        char[] arr2 = magazine.toCharArray();

        int count=0;

        for(int i=0; i<arr1.length; i++ )
        {
            boolean flag=false;
            for(int j=0; j<arr2.length && flag==false; j++){

                if(arr1[i]==arr2[j]){
                    ++count;
                    flag=true;
                    arr2[j]='*';
                }
            }
        }
        return count==ransomNote.length();
    }
}