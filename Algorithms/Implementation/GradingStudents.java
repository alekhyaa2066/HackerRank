    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer>f=new ArrayList<>();
        for(int i=0;i<grades.size();i++){
            int y=grades.get(i);
            if(y>=38){
                int x=grades.get(i)%5;
                if(x>=3){
                    f.add(y+5-x);
                }
                else{
                    f.add(y);
                }
            }
            else{
                f.add(y);
            }
        }
        return f;
    }

}