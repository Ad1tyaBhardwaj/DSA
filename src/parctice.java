class practice {
    public boolean buddyStrings(String s, String goal) {
        String t = " ";
        t = t+s.charAt(1)+s.charAt(0);
        if(t == goal){
            return true;
        }
        else{
            return false;
        }
    }
}