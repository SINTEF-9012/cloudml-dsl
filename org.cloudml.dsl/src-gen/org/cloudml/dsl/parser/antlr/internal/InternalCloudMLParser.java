package org.cloudml.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.cloudml.dsl.services.CloudMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCloudMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'components'", "'{'", "'}'", "'instances'", "'provider'", "':'", "'vm'", "'external'", "'provided'", "'local'", "'internal'", "'required'", "'mandatory'", "'execution'", "'=>'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalCloudMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCloudMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCloudMLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g"; }



     	private CloudMLGrammarAccess grammarAccess;
     	
        public InternalCloudMLParser(TokenStream input, CloudMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CloudMLRoot";	
       	}
       	
       	@Override
       	protected CloudMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCloudMLRoot"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:67:1: entryRuleCloudMLRoot returns [EObject current=null] : iv_ruleCloudMLRoot= ruleCloudMLRoot EOF ;
    public final EObject entryRuleCloudMLRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloudMLRoot = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:68:2: (iv_ruleCloudMLRoot= ruleCloudMLRoot EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:69:2: iv_ruleCloudMLRoot= ruleCloudMLRoot EOF
            {
             newCompositeNode(grammarAccess.getCloudMLRootRule()); 
            pushFollow(FOLLOW_ruleCloudMLRoot_in_entryRuleCloudMLRoot75);
            iv_ruleCloudMLRoot=ruleCloudMLRoot();

            state._fsp--;

             current =iv_ruleCloudMLRoot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCloudMLRoot85); 

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
    // $ANTLR end "entryRuleCloudMLRoot"


    // $ANTLR start "ruleCloudMLRoot"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:76:1: ruleCloudMLRoot returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_providers_2_0= ruleProviderCS ) )* otherlv_3= 'components' otherlv_4= '{' ( ( (lv_vms_5_0= ruleVMCS ) ) | ( (lv_internalComponents_6_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_7_0= ruleExternalComponentCS ) ) )* ( (lv_relationships_8_0= ruleRelationshipCS ) )* otherlv_9= '}' otherlv_10= 'instances' otherlv_11= '{' ( ( (lv_componentInstances_12_0= ruleInternalComponentInstanceCS ) ) | ( (lv_componentInstances_13_0= ruleExternalComponentInstanceCS ) ) )* ( (lv_relationshipInstances_14_0= ruleRelationshipInstanceCS ) )* otherlv_15= '}' ) ;
    public final EObject ruleCloudMLRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        EObject lv_providers_2_0 = null;

        EObject lv_vms_5_0 = null;

        EObject lv_internalComponents_6_0 = null;

        EObject lv_externalComponents_7_0 = null;

        EObject lv_relationships_8_0 = null;

        EObject lv_componentInstances_12_0 = null;

        EObject lv_componentInstances_13_0 = null;

        EObject lv_relationshipInstances_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:79:28: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_providers_2_0= ruleProviderCS ) )* otherlv_3= 'components' otherlv_4= '{' ( ( (lv_vms_5_0= ruleVMCS ) ) | ( (lv_internalComponents_6_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_7_0= ruleExternalComponentCS ) ) )* ( (lv_relationships_8_0= ruleRelationshipCS ) )* otherlv_9= '}' otherlv_10= 'instances' otherlv_11= '{' ( ( (lv_componentInstances_12_0= ruleInternalComponentInstanceCS ) ) | ( (lv_componentInstances_13_0= ruleExternalComponentInstanceCS ) ) )* ( (lv_relationshipInstances_14_0= ruleRelationshipInstanceCS ) )* otherlv_15= '}' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_providers_2_0= ruleProviderCS ) )* otherlv_3= 'components' otherlv_4= '{' ( ( (lv_vms_5_0= ruleVMCS ) ) | ( (lv_internalComponents_6_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_7_0= ruleExternalComponentCS ) ) )* ( (lv_relationships_8_0= ruleRelationshipCS ) )* otherlv_9= '}' otherlv_10= 'instances' otherlv_11= '{' ( ( (lv_componentInstances_12_0= ruleInternalComponentInstanceCS ) ) | ( (lv_componentInstances_13_0= ruleExternalComponentInstanceCS ) ) )* ( (lv_relationshipInstances_14_0= ruleRelationshipInstanceCS ) )* otherlv_15= '}' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_providers_2_0= ruleProviderCS ) )* otherlv_3= 'components' otherlv_4= '{' ( ( (lv_vms_5_0= ruleVMCS ) ) | ( (lv_internalComponents_6_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_7_0= ruleExternalComponentCS ) ) )* ( (lv_relationships_8_0= ruleRelationshipCS ) )* otherlv_9= '}' otherlv_10= 'instances' otherlv_11= '{' ( ( (lv_componentInstances_12_0= ruleInternalComponentInstanceCS ) ) | ( (lv_componentInstances_13_0= ruleExternalComponentInstanceCS ) ) )* ( (lv_relationshipInstances_14_0= ruleRelationshipInstanceCS ) )* otherlv_15= '}' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:80:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_providers_2_0= ruleProviderCS ) )* otherlv_3= 'components' otherlv_4= '{' ( ( (lv_vms_5_0= ruleVMCS ) ) | ( (lv_internalComponents_6_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_7_0= ruleExternalComponentCS ) ) )* ( (lv_relationships_8_0= ruleRelationshipCS ) )* otherlv_9= '}' otherlv_10= 'instances' otherlv_11= '{' ( ( (lv_componentInstances_12_0= ruleInternalComponentInstanceCS ) ) | ( (lv_componentInstances_13_0= ruleExternalComponentInstanceCS ) ) )* ( (lv_relationshipInstances_14_0= ruleRelationshipInstanceCS ) )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleCloudMLRoot122); 

                	newLeafNode(otherlv_0, grammarAccess.getCloudMLRootAccess().getModelKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCloudMLRoot139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCloudMLRootAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCloudMLRootRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:102:2: ( (lv_providers_2_0= ruleProviderCS ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:103:1: (lv_providers_2_0= ruleProviderCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:103:1: (lv_providers_2_0= ruleProviderCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:104:3: lv_providers_2_0= ruleProviderCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getProvidersProviderCSParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProviderCS_in_ruleCloudMLRoot165);
            	    lv_providers_2_0=ruleProviderCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providers",
            	            		lv_providers_2_0, 
            	            		"ProviderCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleCloudMLRoot178); 

                	newLeafNode(otherlv_3, grammarAccess.getCloudMLRootAccess().getComponentsKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleCloudMLRoot190); 

                	newLeafNode(otherlv_4, grammarAccess.getCloudMLRootAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:128:1: ( ( (lv_vms_5_0= ruleVMCS ) ) | ( (lv_internalComponents_6_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_7_0= ruleExternalComponentCS ) ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt2=1;
                    }
                    break;
                case 22:
                    {
                    alt2=2;
                    }
                    break;
                case 19:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:128:2: ( (lv_vms_5_0= ruleVMCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:128:2: ( (lv_vms_5_0= ruleVMCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:129:1: (lv_vms_5_0= ruleVMCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:129:1: (lv_vms_5_0= ruleVMCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:130:3: lv_vms_5_0= ruleVMCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getVmsVMCSParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVMCS_in_ruleCloudMLRoot212);
            	    lv_vms_5_0=ruleVMCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"vms",
            	            		lv_vms_5_0, 
            	            		"VMCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:147:6: ( (lv_internalComponents_6_0= ruleInternalComponentCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:147:6: ( (lv_internalComponents_6_0= ruleInternalComponentCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:148:1: (lv_internalComponents_6_0= ruleInternalComponentCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:148:1: (lv_internalComponents_6_0= ruleInternalComponentCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:149:3: lv_internalComponents_6_0= ruleInternalComponentCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getInternalComponentsInternalComponentCSParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInternalComponentCS_in_ruleCloudMLRoot239);
            	    lv_internalComponents_6_0=ruleInternalComponentCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"internalComponents",
            	            		lv_internalComponents_6_0, 
            	            		"InternalComponentCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:166:6: ( (lv_externalComponents_7_0= ruleExternalComponentCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:166:6: ( (lv_externalComponents_7_0= ruleExternalComponentCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:167:1: (lv_externalComponents_7_0= ruleExternalComponentCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:167:1: (lv_externalComponents_7_0= ruleExternalComponentCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:168:3: lv_externalComponents_7_0= ruleExternalComponentCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getExternalComponentsExternalComponentCSParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExternalComponentCS_in_ruleCloudMLRoot266);
            	    lv_externalComponents_7_0=ruleExternalComponentCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"externalComponents",
            	            		lv_externalComponents_7_0, 
            	            		"ExternalComponentCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:184:4: ( (lv_relationships_8_0= ruleRelationshipCS ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:185:1: (lv_relationships_8_0= ruleRelationshipCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:185:1: (lv_relationships_8_0= ruleRelationshipCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:186:3: lv_relationships_8_0= ruleRelationshipCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getRelationshipsRelationshipCSParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationshipCS_in_ruleCloudMLRoot289);
            	    lv_relationships_8_0=ruleRelationshipCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"relationships",
            	            		lv_relationships_8_0, 
            	            		"RelationshipCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleCloudMLRoot302); 

                	newLeafNode(otherlv_9, grammarAccess.getCloudMLRootAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleCloudMLRoot314); 

                	newLeafNode(otherlv_10, grammarAccess.getCloudMLRootAccess().getInstancesKeyword_8());
                
            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleCloudMLRoot326); 

                	newLeafNode(otherlv_11, grammarAccess.getCloudMLRootAccess().getLeftCurlyBracketKeyword_9());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:214:1: ( ( (lv_componentInstances_12_0= ruleInternalComponentInstanceCS ) ) | ( (lv_componentInstances_13_0= ruleExternalComponentInstanceCS ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }
                else if ( (LA4_0==19) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:214:2: ( (lv_componentInstances_12_0= ruleInternalComponentInstanceCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:214:2: ( (lv_componentInstances_12_0= ruleInternalComponentInstanceCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:215:1: (lv_componentInstances_12_0= ruleInternalComponentInstanceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:215:1: (lv_componentInstances_12_0= ruleInternalComponentInstanceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:216:3: lv_componentInstances_12_0= ruleInternalComponentInstanceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getComponentInstancesInternalComponentInstanceCSParserRuleCall_10_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInternalComponentInstanceCS_in_ruleCloudMLRoot348);
            	    lv_componentInstances_12_0=ruleInternalComponentInstanceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"componentInstances",
            	            		lv_componentInstances_12_0, 
            	            		"InternalComponentInstanceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:233:6: ( (lv_componentInstances_13_0= ruleExternalComponentInstanceCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:233:6: ( (lv_componentInstances_13_0= ruleExternalComponentInstanceCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:234:1: (lv_componentInstances_13_0= ruleExternalComponentInstanceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:234:1: (lv_componentInstances_13_0= ruleExternalComponentInstanceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:235:3: lv_componentInstances_13_0= ruleExternalComponentInstanceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getComponentInstancesExternalComponentInstanceCSParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExternalComponentInstanceCS_in_ruleCloudMLRoot375);
            	    lv_componentInstances_13_0=ruleExternalComponentInstanceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"componentInstances",
            	            		lv_componentInstances_13_0, 
            	            		"ExternalComponentInstanceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:251:4: ( (lv_relationshipInstances_14_0= ruleRelationshipInstanceCS ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:252:1: (lv_relationshipInstances_14_0= ruleRelationshipInstanceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:252:1: (lv_relationshipInstances_14_0= ruleRelationshipInstanceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:253:3: lv_relationshipInstances_14_0= ruleRelationshipInstanceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getRelationshipInstancesRelationshipInstanceCSParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationshipInstanceCS_in_ruleCloudMLRoot398);
            	    lv_relationshipInstances_14_0=ruleRelationshipInstanceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"relationshipInstances",
            	            		lv_relationshipInstances_14_0, 
            	            		"RelationshipInstanceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleCloudMLRoot411); 

                	newLeafNode(otherlv_15, grammarAccess.getCloudMLRootAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleCloudMLRoot"


    // $ANTLR start "entryRuleProviderCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:281:1: entryRuleProviderCS returns [EObject current=null] : iv_ruleProviderCS= ruleProviderCS EOF ;
    public final EObject entryRuleProviderCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviderCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:282:2: (iv_ruleProviderCS= ruleProviderCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:283:2: iv_ruleProviderCS= ruleProviderCS EOF
            {
             newCompositeNode(grammarAccess.getProviderCSRule()); 
            pushFollow(FOLLOW_ruleProviderCS_in_entryRuleProviderCS447);
            iv_ruleProviderCS=ruleProviderCS();

            state._fsp--;

             current =iv_ruleProviderCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProviderCS457); 

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
    // $ANTLR end "entryRuleProviderCS"


    // $ANTLR start "ruleProviderCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:290:1: ruleProviderCS returns [EObject current=null] : (otherlv_0= 'provider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_credentials_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleProviderCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_credentials_3_0=null;

         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:293:28: ( (otherlv_0= 'provider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_credentials_3_0= RULE_STRING ) ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:294:1: (otherlv_0= 'provider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_credentials_3_0= RULE_STRING ) ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:294:1: (otherlv_0= 'provider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_credentials_3_0= RULE_STRING ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:294:3: otherlv_0= 'provider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_credentials_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleProviderCS494); 

                	newLeafNode(otherlv_0, grammarAccess.getProviderCSAccess().getProviderKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:298:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:299:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:299:1: (lv_name_1_0= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:300:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProviderCS511); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProviderCSAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProviderCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleProviderCS528); 

                	newLeafNode(otherlv_2, grammarAccess.getProviderCSAccess().getColonKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:320:1: ( (lv_credentials_3_0= RULE_STRING ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:321:1: (lv_credentials_3_0= RULE_STRING )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:321:1: (lv_credentials_3_0= RULE_STRING )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:322:3: lv_credentials_3_0= RULE_STRING
            {
            lv_credentials_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProviderCS545); 

            			newLeafNode(lv_credentials_3_0, grammarAccess.getProviderCSAccess().getCredentialsSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProviderCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"credentials",
                    		lv_credentials_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleProviderCS"


    // $ANTLR start "entryRuleVMCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:346:1: entryRuleVMCS returns [EObject current=null] : iv_ruleVMCS= ruleVMCS EOF ;
    public final EObject entryRuleVMCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:347:2: (iv_ruleVMCS= ruleVMCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:348:2: iv_ruleVMCS= ruleVMCS EOF
            {
             newCompositeNode(grammarAccess.getVMCSRule()); 
            pushFollow(FOLLOW_ruleVMCS_in_entryRuleVMCS586);
            iv_ruleVMCS=ruleVMCS();

            state._fsp--;

             current =iv_ruleVMCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVMCS596); 

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
    // $ANTLR end "entryRuleVMCS"


    // $ANTLR start "ruleVMCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:355:1: ruleVMCS returns [EObject current=null] : (otherlv_0= 'vm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_provided_3_0= ruleVMPortCS ) )* otherlv_4= '}' ) ;
    public final EObject ruleVMCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_provided_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:358:28: ( (otherlv_0= 'vm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_provided_3_0= ruleVMPortCS ) )* otherlv_4= '}' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:359:1: (otherlv_0= 'vm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_provided_3_0= ruleVMPortCS ) )* otherlv_4= '}' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:359:1: (otherlv_0= 'vm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_provided_3_0= ruleVMPortCS ) )* otherlv_4= '}' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:359:3: otherlv_0= 'vm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_provided_3_0= ruleVMPortCS ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleVMCS633); 

                	newLeafNode(otherlv_0, grammarAccess.getVMCSAccess().getVmKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:363:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:364:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:364:1: (lv_name_1_0= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:365:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVMCS650); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVMCSAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVMCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleVMCS667); 

                	newLeafNode(otherlv_2, grammarAccess.getVMCSAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:385:1: ( (lv_provided_3_0= ruleVMPortCS ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:386:1: (lv_provided_3_0= ruleVMPortCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:386:1: (lv_provided_3_0= ruleVMPortCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:387:3: lv_provided_3_0= ruleVMPortCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVMCSAccess().getProvidedVMPortCSParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVMPortCS_in_ruleVMCS688);
            	    lv_provided_3_0=ruleVMPortCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVMCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"provided",
            	            		lv_provided_3_0, 
            	            		"VMPortCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleVMCS701); 

                	newLeafNode(otherlv_4, grammarAccess.getVMCSAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleVMCS"


    // $ANTLR start "entryRuleVMPortCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:415:1: entryRuleVMPortCS returns [EObject current=null] : iv_ruleVMPortCS= ruleVMPortCS EOF ;
    public final EObject entryRuleVMPortCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMPortCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:416:2: (iv_ruleVMPortCS= ruleVMPortCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:417:2: iv_ruleVMPortCS= ruleVMPortCS EOF
            {
             newCompositeNode(grammarAccess.getVMPortCSRule()); 
            pushFollow(FOLLOW_ruleVMPortCS_in_entryRuleVMPortCS737);
            iv_ruleVMPortCS=ruleVMPortCS();

            state._fsp--;

             current =iv_ruleVMPortCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVMPortCS747); 

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
    // $ANTLR end "entryRuleVMPortCS"


    // $ANTLR start "ruleVMPortCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:424:1: ruleVMPortCS returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVMPortCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:427:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:428:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:428:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:429:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:429:1: (lv_name_0_0= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:430:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVMPortCS788); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVMPortCSAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVMPortCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleVMPortCS"


    // $ANTLR start "entryRuleExternalComponentCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:454:1: entryRuleExternalComponentCS returns [EObject current=null] : iv_ruleExternalComponentCS= ruleExternalComponentCS EOF ;
    public final EObject entryRuleExternalComponentCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalComponentCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:455:2: (iv_ruleExternalComponentCS= ruleExternalComponentCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:456:2: iv_ruleExternalComponentCS= ruleExternalComponentCS EOF
            {
             newCompositeNode(grammarAccess.getExternalComponentCSRule()); 
            pushFollow(FOLLOW_ruleExternalComponentCS_in_entryRuleExternalComponentCS828);
            iv_ruleExternalComponentCS=ruleExternalComponentCS();

            state._fsp--;

             current =iv_ruleExternalComponentCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalComponentCS838); 

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
    // $ANTLR end "entryRuleExternalComponentCS"


    // $ANTLR start "ruleExternalComponentCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:463:1: ruleExternalComponentCS returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )* otherlv_4= '}' ) ;
    public final EObject ruleExternalComponentCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_providedPorts_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:466:28: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )* otherlv_4= '}' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:467:1: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )* otherlv_4= '}' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:467:1: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )* otherlv_4= '}' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:467:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleExternalComponentCS875); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalComponentCSAccess().getExternalKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:471:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:472:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:472:1: (lv_name_1_0= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:473:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalComponentCS892); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExternalComponentCSAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalComponentCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleExternalComponentCS909); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalComponentCSAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:493:1: ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:494:1: (lv_providedPorts_3_0= ruleProvidedPortCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:494:1: (lv_providedPorts_3_0= ruleProvidedPortCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:495:3: lv_providedPorts_3_0= ruleProvidedPortCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExternalComponentCSAccess().getProvidedPortsProvidedPortCSParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProvidedPortCS_in_ruleExternalComponentCS930);
            	    lv_providedPorts_3_0=ruleProvidedPortCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExternalComponentCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providedPorts",
            	            		lv_providedPorts_3_0, 
            	            		"ProvidedPortCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleExternalComponentCS943); 

                	newLeafNode(otherlv_4, grammarAccess.getExternalComponentCSAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleExternalComponentCS"


    // $ANTLR start "entryRuleProvidedPortCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:523:1: entryRuleProvidedPortCS returns [EObject current=null] : iv_ruleProvidedPortCS= ruleProvidedPortCS EOF ;
    public final EObject entryRuleProvidedPortCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedPortCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:524:2: (iv_ruleProvidedPortCS= ruleProvidedPortCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:525:2: iv_ruleProvidedPortCS= ruleProvidedPortCS EOF
            {
             newCompositeNode(grammarAccess.getProvidedPortCSRule()); 
            pushFollow(FOLLOW_ruleProvidedPortCS_in_entryRuleProvidedPortCS979);
            iv_ruleProvidedPortCS=ruleProvidedPortCS();

            state._fsp--;

             current =iv_ruleProvidedPortCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedPortCS989); 

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
    // $ANTLR end "entryRuleProvidedPortCS"


    // $ANTLR start "ruleProvidedPortCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:532:1: ruleProvidedPortCS returns [EObject current=null] : (otherlv_0= 'provided' ( (lv_isLocal_1_0= 'local' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? ) ;
    public final EObject ruleProvidedPortCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isLocal_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:535:28: ( (otherlv_0= 'provided' ( (lv_isLocal_1_0= 'local' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:536:1: (otherlv_0= 'provided' ( (lv_isLocal_1_0= 'local' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:536:1: (otherlv_0= 'provided' ( (lv_isLocal_1_0= 'local' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:536:3: otherlv_0= 'provided' ( (lv_isLocal_1_0= 'local' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleProvidedPortCS1026); 

                	newLeafNode(otherlv_0, grammarAccess.getProvidedPortCSAccess().getProvidedKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:540:1: ( (lv_isLocal_1_0= 'local' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:541:1: (lv_isLocal_1_0= 'local' )
                    {
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:541:1: (lv_isLocal_1_0= 'local' )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:542:3: lv_isLocal_1_0= 'local'
                    {
                    lv_isLocal_1_0=(Token)match(input,21,FOLLOW_21_in_ruleProvidedPortCS1044); 

                            newLeafNode(lv_isLocal_1_0, grammarAccess.getProvidedPortCSAccess().getIsLocalLocalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProvidedPortCSRule());
                    	        }
                           		setWithLastConsumed(current, "isLocal", true, "local");
                    	    

                    }


                    }
                    break;

            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:555:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:556:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:556:1: (lv_name_2_0= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:557:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvidedPortCS1075); 

            			newLeafNode(lv_name_2_0, grammarAccess.getProvidedPortCSAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProvidedPortCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:573:2: ( (otherlv_3= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:574:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:574:1: (otherlv_3= RULE_ID )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:575:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getProvidedPortCSRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvidedPortCS1100); 

                    		newLeafNode(otherlv_3, grammarAccess.getProvidedPortCSAccess().getComponentComponentCrossReference_3_0()); 
                    	

                    }


                    }
                    break;

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
    // $ANTLR end "ruleProvidedPortCS"


    // $ANTLR start "entryRuleInternalComponentCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:594:1: entryRuleInternalComponentCS returns [EObject current=null] : iv_ruleInternalComponentCS= ruleInternalComponentCS EOF ;
    public final EObject entryRuleInternalComponentCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalComponentCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:595:2: (iv_ruleInternalComponentCS= ruleInternalComponentCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:596:2: iv_ruleInternalComponentCS= ruleInternalComponentCS EOF
            {
             newCompositeNode(grammarAccess.getInternalComponentCSRule()); 
            pushFollow(FOLLOW_ruleInternalComponentCS_in_entryRuleInternalComponentCS1137);
            iv_ruleInternalComponentCS=ruleInternalComponentCS();

            state._fsp--;

             current =iv_ruleInternalComponentCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalComponentCS1147); 

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
    // $ANTLR end "entryRuleInternalComponentCS"


    // $ANTLR start "ruleInternalComponentCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:603:1: ruleInternalComponentCS returns [EObject current=null] : (otherlv_0= 'internal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )* ( (lv_requiredPorts_4_0= ruleRequiredPortCS ) )* ( (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS ) ) otherlv_6= '}' ) ;
    public final EObject ruleInternalComponentCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_providedPorts_3_0 = null;

        EObject lv_requiredPorts_4_0 = null;

        EObject lv_requiredExecutionPlatform_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:606:28: ( (otherlv_0= 'internal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )* ( (lv_requiredPorts_4_0= ruleRequiredPortCS ) )* ( (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS ) ) otherlv_6= '}' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:607:1: (otherlv_0= 'internal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )* ( (lv_requiredPorts_4_0= ruleRequiredPortCS ) )* ( (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS ) ) otherlv_6= '}' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:607:1: (otherlv_0= 'internal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )* ( (lv_requiredPorts_4_0= ruleRequiredPortCS ) )* ( (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS ) ) otherlv_6= '}' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:607:3: otherlv_0= 'internal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )* ( (lv_requiredPorts_4_0= ruleRequiredPortCS ) )* ( (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleInternalComponentCS1184); 

                	newLeafNode(otherlv_0, grammarAccess.getInternalComponentCSAccess().getInternalKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:611:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:612:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:612:1: (lv_name_1_0= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:613:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInternalComponentCS1201); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInternalComponentCSAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInternalComponentCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleInternalComponentCS1218); 

                	newLeafNode(otherlv_2, grammarAccess.getInternalComponentCSAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:633:1: ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:634:1: (lv_providedPorts_3_0= ruleProvidedPortCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:634:1: (lv_providedPorts_3_0= ruleProvidedPortCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:635:3: lv_providedPorts_3_0= ruleProvidedPortCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getProvidedPortsProvidedPortCSParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProvidedPortCS_in_ruleInternalComponentCS1239);
            	    lv_providedPorts_3_0=ruleProvidedPortCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInternalComponentCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providedPorts",
            	            		lv_providedPorts_3_0, 
            	            		"ProvidedPortCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:651:3: ( (lv_requiredPorts_4_0= ruleRequiredPortCS ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:652:1: (lv_requiredPorts_4_0= ruleRequiredPortCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:652:1: (lv_requiredPorts_4_0= ruleRequiredPortCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:653:3: lv_requiredPorts_4_0= ruleRequiredPortCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getRequiredPortsRequiredPortCSParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequiredPortCS_in_ruleInternalComponentCS1261);
            	    lv_requiredPorts_4_0=ruleRequiredPortCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInternalComponentCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"requiredPorts",
            	            		lv_requiredPorts_4_0, 
            	            		"RequiredPortCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:669:3: ( (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:670:1: (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:670:1: (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:671:3: lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS
            {
             
            	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getRequiredExecutionPlatformRequiredExecutionPlatformCSParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleRequiredExecutionPlatformCS_in_ruleInternalComponentCS1283);
            lv_requiredExecutionPlatform_5_0=ruleRequiredExecutionPlatformCS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInternalComponentCSRule());
            	        }
                   		set(
                   			current, 
                   			"requiredExecutionPlatform",
                    		lv_requiredExecutionPlatform_5_0, 
                    		"RequiredExecutionPlatformCS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleInternalComponentCS1295); 

                	newLeafNode(otherlv_6, grammarAccess.getInternalComponentCSAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleInternalComponentCS"


    // $ANTLR start "entryRuleRequiredPortCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:699:1: entryRuleRequiredPortCS returns [EObject current=null] : iv_ruleRequiredPortCS= ruleRequiredPortCS EOF ;
    public final EObject entryRuleRequiredPortCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredPortCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:700:2: (iv_ruleRequiredPortCS= ruleRequiredPortCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:701:2: iv_ruleRequiredPortCS= ruleRequiredPortCS EOF
            {
             newCompositeNode(grammarAccess.getRequiredPortCSRule()); 
            pushFollow(FOLLOW_ruleRequiredPortCS_in_entryRuleRequiredPortCS1331);
            iv_ruleRequiredPortCS=ruleRequiredPortCS();

            state._fsp--;

             current =iv_ruleRequiredPortCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredPortCS1341); 

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
    // $ANTLR end "entryRuleRequiredPortCS"


    // $ANTLR start "ruleRequiredPortCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:708:1: ruleRequiredPortCS returns [EObject current=null] : (otherlv_0= 'required' ( (lv_isMandatory_1_0= 'mandatory' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? ) ;
    public final EObject ruleRequiredPortCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isMandatory_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:711:28: ( (otherlv_0= 'required' ( (lv_isMandatory_1_0= 'mandatory' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:712:1: (otherlv_0= 'required' ( (lv_isMandatory_1_0= 'mandatory' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:712:1: (otherlv_0= 'required' ( (lv_isMandatory_1_0= 'mandatory' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:712:3: otherlv_0= 'required' ( (lv_isMandatory_1_0= 'mandatory' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleRequiredPortCS1378); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiredPortCSAccess().getRequiredKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:716:1: ( (lv_isMandatory_1_0= 'mandatory' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:717:1: (lv_isMandatory_1_0= 'mandatory' )
                    {
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:717:1: (lv_isMandatory_1_0= 'mandatory' )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:718:3: lv_isMandatory_1_0= 'mandatory'
                    {
                    lv_isMandatory_1_0=(Token)match(input,24,FOLLOW_24_in_ruleRequiredPortCS1396); 

                            newLeafNode(lv_isMandatory_1_0, grammarAccess.getRequiredPortCSAccess().getIsMandatoryMandatoryKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequiredPortCSRule());
                    	        }
                           		setWithLastConsumed(current, "isMandatory", true, "mandatory");
                    	    

                    }


                    }
                    break;

            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:731:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:732:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:732:1: (lv_name_2_0= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:733:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredPortCS1427); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRequiredPortCSAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredPortCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:749:2: ( (otherlv_3= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:750:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:750:1: (otherlv_3= RULE_ID )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:751:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequiredPortCSRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredPortCS1452); 

                    		newLeafNode(otherlv_3, grammarAccess.getRequiredPortCSAccess().getComponentComponentCrossReference_3_0()); 
                    	

                    }


                    }
                    break;

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
    // $ANTLR end "ruleRequiredPortCS"


    // $ANTLR start "entryRuleRequiredExecutionPlatformCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:770:1: entryRuleRequiredExecutionPlatformCS returns [EObject current=null] : iv_ruleRequiredExecutionPlatformCS= ruleRequiredExecutionPlatformCS EOF ;
    public final EObject entryRuleRequiredExecutionPlatformCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredExecutionPlatformCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:771:2: (iv_ruleRequiredExecutionPlatformCS= ruleRequiredExecutionPlatformCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:772:2: iv_ruleRequiredExecutionPlatformCS= ruleRequiredExecutionPlatformCS EOF
            {
             newCompositeNode(grammarAccess.getRequiredExecutionPlatformCSRule()); 
            pushFollow(FOLLOW_ruleRequiredExecutionPlatformCS_in_entryRuleRequiredExecutionPlatformCS1489);
            iv_ruleRequiredExecutionPlatformCS=ruleRequiredExecutionPlatformCS();

            state._fsp--;

             current =iv_ruleRequiredExecutionPlatformCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredExecutionPlatformCS1499); 

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
    // $ANTLR end "entryRuleRequiredExecutionPlatformCS"


    // $ANTLR start "ruleRequiredExecutionPlatformCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:779:1: ruleRequiredExecutionPlatformCS returns [EObject current=null] : (otherlv_0= 'execution' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) ;
    public final EObject ruleRequiredExecutionPlatformCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:782:28: ( (otherlv_0= 'execution' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:783:1: (otherlv_0= 'execution' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:783:1: (otherlv_0= 'execution' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:783:3: otherlv_0= 'execution' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleRequiredExecutionPlatformCS1536); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiredExecutionPlatformCSAccess().getExecutionKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:787:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:788:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:788:1: (lv_name_1_0= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:789:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredExecutionPlatformCS1553); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRequiredExecutionPlatformCSAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredExecutionPlatformCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:805:2: ( (otherlv_2= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:806:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:806:1: (otherlv_2= RULE_ID )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:807:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequiredExecutionPlatformCSRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredExecutionPlatformCS1578); 

                    		newLeafNode(otherlv_2, grammarAccess.getRequiredExecutionPlatformCSAccess().getOwnerComponentCrossReference_2_0()); 
                    	

                    }


                    }
                    break;

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
    // $ANTLR end "ruleRequiredExecutionPlatformCS"


    // $ANTLR start "entryRuleRelationshipCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:826:1: entryRuleRelationshipCS returns [EObject current=null] : iv_ruleRelationshipCS= ruleRelationshipCS EOF ;
    public final EObject entryRuleRelationshipCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:827:2: (iv_ruleRelationshipCS= ruleRelationshipCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:828:2: iv_ruleRelationshipCS= ruleRelationshipCS EOF
            {
             newCompositeNode(grammarAccess.getRelationshipCSRule()); 
            pushFollow(FOLLOW_ruleRelationshipCS_in_entryRuleRelationshipCS1615);
            iv_ruleRelationshipCS=ruleRelationshipCS();

            state._fsp--;

             current =iv_ruleRelationshipCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationshipCS1625); 

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
    // $ANTLR end "entryRuleRelationshipCS"


    // $ANTLR start "ruleRelationshipCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:835:1: ruleRelationshipCS returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFqn ) ) otherlv_3= '=>' ( ( ruleFqn ) ) ) ;
    public final EObject ruleRelationshipCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:838:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFqn ) ) otherlv_3= '=>' ( ( ruleFqn ) ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:839:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFqn ) ) otherlv_3= '=>' ( ( ruleFqn ) ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:839:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFqn ) ) otherlv_3= '=>' ( ( ruleFqn ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:839:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFqn ) ) otherlv_3= '=>' ( ( ruleFqn ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:839:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:840:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:840:1: (lv_name_0_0= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:841:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationshipCS1667); 

            			newLeafNode(lv_name_0_0, grammarAccess.getRelationshipCSAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleRelationshipCS1684); 

                	newLeafNode(otherlv_1, grammarAccess.getRelationshipCSAccess().getColonKeyword_1());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:861:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:862:1: ( ruleFqn )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:862:1: ( ruleFqn )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:863:3: ruleFqn
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipCSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipCSAccess().getRequiredPortRequiredPortCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFqn_in_ruleRelationshipCS1707);
            ruleFqn();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleRelationshipCS1719); 

                	newLeafNode(otherlv_3, grammarAccess.getRelationshipCSAccess().getEqualsSignGreaterThanSignKeyword_3());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:880:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:881:1: ( ruleFqn )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:881:1: ( ruleFqn )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:882:3: ruleFqn
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipCSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipCSAccess().getProvidedPortProvidedPortCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFqn_in_ruleRelationshipCS1742);
            ruleFqn();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleRelationshipCS"


    // $ANTLR start "entryRuleExternalComponentInstanceCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:903:1: entryRuleExternalComponentInstanceCS returns [EObject current=null] : iv_ruleExternalComponentInstanceCS= ruleExternalComponentInstanceCS EOF ;
    public final EObject entryRuleExternalComponentInstanceCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalComponentInstanceCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:904:2: (iv_ruleExternalComponentInstanceCS= ruleExternalComponentInstanceCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:905:2: iv_ruleExternalComponentInstanceCS= ruleExternalComponentInstanceCS EOF
            {
             newCompositeNode(grammarAccess.getExternalComponentInstanceCSRule()); 
            pushFollow(FOLLOW_ruleExternalComponentInstanceCS_in_entryRuleExternalComponentInstanceCS1778);
            iv_ruleExternalComponentInstanceCS=ruleExternalComponentInstanceCS();

            state._fsp--;

             current =iv_ruleExternalComponentInstanceCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalComponentInstanceCS1788); 

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
    // $ANTLR end "entryRuleExternalComponentInstanceCS"


    // $ANTLR start "ruleExternalComponentInstanceCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:912:1: ruleExternalComponentInstanceCS returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleExternalComponentInstanceCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:915:28: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:916:1: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:916:1: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:916:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleExternalComponentInstanceCS1825); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalComponentInstanceCSAccess().getExternalKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:920:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:921:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:921:1: (lv_name_1_0= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:922:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalComponentInstanceCS1842); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExternalComponentInstanceCSAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalComponentInstanceCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleExternalComponentInstanceCS1859); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalComponentInstanceCSAccess().getColonKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:942:1: ( (otherlv_3= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:943:1: (otherlv_3= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:943:1: (otherlv_3= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:944:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalComponentInstanceCSRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalComponentInstanceCS1879); 

            		newLeafNode(otherlv_3, grammarAccess.getExternalComponentInstanceCSAccess().getTypeExternalComponentCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleExternalComponentInstanceCS"


    // $ANTLR start "entryRuleInternalComponentInstanceCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:963:1: entryRuleInternalComponentInstanceCS returns [EObject current=null] : iv_ruleInternalComponentInstanceCS= ruleInternalComponentInstanceCS EOF ;
    public final EObject entryRuleInternalComponentInstanceCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalComponentInstanceCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:964:2: (iv_ruleInternalComponentInstanceCS= ruleInternalComponentInstanceCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:965:2: iv_ruleInternalComponentInstanceCS= ruleInternalComponentInstanceCS EOF
            {
             newCompositeNode(grammarAccess.getInternalComponentInstanceCSRule()); 
            pushFollow(FOLLOW_ruleInternalComponentInstanceCS_in_entryRuleInternalComponentInstanceCS1915);
            iv_ruleInternalComponentInstanceCS=ruleInternalComponentInstanceCS();

            state._fsp--;

             current =iv_ruleInternalComponentInstanceCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalComponentInstanceCS1925); 

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
    // $ANTLR end "entryRuleInternalComponentInstanceCS"


    // $ANTLR start "ruleInternalComponentInstanceCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:972:1: ruleInternalComponentInstanceCS returns [EObject current=null] : (otherlv_0= 'internal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleInternalComponentInstanceCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:975:28: ( (otherlv_0= 'internal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:976:1: (otherlv_0= 'internal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:976:1: (otherlv_0= 'internal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:976:3: otherlv_0= 'internal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleInternalComponentInstanceCS1962); 

                	newLeafNode(otherlv_0, grammarAccess.getInternalComponentInstanceCSAccess().getInternalKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:980:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:981:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:981:1: (lv_name_1_0= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:982:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInternalComponentInstanceCS1979); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInternalComponentInstanceCSAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInternalComponentInstanceCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleInternalComponentInstanceCS1996); 

                	newLeafNode(otherlv_2, grammarAccess.getInternalComponentInstanceCSAccess().getColonKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1002:1: ( (otherlv_3= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1003:1: (otherlv_3= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1003:1: (otherlv_3= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1004:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInternalComponentInstanceCSRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInternalComponentInstanceCS2016); 

            		newLeafNode(otherlv_3, grammarAccess.getInternalComponentInstanceCSAccess().getTypeInternalComponentCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleInternalComponentInstanceCS"


    // $ANTLR start "entryRuleRelationshipInstanceCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1023:1: entryRuleRelationshipInstanceCS returns [EObject current=null] : iv_ruleRelationshipInstanceCS= ruleRelationshipInstanceCS EOF ;
    public final EObject entryRuleRelationshipInstanceCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipInstanceCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1024:2: (iv_ruleRelationshipInstanceCS= ruleRelationshipInstanceCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1025:2: iv_ruleRelationshipInstanceCS= ruleRelationshipInstanceCS EOF
            {
             newCompositeNode(grammarAccess.getRelationshipInstanceCSRule()); 
            pushFollow(FOLLOW_ruleRelationshipInstanceCS_in_entryRuleRelationshipInstanceCS2052);
            iv_ruleRelationshipInstanceCS=ruleRelationshipInstanceCS();

            state._fsp--;

             current =iv_ruleRelationshipInstanceCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationshipInstanceCS2062); 

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
    // $ANTLR end "entryRuleRelationshipInstanceCS"


    // $ANTLR start "ruleRelationshipInstanceCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1032:1: ruleRelationshipInstanceCS returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( ( ruleFqn ) ) otherlv_5= '=>' ( ( ruleFqn ) ) ) ;
    public final EObject ruleRelationshipInstanceCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1035:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( ( ruleFqn ) ) otherlv_5= '=>' ( ( ruleFqn ) ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1036:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( ( ruleFqn ) ) otherlv_5= '=>' ( ( ruleFqn ) ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1036:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( ( ruleFqn ) ) otherlv_5= '=>' ( ( ruleFqn ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1036:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( ( ruleFqn ) ) otherlv_5= '=>' ( ( ruleFqn ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1036:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1037:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1037:1: (lv_name_0_0= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1038:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationshipInstanceCS2104); 

            			newLeafNode(lv_name_0_0, grammarAccess.getRelationshipInstanceCSAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipInstanceCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleRelationshipInstanceCS2121); 

                	newLeafNode(otherlv_1, grammarAccess.getRelationshipInstanceCSAccess().getColonKeyword_1());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1058:1: ( (otherlv_2= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1059:1: (otherlv_2= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1059:1: (otherlv_2= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1060:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipInstanceCSRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationshipInstanceCS2141); 

            		newLeafNode(otherlv_2, grammarAccess.getRelationshipInstanceCSAccess().getTypeRelationshipCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleRelationshipInstanceCS2153); 

                	newLeafNode(otherlv_3, grammarAccess.getRelationshipInstanceCSAccess().getColonKeyword_3());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1075:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1076:1: ( ruleFqn )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1076:1: ( ruleFqn )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1077:3: ruleFqn
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipInstanceCSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipInstanceCSAccess().getRequiredPortInstanceRequiredPortInstanceCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFqn_in_ruleRelationshipInstanceCS2176);
            ruleFqn();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleRelationshipInstanceCS2188); 

                	newLeafNode(otherlv_5, grammarAccess.getRelationshipInstanceCSAccess().getEqualsSignGreaterThanSignKeyword_5());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1094:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1095:1: ( ruleFqn )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1095:1: ( ruleFqn )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1096:3: ruleFqn
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipInstanceCSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipInstanceCSAccess().getProvidedPortInstanceProvidedPortInstanceCrossReference_6_0()); 
            	    
            pushFollow(FOLLOW_ruleFqn_in_ruleRelationshipInstanceCS2211);
            ruleFqn();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleRelationshipInstanceCS"


    // $ANTLR start "entryRuleFqn"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1117:1: entryRuleFqn returns [String current=null] : iv_ruleFqn= ruleFqn EOF ;
    public final String entryRuleFqn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFqn = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1118:2: (iv_ruleFqn= ruleFqn EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1119:2: iv_ruleFqn= ruleFqn EOF
            {
             newCompositeNode(grammarAccess.getFqnRule()); 
            pushFollow(FOLLOW_ruleFqn_in_entryRuleFqn2248);
            iv_ruleFqn=ruleFqn();

            state._fsp--;

             current =iv_ruleFqn.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqn2259); 

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
    // $ANTLR end "entryRuleFqn"


    // $ANTLR start "ruleFqn"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1126:1: ruleFqn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFqn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1129:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1130:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1130:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1130:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFqn2299); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFqnAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1137:1: (kw= '.' this_ID_2= RULE_ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1138:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FOLLOW_27_in_ruleFqn2318); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFqnAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFqn2333); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFqnAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // $ANTLR end "ruleFqn"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCloudMLRoot_in_entryRuleCloudMLRoot75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCloudMLRoot85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCloudMLRoot122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCloudMLRoot139 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_ruleProviderCS_in_ruleCloudMLRoot165 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleCloudMLRoot178 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCloudMLRoot190 = new BitSet(new long[]{0x00000000004C4010L});
    public static final BitSet FOLLOW_ruleVMCS_in_ruleCloudMLRoot212 = new BitSet(new long[]{0x00000000004C4010L});
    public static final BitSet FOLLOW_ruleInternalComponentCS_in_ruleCloudMLRoot239 = new BitSet(new long[]{0x00000000004C4010L});
    public static final BitSet FOLLOW_ruleExternalComponentCS_in_ruleCloudMLRoot266 = new BitSet(new long[]{0x00000000004C4010L});
    public static final BitSet FOLLOW_ruleRelationshipCS_in_ruleCloudMLRoot289 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleCloudMLRoot302 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCloudMLRoot314 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCloudMLRoot326 = new BitSet(new long[]{0x0000000000484010L});
    public static final BitSet FOLLOW_ruleInternalComponentInstanceCS_in_ruleCloudMLRoot348 = new BitSet(new long[]{0x0000000000484010L});
    public static final BitSet FOLLOW_ruleExternalComponentInstanceCS_in_ruleCloudMLRoot375 = new BitSet(new long[]{0x0000000000484010L});
    public static final BitSet FOLLOW_ruleRelationshipInstanceCS_in_ruleCloudMLRoot398 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleCloudMLRoot411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderCS_in_entryRuleProviderCS447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProviderCS457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleProviderCS494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProviderCS511 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProviderCS528 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProviderCS545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVMCS_in_entryRuleVMCS586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVMCS596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleVMCS633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVMCS650 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVMCS667 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleVMPortCS_in_ruleVMCS688 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleVMCS701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVMPortCS_in_entryRuleVMPortCS737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVMPortCS747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVMPortCS788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalComponentCS_in_entryRuleExternalComponentCS828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalComponentCS838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleExternalComponentCS875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalComponentCS892 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleExternalComponentCS909 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_ruleProvidedPortCS_in_ruleExternalComponentCS930 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_14_in_ruleExternalComponentCS943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedPortCS_in_entryRuleProvidedPortCS979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedPortCS989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleProvidedPortCS1026 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleProvidedPortCS1044 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvidedPortCS1075 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvidedPortCS1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalComponentCS_in_entryRuleInternalComponentCS1137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalComponentCS1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleInternalComponentCS1184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInternalComponentCS1201 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInternalComponentCS1218 = new BitSet(new long[]{0x0000000002900000L});
    public static final BitSet FOLLOW_ruleProvidedPortCS_in_ruleInternalComponentCS1239 = new BitSet(new long[]{0x0000000002900000L});
    public static final BitSet FOLLOW_ruleRequiredPortCS_in_ruleInternalComponentCS1261 = new BitSet(new long[]{0x0000000002900000L});
    public static final BitSet FOLLOW_ruleRequiredExecutionPlatformCS_in_ruleInternalComponentCS1283 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInternalComponentCS1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredPortCS_in_entryRuleRequiredPortCS1331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredPortCS1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleRequiredPortCS1378 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleRequiredPortCS1396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredPortCS1427 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredPortCS1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredExecutionPlatformCS_in_entryRuleRequiredExecutionPlatformCS1489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredExecutionPlatformCS1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRequiredExecutionPlatformCS1536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredExecutionPlatformCS1553 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredExecutionPlatformCS1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipCS_in_entryRuleRelationshipCS1615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipCS1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationshipCS1667 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRelationshipCS1684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleRelationshipCS1707 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRelationshipCS1719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleRelationshipCS1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalComponentInstanceCS_in_entryRuleExternalComponentInstanceCS1778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalComponentInstanceCS1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleExternalComponentInstanceCS1825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalComponentInstanceCS1842 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExternalComponentInstanceCS1859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalComponentInstanceCS1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalComponentInstanceCS_in_entryRuleInternalComponentInstanceCS1915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalComponentInstanceCS1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleInternalComponentInstanceCS1962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInternalComponentInstanceCS1979 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInternalComponentInstanceCS1996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInternalComponentInstanceCS2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipInstanceCS_in_entryRuleRelationshipInstanceCS2052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipInstanceCS2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationshipInstanceCS2104 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRelationshipInstanceCS2121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationshipInstanceCS2141 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRelationshipInstanceCS2153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleRelationshipInstanceCS2176 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRelationshipInstanceCS2188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleRelationshipInstanceCS2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqn_in_entryRuleFqn2248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqn2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFqn2299 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleFqn2318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFqn2333 = new BitSet(new long[]{0x0000000008000002L});

}