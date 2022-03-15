package ai.gr64.Data.Statics;

public class TextStatics {
    // These variables are the characters being used in the TextUI
    public static final char whiteGIPF = 'W';
    public static final char whitePieces = 'w';
    public static final char blackGIPF = 'B';
    public static final char blackPieces = 'b';
    public static final char outerSpaces = 'o';
    public static final char emptySpaces = 'X';
    public static final char linearConnectors = '-';
    public static final char leftDiagConnect = '\\';
    public static final char rightDiagConnect = '/';
    public static final char space = ' ';


    public static final String messageP1 = "Please enter the outer node you wish to put your piece on and then which inner node you wish to push it to.\n";
    public static final String messageOuterNode = "Outer node: \nPress enter.";
    public static final String messageInnerNode = "Inner node: \nPress enter to end your turn.";
    public static final String warningInner = "You made an illegal move, you can't place a piece on an inner node. Please try again.";
    public static final String warningOuter = "You made an illegal move, you can't move a piece to an outer node. Please try again.";
    public static final String warningFilledRow = "You made an illegal move, you can't move a piece into a full row. Please try again.";
    public static final String warningCoordinates = "You did not enter a valid coordinate. Please try again.";
}