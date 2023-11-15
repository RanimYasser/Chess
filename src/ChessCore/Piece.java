/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChessCore;

enum Color{
WHITE,BLACK;
}
enum PiecesType{
PAWN,BISHOP,KNIGHT,ROOK,QEEN,KING;
}
public abstract class Piece {
    Color color;
    
public abstract boolean isValidMove() ;


 
}
