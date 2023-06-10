public class PatternProblem {


  // Rectangle Pattern
  /*
   * Expected Output->  ****
                        ****
                        ****
                        ****
   *
   * */
  void solidRectanglePatternProblem(int numberOfStars){
    for(int i=0; i<numberOfStars;i++){     // i-> rows
      for(int j=0; j<numberOfStars;j++){   // j-> columns
        System.out.print("*");
      }
      System.out.println();
    }
  }


  // Hallow Pattern
  /*
   * Expected Output->  *****
                        *   *
                        *   *
                        *****
   *
   * */
   void hollowPatternProblems(int numberOfStars){

    // First Approach
    for(int i=0; i<4;i++){
      for(int j=0; j<numberOfStars;j++){
        if(i == 1 || i == 2){
          if( j == 1 || j==2 || j ==3){
            System.out.print(" ");
          }else{
            System.out.print("*");
          }
        }else{
          System.out.print("*");
        }
      }
      System.out.println();
    }

    // Second Approach
/*    for( int i = 0; i<4; i++){
      for(int j= 0 ; j<5;j++){
        if(i==0 || j ==0 || i==3 || j==4 ){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }*/

  }

  // pyramid Pattern
  /*
   * Expected Output->  *
                        **
                        ***
                        *****
   *
   * */
  void pyramidPatternProblems(int numberOfStars){
    for(int i=0; i<numberOfStars;i++){
      for(int j=0;j<i;j++){
        System.out.print("*");
      }
      System.out.println();

    }
  }

  // pyramid Pattern
  /*
   * Expected Output->  ****
                        ***
                        **
                        *
   *
   * */
  void pyramidReversePatternProblems(int numberOfStars){

    // TODO: need to understand better of this logic pattern
    for(int i=numberOfStars; i>=1;i--){
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();

    }
  }


  // pyramid Pattern
  /*
   * Expected Output->     *
                          **
                         ***
                        ****
   *
   * */
  void pyramidInvertedPatternProblems(int numberOfStars){

    // TODO: need to understand better of this logic pattern
    for(int i=0; i<numberOfStars;i++){

      for(int j=0;j<numberOfStars-i;j++){
        System.out.print(" ");
      }

      for(int j=0;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();

    }
  }

}
