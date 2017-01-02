import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
	public static void main(String[] args) throws Exception{
		ANTLRInputStream input =new  ANTLRInputStream(System.in);
		MiniJavaLexer lexer =new MiniJavaLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MiniJavaParser parser =new MiniJavaParser(tokens);
		ParseTree tree = parser.goal();
		System.out.println(tree.toStringTree(parser));
	}

}
