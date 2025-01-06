public boolean Day4_Condition(int cigars, boolean isWeekend) {
    if(isWeekend==true){
      if(cigars>=40){
        return true;
      }
      else{
        return false;
      }
    }
    else{
      if(cigars>=40 && cigars<=60){
        return true;
      }
      else{
        return false;
      }
    }
  }
  