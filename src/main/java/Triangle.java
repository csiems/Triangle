

public class Triangle {
  private int mSideOne;
  private int mSideTwo;
  private int mSideThree;

  public Triangle (int sideOne, int sideTwo, int sideThree){
    mSideOne = sideOne;
    mSideTwo = sideTwo;
    mSideThree = sideThree;
    }

    public int getSideOne(){
      return mSideOne;
    }

    public int getSideTwo(){
      return mSideTwo;
    }

    public int getSideThree(){
      return mSideThree;
    }

    public boolean isATriangle() {
        if ((mSideTwo + mSideThree > mSideOne) && (mSideOne + mSideThree > mSideTwo) && (mSideOne + mSideTwo > mSideThree)) {
          return true;
        } else {
          return false;
        }
    }

    public boolean isEquilateralTriangle() {
      if (mSideOne == mSideTwo && mSideOne == mSideThree && mSideTwo == mSideThree) {
        return true;
      } else {
        return false;
      }
    }

    public boolean isIsoscelesTriangle(){
      if (!isEquilateralTriangle()){
        if (mSideOne == mSideTwo || mSideOne == mSideThree || mSideTwo == mSideThree){
          return true;
        } else {
          return false;
        }
      } else {
        return false;
      }
    }

    public boolean isScaleneTriangle(){
      if (!isEquilateralTriangle() && !isIsoscelesTriangle()) {
        return true;
      } else {
        return false;
      }
    }

    public String whatTriangleType() {
      if (isATriangle()) {
        if (isEquilateralTriangle()) {
          return "equilateral";
        } else if (isIsoscelesTriangle()) {
          return "isosceles";
        } else {
          return "scalene";
        }
      } else {
      return "This is not a triangle!";
      }
    }
}
