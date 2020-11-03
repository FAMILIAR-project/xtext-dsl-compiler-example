package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProjectModel"
    // InternalMyDsl.g:53:1: entryRuleProjectModel : ruleProjectModel EOF ;
    public final void entryRuleProjectModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleProjectModel EOF )
            // InternalMyDsl.g:55:1: ruleProjectModel EOF
            {
             before(grammarAccess.getProjectModelRule()); 
            pushFollow(FOLLOW_1);
            ruleProjectModel();

            state._fsp--;

             after(grammarAccess.getProjectModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProjectModel"


    // $ANTLR start "ruleProjectModel"
    // InternalMyDsl.g:62:1: ruleProjectModel : ( ( rule__ProjectModel__Group__0 ) ) ;
    public final void ruleProjectModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__ProjectModel__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__ProjectModel__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__ProjectModel__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__ProjectModel__Group__0 )
            {
             before(grammarAccess.getProjectModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__ProjectModel__Group__0 )
            // InternalMyDsl.g:69:4: rule__ProjectModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjectModel"


    // $ANTLR start "rule__ProjectModel__Group__0"
    // InternalMyDsl.g:77:1: rule__ProjectModel__Group__0 : rule__ProjectModel__Group__0__Impl rule__ProjectModel__Group__1 ;
    public final void rule__ProjectModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:81:1: ( rule__ProjectModel__Group__0__Impl rule__ProjectModel__Group__1 )
            // InternalMyDsl.g:82:2: rule__ProjectModel__Group__0__Impl rule__ProjectModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ProjectModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModel__Group__0"


    // $ANTLR start "rule__ProjectModel__Group__0__Impl"
    // InternalMyDsl.g:89:1: rule__ProjectModel__Group__0__Impl : ( 'import' ) ;
    public final void rule__ProjectModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:93:1: ( ( 'import' ) )
            // InternalMyDsl.g:94:1: ( 'import' )
            {
            // InternalMyDsl.g:94:1: ( 'import' )
            // InternalMyDsl.g:95:2: 'import'
            {
             before(grammarAccess.getProjectModelAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getProjectModelAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModel__Group__0__Impl"


    // $ANTLR start "rule__ProjectModel__Group__1"
    // InternalMyDsl.g:104:1: rule__ProjectModel__Group__1 : rule__ProjectModel__Group__1__Impl ;
    public final void rule__ProjectModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:108:1: ( rule__ProjectModel__Group__1__Impl )
            // InternalMyDsl.g:109:2: rule__ProjectModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModel__Group__1"


    // $ANTLR start "rule__ProjectModel__Group__1__Impl"
    // InternalMyDsl.g:115:1: rule__ProjectModel__Group__1__Impl : ( ( rule__ProjectModel__DataAssignment_1 ) ) ;
    public final void rule__ProjectModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:119:1: ( ( ( rule__ProjectModel__DataAssignment_1 ) ) )
            // InternalMyDsl.g:120:1: ( ( rule__ProjectModel__DataAssignment_1 ) )
            {
            // InternalMyDsl.g:120:1: ( ( rule__ProjectModel__DataAssignment_1 ) )
            // InternalMyDsl.g:121:2: ( rule__ProjectModel__DataAssignment_1 )
            {
             before(grammarAccess.getProjectModelAccess().getDataAssignment_1()); 
            // InternalMyDsl.g:122:2: ( rule__ProjectModel__DataAssignment_1 )
            // InternalMyDsl.g:122:3: rule__ProjectModel__DataAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModel__DataAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectModelAccess().getDataAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModel__Group__1__Impl"


    // $ANTLR start "rule__ProjectModel__DataAssignment_1"
    // InternalMyDsl.g:131:1: rule__ProjectModel__DataAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModel__DataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:135:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:136:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:136:2: ( RULE_STRING )
            // InternalMyDsl.g:137:3: RULE_STRING
            {
             before(grammarAccess.getProjectModelAccess().getDataSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectModelAccess().getDataSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModel__DataAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});

}