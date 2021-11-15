public class TwoNotTouch {

    //***
    //*** You MUST use this code.
    //*** You CANNOT CHANGE any of it
    //***
    final static int ONE_STAR_NUMBER_CAGES = 8;
    final static int TWO_STAR_NUMBER_CAGES = 10;
    final static char STAR = '*';
    final static int CHAR_POS = 0;
    final static int CAGE_POS = 1;
    final static int ASCII_NUM_INDEX = 48;

    final static int ERROR_CODE_VALID = 0;
    final static int ERROR_CODE_INCORRECT_ROW_COUNT = 1;
    final static int ERROR_CODE_INCORRECT_COLUMN_COUNT = 2;
    final static int ERROR_CODE_INCORRECT_CAGE_COUNT = 3;
    final static int ERROR_CODE_HORIZONTAL_CONTACT = 4;
    final static int ERROR_CODE_VERTICAL_CONTACT = 5;
    final static int ERROR_CODE_DIAGONAL_CONTACT = 6;
    //***
    //***
    //***

    public static void main(String[] args) {

        //***
        //*** You MUST use this code.
        //*** You CANNOT CHANGE any of it.
        //***

        //*** This is a valid one-star solution.
        char[][][] oneStarGridValid1 = {
                {{' ', '0'}, {' ', '0'}, {' ', '1'}, {' ', '2'}, {' ', '3'}, {' ', '4'}, {STAR, '4'}, {' ', '4'}},
                {{' ', '0'}, {' ', '0'}, {STAR, '1'}, {' ', '2'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}},
                {{STAR, '0'}, {' ', '0'}, {' ', '2'}, {' ', '2'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}},
                {{' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '2'}, {STAR, '2'}, {' ', '3'}, {' ', '3'}, {' ', '3'}},
                {{' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {' ', '6'}, {' ', '3'}, {STAR, '3'}},
                {{' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {STAR, '6'}, {' ', '3'}, {' ', '3'}},
                {{' ', '7'}, {' ', '7'}, {' ', '5'}, {STAR, '5'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}},
                {{' ', '7'}, {STAR, '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}}};

        //*** This is a valid one-star solution.
        char[][][] oneStarGridValid2 = {
                {{STAR, '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '1'}, {' ', '1'}, {' ', '1'}, {' ', '1'}},
                {{' ', '0'}, {' ', '0'}, {' ', '0'}, {STAR, '1'}, {' ', '1'}, {' ', '1'}, {' ', '2'}, {' ', '2'}},
                {{' ', '0'}, {' ', '0'}, {' ', '3'}, {' ', '3'}, {' ', '1'}, {STAR, '2'}, {' ', '2'}, {' ', '2'}},
                {{' ', '0'}, {STAR, '3'}, {' ', '3'}, {' ', '3'}, {' ', '1'}, {' ', '2'}, {' ', '2'}, {' ', '4'}},
                {{' ', '0'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '1'}, {' ', '2'}, {' ', '2'}, {STAR, '4'}},
                {{' ', '0'}, {' ', '3'}, {STAR, '5'}, {' ', '1'}, {' ', '1'}, {' ', '6'}, {' ', '6'}, {' ', '6'}},
                {{' ', '0'}, {' ', '3'}, {' ', '5'}, {' ', '1'}, {STAR, '6'}, {' ', '6'}, {' ', '7'}, {' ', '6'}},
                {{' ', '0'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '6'}, {STAR, '7'}, {' ', '6'}}};

        //*** This is an invalid one-star solution that contains incorrect row counts.
        char[][][] oneStarGridInvalidRow = {
                {{' ', '0'}, {' ', '0'}, {STAR, '1'}, {' ', '2'}, {' ', '3'}, {' ', '4'}, {STAR, '4'}, {' ', '4'}},
                {{' ', '0'}, {' ', '0'}, {' ', '1'}, {' ', '2'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}},
                {{STAR, '0'}, {' ', '0'}, {' ', '2'}, {' ', '2'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}},
                {{' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '2'}, {STAR, '2'}, {' ', '3'}, {' ', '3'}, {' ', '3'}},
                {{' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {' ', '6'}, {' ', '3'}, {STAR, '3'}},
                {{' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {STAR, '6'}, {' ', '3'}, {' ', '3'}},
                {{' ', '7'}, {' ', '7'}, {' ', '5'}, {STAR, '5'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}},
                {{' ', '7'}, {STAR, '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}}};

        //*** This is an invalid one-star solution that contains incorrect column counts.
        char[][][] oneStarGridInvalidColumn = {
                {{' ', '0'}, {' ', '0'}, {' ', '1'}, {' ', '2'}, {STAR, '3'}, {' ', '4'}, {' ', '4'}, {' ', '4'}},
                {{' ', '0'}, {' ', '0'}, {STAR, '1'}, {' ', '2'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}},
                {{STAR, '0'}, {' ', '0'}, {' ', '2'}, {' ', '2'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}},
                {{' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '2'}, {STAR, '2'}, {' ', '3'}, {' ', '3'}, {' ', '3'}},
                {{' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {' ', '6'}, {' ', '3'}, {STAR, '3'}},
                {{' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {STAR, '6'}, {' ', '3'}, {' ', '3'}},
                {{' ', '7'}, {' ', '7'}, {' ', '5'}, {STAR, '5'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}},
                {{' ', '7'}, {STAR, '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}}};

        //*** This is an invalid one-star solution that contains direct contact between stars diagonally.
        char[][][] oneStarGridInValidDiagonal = {
                {{' ', '0'}, {' ', '0'}, {' ', '1'}, {' ', '2'}, {' ', '3'}, {' ', '4'}, {STAR, '4'}, {' ', '4'}},
                {{' ', '0'}, {' ', '0'}, {STAR, '1'}, {' ', '2'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}},
                {{STAR, '0'}, {' ', '0'}, {' ', '2'}, {' ', '2'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}},
                {{' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '2'}, {STAR, '2'}, {' ', '3'}, {' ', '3'}, {' ', '3'}},
                {{' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {STAR, '6'}, {' ', '3'}, {' ', '3'}},
                {{' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {' ', '6'}, {' ', '3'}, {STAR, '3'}},
                {{' ', '7'}, {' ', '7'}, {' ', '5'}, {STAR, '5'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}},
                {{' ', '7'}, {STAR, '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}}};

        //*** This is an invalid one-star solution that contains incorrect cage counts.
        char[][][] oneStarGridInvalidCageOnly = {
                {{' ', '0'}, {' ', '0'}, {' ', '1'}, {' ', '2'}, {STAR, '3'}, {' ', '4'}, {' ', '4'}, {' ', '4'}},
                {{' ', '0'}, {' ', '0'}, {STAR, '1'}, {' ', '2'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}},
                {{STAR, '0'}, {' ', '0'}, {' ', '2'}, {' ', '2'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}},
                {{' ', '0'}, {' ', '0'}, {' ', '0'}, {STAR, '2'}, {' ', '2'}, {' ', '3'}, {' ', '3'}, {' ', '3'}},
                {{' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {' ', '6'}, {' ', '3'}, {STAR, '3'}},
                {{' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {STAR, '6'}, {' ', '3'}, {' ', '3'}},
                {{' ', '7'}, {STAR, '7'}, {' ', '5'}, {' ', '5'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}},
                {{' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {STAR, '7'}, {' ', '7'}}};

        //*** This is a valid two-star solution.
        char[][][] twoStarGridValid1 = {
                {{' ', '0'}, {STAR, '0'}, {' ', '0'}, {' ', '0'}, {STAR, '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '1'}, {' ', '1'}},
                {{' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {STAR, '2'}, {' ', '0'}, {STAR, '1'}, {' ', '1'}},
                {{' ', '3'}, {STAR, '4'}, {' ', '4'}, {STAR, '4'}, {' ', '0'}, {' ', '2'}, {' ', '2'}, {' ', '2'}, {' ', '1'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '5'}, {' ', '6'}, {' ', '6'}, {STAR, '2'}, {' ', '1'}, {STAR, '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {STAR, '5'}, {' ', '5'}, {STAR, '5'}, {' ', '6'}, {' ', '6'}, {' ', '1'}, {' ', '1'}},
                {{STAR, '3'}, {' ', '3'}, {' ', '7'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {STAR, '6'}, {' ', '1'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {STAR, '7'}, {' ', '7'}, {STAR, '7'}, {' ', '6'}, {' ', '6'}, {' ', '6'}, {' ', '8'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {STAR, '6'}, {' ', '6'}, {STAR, '8'}, {' ', '1'}},
                {{STAR, '3'}, {' ', '9'}, {STAR, '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '8'}, {' ', '8'}},
                {{' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {STAR, '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {STAR, '8'}}};

        //*** This is a valid two-star solution.
        char[][][] twoStarGridValid2 = {
                {{' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {STAR, '0'}, {' ', '0'}, {' ', '1'}, {STAR, '1'}, {' ', '1'}, {' ', '1'}},
                {{' ', '0'}, {STAR, '2'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '1'}, {' ', '1'}, {STAR, '3'}},
                {{' ', '0'}, {' ', '2'}, {' ', '2'}, {STAR, '0'}, {' ', '0'}, {STAR, '1'}, {' ', '1'}, {' ', '1'}, {' ', '3'}, {' ', '3'}},
                {{' ', '4'}, {STAR, '2'}, {' ', '5'}, {' ', '5'}, {' ', '0'}, {' ', '1'}, {' ', '1'}, {' ', '1'}, {STAR, '3'}, {' ', '3'}},
                {{' ', '4'}, {' ', '4'}, {' ', '5'}, {STAR, '5'}, {' ', '5'}, {STAR, '6'}, {' ', '6'}, {' ', '6'}, {' ', '6'}, {' ', '6'}},
                {{STAR, '4'}, {' ', '4'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {STAR, '6'}, {' ', '6'}, {' ', '6'}},
                {{' ', '4'}, {' ', '4'}, {STAR, '5'}, {' ', '5'}, {STAR, '7'}, {' ', '7'}, {' ', '6'}, {' ', '6'}, {' ', '6'}, {' ', '6'}},
                {{' ', '4'}, {' ', '4'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '7'}, {STAR, '8'}, {' ', '6'}, {' ', '6'}, {STAR, '9'}},
                {{STAR, '4'}, {' ', '4'}, {STAR, '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '8'}, {' ', '9'}, {' ', '9'}, {' ', '9'}},
                {{' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {STAR, '8'}, {' ', '8'}, {STAR, '9'}, {' ', '9'}}};

        //*** This is an invalid two-star solution that contains incorrect row counts.
        char[][][] twoStarGridInvalidRow = {
                {{' ', '0'}, {STAR, '0'}, {' ', '0'}, {' ', '0'}, {STAR, '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {STAR, '1'}, {' ', '1'}},
                {{' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {STAR, '2'}, {' ', '0'}, {' ', '1'}, {' ', '1'}},
                {{' ', '3'}, {STAR, '4'}, {' ', '4'}, {STAR, '4'}, {' ', '0'}, {' ', '2'}, {' ', '2'}, {' ', '2'}, {' ', '1'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '5'}, {' ', '6'}, {' ', '6'}, {STAR, '2'}, {' ', '1'}, {STAR, '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {STAR, '5'}, {' ', '5'}, {STAR, '5'}, {' ', '6'}, {' ', '6'}, {' ', '1'}, {' ', '1'}},
                {{STAR, '3'}, {' ', '3'}, {' ', '7'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {STAR, '6'}, {' ', '1'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {STAR, '7'}, {' ', '7'}, {STAR, '7'}, {' ', '6'}, {' ', '6'}, {' ', '6'}, {' ', '8'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {STAR, '6'}, {' ', '6'}, {STAR, '8'}, {' ', '1'}},
                {{STAR, '3'}, {' ', '9'}, {STAR, '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '8'}, {' ', '8'}},
                {{' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {STAR, '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {STAR, '8'}}};

        //*** This is an invalid two-star solution that contains incorrect column counts.
        char[][][] twoStarGridInvalidColumn = {
                {{' ', '0'}, {STAR, '0'}, {' ', '0'}, {' ', '0'}, {STAR, '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '1'}, {' ', '1'}},
                {{' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {STAR, '2'}, {' ', '0'}, {' ', '1'}, {STAR, '1'}},
                {{' ', '3'}, {STAR, '4'}, {' ', '4'}, {STAR, '4'}, {' ', '0'}, {' ', '2'}, {' ', '2'}, {' ', '2'}, {' ', '1'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '5'}, {' ', '6'}, {' ', '6'}, {STAR, '2'}, {' ', '1'}, {STAR, '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {STAR, '5'}, {' ', '5'}, {STAR, '5'}, {' ', '6'}, {' ', '6'}, {' ', '1'}, {' ', '1'}},
                {{STAR, '3'}, {' ', '3'}, {' ', '7'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {STAR, '6'}, {' ', '1'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {STAR, '7'}, {' ', '7'}, {STAR, '7'}, {' ', '6'}, {' ', '6'}, {' ', '6'}, {' ', '8'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {STAR, '6'}, {' ', '6'}, {STAR, '8'}, {' ', '1'}},
                {{STAR, '3'}, {' ', '9'}, {STAR, '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '8'}, {' ', '8'}},
                {{' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {STAR, '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {STAR, '8'}}};

        //*** This is an invalid two-star solution that contains direct contact between stars horizontally (left and/or right).
        char[][][] twoStarGridInvalidHorizontal = {
                {{' ', '0'}, {' ', '0'}, {' ', '0'}, {STAR, '0'}, {STAR, '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '1'}, {' ', '1'}},
                {{' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {STAR, '2'}, {' ', '0'}, {STAR, '1'}, {' ', '1'}},
                {{' ', '3'}, {STAR, '4'}, {STAR, '4'}, {' ', '4'}, {' ', '0'}, {' ', '2'}, {' ', '2'}, {' ', '2'}, {' ', '1'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '5'}, {' ', '6'}, {' ', '6'}, {STAR, '2'}, {' ', '1'}, {STAR, '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {STAR, '5'}, {' ', '5'}, {STAR, '5'}, {' ', '6'}, {' ', '6'}, {' ', '1'}, {' ', '1'}},
                {{STAR, '3'}, {' ', '3'}, {' ', '7'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {STAR, '6'}, {' ', '1'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {STAR, '7'}, {' ', '7'}, {STAR, '7'}, {' ', '6'}, {' ', '6'}, {' ', '6'}, {' ', '8'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {STAR, '6'}, {' ', '6'}, {STAR, '8'}, {' ', '1'}},
                {{STAR, '3'}, {STAR, '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '8'}, {' ', '8'}},
                {{' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {STAR, '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {STAR, '8'}}};

        //*** This is an invalid two-star solution that contains direct contact between stars vertically (up and/or down).
        char[][][] twoStarGridInvalidVertical = {
                {{' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {STAR, '0'}, {' ', '0'}, {' ', '1'}, {STAR, '1'}, {' ', '1'}, {' ', '1'}},
                {{' ', '0'}, {STAR, '2'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '1'}, {' ', '1'}, {STAR, '3'}},
                {{' ', '0'}, {STAR, '2'}, {' ', '2'}, {STAR, '0'}, {' ', '0'}, {' ', '1'}, {' ', '1'}, {' ', '1'}, {' ', '3'}, {' ', '3'}},
                {{' ', '4'}, {' ', '2'}, {' ', '5'}, {' ', '5'}, {' ', '0'}, {STAR, '1'}, {' ', '1'}, {' ', '1'}, {STAR, '3'}, {' ', '3'}},
                {{' ', '4'}, {' ', '4'}, {' ', '5'}, {STAR, '5'}, {' ', '5'}, {STAR, '6'}, {' ', '6'}, {' ', '6'}, {' ', '6'}, {' ', '6'}},
                {{STAR, '4'}, {' ', '4'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {STAR, '6'}, {' ', '6'}, {' ', '6'}},
                {{' ', '4'}, {' ', '4'}, {STAR, '5'}, {' ', '5'}, {STAR, '7'}, {' ', '7'}, {' ', '6'}, {' ', '6'}, {' ', '6'}, {' ', '6'}},
                {{' ', '4'}, {' ', '4'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '7'}, {STAR, '8'}, {' ', '6'}, {' ', '6'}, {STAR, '9'}},
                {{STAR, '4'}, {' ', '4'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {STAR, '8'}, {' ', '9'}, {' ', '9'}, {' ', '9'}},
                {{' ', '7'}, {' ', '7'}, {STAR, '7'}, {' ', '7'}, {' ', '7'}, {' ', '7'}, {' ', '8'}, {' ', '8'}, {STAR, '9'}, {' ', '9'}}};

        //*** This is an invalid two-star solution that contains direct contact between stars diagonally.
        char[][][] twoStarGridInValidDiagonal = {
                {{' ', '0'}, {STAR, '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {STAR, '1'}, {' ', '1'}},
                {{' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {STAR, '0'}, {' ', '0'}, {STAR, '2'}, {' ', '0'}, {' ', '1'}, {' ', '1'}},
                {{' ', '3'}, {STAR, '4'}, {' ', '4'}, {STAR, '4'}, {' ', '0'}, {' ', '2'}, {' ', '2'}, {' ', '2'}, {' ', '1'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '5'}, {' ', '6'}, {' ', '6'}, {STAR, '2'}, {' ', '1'}, {STAR, '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {STAR, '5'}, {' ', '5'}, {STAR, '5'}, {' ', '6'}, {' ', '6'}, {' ', '1'}, {' ', '1'}},
                {{STAR, '3'}, {' ', '3'}, {' ', '7'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {STAR, '6'}, {' ', '1'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {STAR, '7'}, {' ', '7'}, {STAR, '7'}, {' ', '6'}, {' ', '6'}, {' ', '6'}, {' ', '8'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {STAR, '6'}, {' ', '6'}, {STAR, '8'}, {' ', '1'}},
                {{STAR, '3'}, {' ', '9'}, {STAR, '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '8'}, {' ', '8'}},
                {{' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {STAR, '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {STAR, '8'}}};

        //*** This is an invalid two-star solution that contains incorrect cage counts.
        char[][][] twoStarGridInvalidCageOnly = {
                {{' ', '0'}, {STAR, '0'}, {' ', '0'}, {' ', '0'}, {STAR, '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '1'}, {' ', '1'}},
                {{' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {' ', '0'}, {STAR, '2'}, {' ', '0'}, {STAR, '1'}, {' ', '1'}},
                {{' ', '3'}, {STAR, '4'}, {' ', '4'}, {STAR, '4'}, {' ', '0'}, {' ', '2'}, {' ', '2'}, {' ', '2'}, {' ', '1'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '5'}, {STAR, '6'}, {' ', '6'}, {STAR, '2'}, {' ', '1'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {STAR, '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {' ', '6'}, {' ', '1'}, {STAR, '1'}},
                {{STAR, '3'}, {' ', '3'}, {' ', '7'}, {' ', '5'}, {' ', '5'}, {' ', '5'}, {' ', '6'}, {STAR, '6'}, {' ', '1'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {STAR, '7'}, {' ', '7'}, {STAR, '7'}, {' ', '6'}, {' ', '6'}, {' ', '6'}, {' ', '8'}, {' ', '1'}},
                {{' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {' ', '3'}, {STAR, '6'}, {' ', '6'}, {STAR, '8'}, {' ', '1'}},
                {{STAR, '3'}, {' ', '9'}, {STAR, '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '8'}, {' ', '8'}},
                {{' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {STAR, '9'}, {' ', '9'}, {' ', '9'}, {' ', '9'}, {STAR, '8'}}};
        //***
        //***
        //***

        //***
        //*** You MUST use this code.
        //*** The only change that you can make is which
        //***     char grid is passed to the methods.
        //*** For example: oneStarGridInvalidCageOnly or twoStarGridInvalidCageOnly as used below.
        //***


        gridPrint(oneStarGridInvalidRow);
        System.out.println();

        processErrorCode(gridValid(oneStarGridInvalidRow, 1, ONE_STAR_NUMBER_CAGES));

        gridPrint(twoStarGridInvalidRow);
        System.out.println();

        processErrorCode(gridValid(twoStarGridInvalidRow, 2, TWO_STAR_NUMBER_CAGES));


        gridPrint(oneStarGridInvalidColumn);
        System.out.println();

        processErrorCode(gridValid(oneStarGridInvalidColumn, 1, ONE_STAR_NUMBER_CAGES));

        gridPrint(twoStarGridInvalidColumn);
        System.out.println();

        processErrorCode(gridValid(twoStarGridInvalidColumn, 2, TWO_STAR_NUMBER_CAGES));

        gridPrint(twoStarGridInvalidHorizontal);
        System.out.println();
        processErrorCode(gridValid(twoStarGridInvalidHorizontal, 2, TWO_STAR_NUMBER_CAGES));

        gridPrint(twoStarGridInvalidVertical);
        System.out.println();
        processErrorCode(gridValid(twoStarGridInvalidVertical, 2, TWO_STAR_NUMBER_CAGES));


        gridPrint(twoStarGridInValidDiagonal);
        System.out.println();
        processErrorCode(gridValid(twoStarGridInValidDiagonal, 2, TWO_STAR_NUMBER_CAGES));

        gridPrint(oneStarGridInValidDiagonal);
        System.out.println();

        processErrorCode(gridValid(oneStarGridInValidDiagonal, 1, ONE_STAR_NUMBER_CAGES));

        // Failing ln 409 possible method issues?
        gridPrint(twoStarGridValid1);
        System.out.println();
        processErrorCode(gridValid(twoStarGridValid1, 2, TWO_STAR_NUMBER_CAGES));

        // Also will fail if valid solution is commented out
        gridPrint(twoStarGridInvalidCageOnly);
        System.out.println();
        processErrorCode(gridValid(twoStarGridInvalidCageOnly, 2, TWO_STAR_NUMBER_CAGES));




        //***
        //***
        //***
    }

    //***
    //*** You MUST use this code.
    //*** You CANNOT CHANGE any of it.
    //***
    //*** The numbers in the displayed grid represent the "cages".
    //*** All cells with the same number are in the same cage.
    //*** In other words, all cells with the number 0 are in the same
    //***    cage, all cells with the number 1 are in the same cage,
    //***    and so on.
    //***
    //*** The asterisks represent the cell in which a star is placed.
    //***
    public static void gridPrint(char[][][] grid) {

        System.out.println();
        System.out.print("\t");

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j][CHAR_POS] + "" + grid[i][j][CAGE_POS] + "\t");
            }

            System.out.println();
            System.out.print("\t");
        }
    }

    //***
    //*** You MUST use this code.
    //*** You CANNOT CHANGE any of it.
    //***
    public static void processErrorCode(int errorCode) {
        switch (errorCode) {
            case ERROR_CODE_VALID:
                System.out.println("This is a valid Star Battle solution.");
                break;
            case ERROR_CODE_INCORRECT_ROW_COUNT:
                System.out.println("This is an invalid Star Battle solution. There is an incorrect row count.");
                break;
            case ERROR_CODE_INCORRECT_COLUMN_COUNT:
                System.out.println("This is an invalid Star Battle solution. There is an incorrect column count.");
                break;
            case ERROR_CODE_INCORRECT_CAGE_COUNT:
                System.out.println("This is an invalid Star Battle solution. There is an incorrect cage count.");
                break;
            case ERROR_CODE_HORIZONTAL_CONTACT:
                System.out.println("This is an invalid Star Battle solution. Stars have direct horizontal contact.");
                break;
            case ERROR_CODE_VERTICAL_CONTACT:
                System.out.println("This is an invalid Star Battle solution. Stars have direct vertical contact.");
                break;
            case ERROR_CODE_DIAGONAL_CONTACT:
                System.out.println("This is an invalid Star Battle solution. Stars have direct diagonal contact.");
                break;
        }
    }

    //***
    //*** You MUST use this code.
    //*** You CANNOT CHANGE the parameter list.
    //***
    //*** You MUST make the appropriate code additions.
    //***
    public static int gridValid(char[][][] grid, int stars, int numberCages) {

        //***
        //*** You MUST use this code.
        //***
        int errorCode = ERROR_CODE_VALID;
        int[] cageCount = new int[numberCages];
        //***
        //***
        //***

        //***
        //*** If you want to use my skeleton nested while-loops, then
        //***     you will need this code.
        //***
        int row = 0;
        int col = 0;
        boolean isValid = true;
        //***
        //***
        //***

        while (isValid && row < grid.length) {

            //***
            //*** Write code to check the constraint that there cannot be
            //***     more than parameter variable "stars" number of stars
            //***      in a given row.
            //***

            //*** If this constraint is violated, then set the variable
            //***     "errorCode" to ERROR_CODE_INCORRECT_ROW_COUNT
            /// Solved
            //***
            if (violatesNumberofStars(grid[row], stars)) {
                isValid = false;
                errorCode = ERROR_CODE_INCORRECT_ROW_COUNT;
                // error
            }

            while (isValid && col < grid[row].length) {



                //***
                //*** Write code to check the constraint that there cannot be
                //***     more than parameter variable "stars" number of stars
                //***      in a given column.
                //***
                //*** If this constraint is violated, then set the variable
                //***     "errorCode" to ERROR_CODE_INCORRECT_COLUMN_COUNT
                //***
                /// Solved
                // Create array of columns from grid
                char[][] column = getColumn(grid, col);
                // Pass function to determine column count
                if (violatesNumberofStars(column, stars)) {
                    isValid = false;
                    errorCode = ERROR_CODE_INCORRECT_COLUMN_COUNT;
                    // error
                }


                //***
                //*** Write code to check the constraint that there cannot be direct
                //***     contact between two stars horizontally (left or right).
                //***
                //*** If this constraint is violated, then set the variable
                //***     "errorCode" to ERROR_CODE_HORIZONTAL_CONTACT
                //*** SOLVED
                // If else statement for searching star positions diagonally.
                // Methods I have written are called to prevent index out of bound errors when checking the grid.

                // Create array containing grid for usage of hasStar method
                char[] entry = grid[row][col];
                if (hasStar(entry)) {
                    //Left
                    if (hasSpaceToLeft(grid, col) && hasStar(grid[row][col - 1])) {
                        isValid = false;
                        errorCode = ERROR_CODE_HORIZONTAL_CONTACT;
                    }
                    // Right

                    if (hasSpaceToRight(grid, col) && hasStar(grid[row][col + 1])) {
                        isValid = false;
                        errorCode = ERROR_CODE_HORIZONTAL_CONTACT;
                    }
                }


                //***
                //*** Write code to check the constraint that there cannot be direct
                //***     contact between two stars vertically (up or down).
                //***
                //*** If this constraint is violated, then set the variable
                //***     "errorCode" to ERROR_CODE_VERTICAL_CONTACT
                //*** SOLVED

                // If else statement for searching star positions vertically.
                // Methods I have written are called to prevent index out of bound errors when checking the grid.
                if (hasStar(entry)) {
                    //UP
                    if (hasSpaceUp(grid, row) && hasStar(grid[row - 1][col])) {
                        isValid = false;
                        errorCode = ERROR_CODE_VERTICAL_CONTACT;
                    }
                    // DOWN
                    if (hasSpaceBelow(grid, row) && hasStar(grid[row + 1][col])) {
                        isValid = false;
                        errorCode = ERROR_CODE_VERTICAL_CONTACT;
                    }

                }

                //***
                //*** Write code to check the constraint that there cannot be direct
                //***     contact between two stars in the four diagonal directions.
                //***
                //*** If this constraint is violated, then set the variable
                //***     "errorCode" to ERROR_CODE_DIAGONAL_CONTACT
                //*** SOLVED


                // If else statement for searching star positions diagonally.
                // Methods I have written are called to prevent index out of bound errors when checking the grid.
                if (hasStar(entry)) {
                    // Up to the left
                    if (hasSpaceUp(grid, row) && hasSpaceToLeft(grid, col) && hasStar(grid[row - 1][col - 1])) {
                        isValid = false;
                        errorCode = ERROR_CODE_DIAGONAL_CONTACT;
                    }
                    // UP to the right
                    else if (hasSpaceUp(grid, row) && hasSpaceToRight(grid, col) && hasStar(grid[row - 1][col + 1])) {
                        isValid = false;
                        errorCode = ERROR_CODE_DIAGONAL_CONTACT;
                    }
                    //Down to the right
                    else if (hasSpaceBelow(grid, row) && hasSpaceToRight(grid, col) && hasStar(grid[row + 1][col + 1])) {
                        isValid = false;
                        errorCode = ERROR_CODE_DIAGONAL_CONTACT;

                    }
                    //Down to the left
                    else if (hasSpaceBelow(grid, row) && hasSpaceToLeft(grid, col) && hasStar(grid[row + 1][col - 1])) {
                        isValid = false;
                        errorCode = ERROR_CODE_DIAGONAL_CONTACT;

                    }
                }

                // Accumulates the count of stars by cage and stores the numbers
                //     in the cageCount array to be processed outside this loop.
                if (grid[row][col][CHAR_POS] == STAR){
                    cageCount[grid[row][col][CAGE_POS] - ASCII_NUM_INDEX]++;
                }

                col++;



            }

            col = 0;
            row++;
        }

        // A valid solution must have exactly variable "stars" number of stars per cage.
        // Spins through the cageCount array and determines if each cage contains the
        //     correct number of stars.
        // If is does not contain the correct number of stars, then variable "errorCode"
        //     is set to the correct error code based upon the error code constants.
        if (isValid) {
            for (int i = 0; i < cageCount.length; i++) {
                if (cageCount[i] != stars) {
                    isValid = false;
                    errorCode = ERROR_CODE_INCORRECT_CAGE_COUNT;
                }
            }
        }

        return errorCode;
    }

    // Returns array of star positions
    private static boolean hasStar(char[] entry) {
        return entry[CHAR_POS] == STAR;
    }

    // Function to assist checking is there is a multitude of starts within grid.
    private static boolean violatesNumberofStars(char[][] toTest, int maxStars) {
        // Counter for stars
        int rowStars = 0;
        // step through each char[] and count stars
        for (char[] c : toTest) {
            if (hasStar(c)) {
                rowStars++;
            }
        }
        // Return rowstars if greater than max stars
        return rowStars > maxStars;
    }

    // Function for returning the columns within the grid for processing.
    // Reduces having to pass multiple for loops throughout the program.
    public static char[][] getColumn(char[][][] grid, int index) {
        char[][] column = new char[grid[0].length][grid[0][0].length];
        for (int i = 0; i < column.length; i++) {
            column[i] = grid[i][index];
        }
        return column;
    }


    // Current confusion should we not check left as column -1 and right as column +1
    // Up as row -1 and down as row +1? Currently it appears left and right is checked by rows

    // Function to determine if there is space right to the respective array position through rows
    public static boolean hasSpaceToRight(char[][][] grid, int row) {

        return row < grid[row].length;
    }

    // Determine if there is space left to the respective array position through rows
    public static boolean hasSpaceToLeft(char[][][] grid, int row) {

        return row != 0;
    }

    // Determine if there is space above the respective array position through columns
    public static boolean hasSpaceUp(char[][][] grid, int col) {

        return col != 0;
    }

    // Determine if there is space below the respective array position through columns
    public static boolean hasSpaceBelow(char[][][] grid, int col) {
        char[][] column1 = getColumn(grid, col);

        return col < column1.length;
    }


}