// Generated from Calculette.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculetteParser}.
 */
public interface CalculetteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalculetteParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalculetteParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#calcul}.
	 * @param ctx the parse tree
	 */
	void enterCalcul(CalculetteParser.CalculContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#calcul}.
	 * @param ctx the parse tree
	 */
	void exitCalcul(CalculetteParser.CalculContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CalculetteParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CalculetteParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(CalculetteParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(CalculetteParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculetteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculetteParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(CalculetteParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(CalculetteParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(CalculetteParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(CalculetteParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(CalculetteParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(CalculetteParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#bloc}.
	 * @param ctx the parse tree
	 */
	void enterBloc(CalculetteParser.BlocContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#bloc}.
	 * @param ctx the parse tree
	 */
	void exitBloc(CalculetteParser.BlocContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#bouclewhile}.
	 * @param ctx the parse tree
	 */
	void enterBouclewhile(CalculetteParser.BouclewhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#bouclewhile}.
	 * @param ctx the parse tree
	 */
	void exitBouclewhile(CalculetteParser.BouclewhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CalculetteParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CalculetteParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#operationRationelle}.
	 * @param ctx the parse tree
	 */
	void enterOperationRationelle(CalculetteParser.OperationRationelleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#operationRationelle}.
	 * @param ctx the parse tree
	 */
	void exitOperationRationelle(CalculetteParser.OperationRationelleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#branchements}.
	 * @param ctx the parse tree
	 */
	void enterBranchements(CalculetteParser.BranchementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#branchements}.
	 * @param ctx the parse tree
	 */
	void exitBranchements(CalculetteParser.BranchementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#boucleFor}.
	 * @param ctx the parse tree
	 */
	void enterBoucleFor(CalculetteParser.BoucleForContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#boucleFor}.
	 * @param ctx the parse tree
	 */
	void exitBoucleFor(CalculetteParser.BoucleForContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFinInstruction(CalculetteParser.FinInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFinInstruction(CalculetteParser.FinInstructionContext ctx);
}