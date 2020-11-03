package org.xtext.example.mydsl1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ProjectModel";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProjectModel"
    // InternalMyDsl.g:64:1: entryRuleProjectModel returns [EObject current=null] : iv_ruleProjectModel= ruleProjectModel EOF ;
    public final EObject entryRuleProjectModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectModel = null;


        try {
            // InternalMyDsl.g:64:53: (iv_ruleProjectModel= ruleProjectModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleProjectModel= ruleProjectModel EOF
            {
             newCompositeNode(grammarAccess.getProjectModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectModel=ruleProjectModel();

            state._fsp--;

             current =iv_ruleProjectModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProjectModel"


    // $ANTLR start "ruleProjectModel"
    // InternalMyDsl.g:71:1: ruleProjectModel returns [EObject current=null] : (otherlv_0= 'import' ( (lv_data_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleProjectModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_data_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'import' ( (lv_data_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'import' ( (lv_data_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'import' ( (lv_data_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:79:3: otherlv_0= 'import' ( (lv_data_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectModelAccess().getImportKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_data_1_0= RULE_STRING ) )
            // InternalMyDsl.g:84:4: (lv_data_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:84:4: (lv_data_1_0= RULE_STRING )
            // InternalMyDsl.g:85:5: lv_data_1_0= RULE_STRING
            {
            lv_data_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_data_1_0, grammarAccess.getProjectModelAccess().getDataSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"data",
            						lv_data_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjectModel"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});

}