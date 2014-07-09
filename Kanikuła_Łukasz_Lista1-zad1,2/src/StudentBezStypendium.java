    class StudentBezStypendium implements Predicate { 
        public boolean accept(Object s) {
           return ((Student)s).stypendium == 0;
        }
    } 
