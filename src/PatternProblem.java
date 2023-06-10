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


  // Hollow Pattern
  /*
   * Expected Output->  *****
                        *   *
                        *   *
                        *****
   *
   * */
   void hollowPatternProblem(int numberOfStars){

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

  // half pyramid Pattern
  /*
   * Expected Output->  *
                        **
                        ***
                        *****
   *
   * */
  void halfPyramidPatternProblem(int numberOfStars){
    for(int i=0; i<numberOfStars;i++){
      for(int j=0;j<i;j++){
        System.out.print("*");
      }
      System.out.println();

    }
  }

  // half pyramid Reverse Pattern
  /*
   * Expected Output->  ****
                        ***
                        **
                        *
   *
   * */
  void halfPyramidReversePatternProblem(int numberOfStars){

    // TODO: need to understand better of this logic pattern
    for(int i=numberOfStars; i>=1;i--){
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();

    }
  }


  // half Pyramid Inverted Pattern (rotated by 180 deg)
  /*
   * Expected Output->     *
                          **
                         ***
                        ****
   *
   * */
  void halfPyramidInvertedPatternProblem(int numberOfStars){

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


  // half pyramid Pattern with numbers
  /*
   * Expected Output->
                         1
                         12
                         123
                         1234
                         1235
   *
   * */
  void halfPyramidPatternWithNumbersProblem(int numberOfStars){

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
