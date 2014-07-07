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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'components'", "'{'", "'}'", "'instances'", "'provider'", "':'", "'vm'", "'['", "'group'", "'imageID'", "'os64'", "'location'", "'login'", "'core'", "'..'", "'ram'", "'storage'", "'os'", "'passwd'", "'privateKey'", "'region'", "'securityGroup'", "'serviceType'", "'sshKey'", "','", "']'", "'properties'", "'external'", "'provided'", "'port'", "'local'", "'internal'", "'required'", "'mandatory'", "'execution'", "'demands'", "'offers'", "'relationship'", "'=>'", "'execute'", "'('", "')'", "'resource'", "'download'", "'upload'", "'install'", "'configure'", "'start'", "'stop'", "'requireCredentials'", "'executeLocally'", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:76:1: ruleCloudMLRoot returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= ruleValidID ) ) ( (lv_providers_2_0= ruleProviderCS ) )* otherlv_3= 'components' otherlv_4= '{' ( ( (lv_vms_5_0= ruleVMCS ) ) | ( (lv_internalComponents_6_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_7_0= ruleExternalComponentCS ) ) )* ( (lv_relationships_8_0= ruleRelationshipCS ) )* otherlv_9= '}' otherlv_10= 'instances' otherlv_11= '{' ( ( (lv_internalComponentInstances_12_0= ruleInternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_13_0= ruleExternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_14_0= ruleVMInstanceCS ) ) )* ( (lv_relationshipInstances_15_0= ruleRelationshipInstanceCS ) )* ( (lv_executesInstances_16_0= ruleExecuteInstanceCS ) )* otherlv_17= '}' ) ;
    public final EObject ruleCloudMLRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_providers_2_0 = null;

        EObject lv_vms_5_0 = null;

        EObject lv_internalComponents_6_0 = null;

        EObject lv_externalComponents_7_0 = null;

        EObject lv_relationships_8_0 = null;

        EObject lv_internalComponentInstances_12_0 = null;

        EObject lv_externalComponentInstances_13_0 = null;

        EObject lv_externalComponentInstances_14_0 = null;

        EObject lv_relationshipInstances_15_0 = null;

        EObject lv_executesInstances_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:79:28: ( (otherlv_0= 'model' ( (lv_name_1_0= ruleValidID ) ) ( (lv_providers_2_0= ruleProviderCS ) )* otherlv_3= 'components' otherlv_4= '{' ( ( (lv_vms_5_0= ruleVMCS ) ) | ( (lv_internalComponents_6_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_7_0= ruleExternalComponentCS ) ) )* ( (lv_relationships_8_0= ruleRelationshipCS ) )* otherlv_9= '}' otherlv_10= 'instances' otherlv_11= '{' ( ( (lv_internalComponentInstances_12_0= ruleInternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_13_0= ruleExternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_14_0= ruleVMInstanceCS ) ) )* ( (lv_relationshipInstances_15_0= ruleRelationshipInstanceCS ) )* ( (lv_executesInstances_16_0= ruleExecuteInstanceCS ) )* otherlv_17= '}' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleValidID ) ) ( (lv_providers_2_0= ruleProviderCS ) )* otherlv_3= 'components' otherlv_4= '{' ( ( (lv_vms_5_0= ruleVMCS ) ) | ( (lv_internalComponents_6_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_7_0= ruleExternalComponentCS ) ) )* ( (lv_relationships_8_0= ruleRelationshipCS ) )* otherlv_9= '}' otherlv_10= 'instances' otherlv_11= '{' ( ( (lv_internalComponentInstances_12_0= ruleInternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_13_0= ruleExternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_14_0= ruleVMInstanceCS ) ) )* ( (lv_relationshipInstances_15_0= ruleRelationshipInstanceCS ) )* ( (lv_executesInstances_16_0= ruleExecuteInstanceCS ) )* otherlv_17= '}' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleValidID ) ) ( (lv_providers_2_0= ruleProviderCS ) )* otherlv_3= 'components' otherlv_4= '{' ( ( (lv_vms_5_0= ruleVMCS ) ) | ( (lv_internalComponents_6_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_7_0= ruleExternalComponentCS ) ) )* ( (lv_relationships_8_0= ruleRelationshipCS ) )* otherlv_9= '}' otherlv_10= 'instances' otherlv_11= '{' ( ( (lv_internalComponentInstances_12_0= ruleInternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_13_0= ruleExternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_14_0= ruleVMInstanceCS ) ) )* ( (lv_relationshipInstances_15_0= ruleRelationshipInstanceCS ) )* ( (lv_executesInstances_16_0= ruleExecuteInstanceCS ) )* otherlv_17= '}' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:80:3: otherlv_0= 'model' ( (lv_name_1_0= ruleValidID ) ) ( (lv_providers_2_0= ruleProviderCS ) )* otherlv_3= 'components' otherlv_4= '{' ( ( (lv_vms_5_0= ruleVMCS ) ) | ( (lv_internalComponents_6_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_7_0= ruleExternalComponentCS ) ) )* ( (lv_relationships_8_0= ruleRelationshipCS ) )* otherlv_9= '}' otherlv_10= 'instances' otherlv_11= '{' ( ( (lv_internalComponentInstances_12_0= ruleInternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_13_0= ruleExternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_14_0= ruleVMInstanceCS ) ) )* ( (lv_relationshipInstances_15_0= ruleRelationshipInstanceCS ) )* ( (lv_executesInstances_16_0= ruleExecuteInstanceCS ) )* otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleCloudMLRoot122); 

                	newLeafNode(otherlv_0, grammarAccess.getCloudMLRootAccess().getModelKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:84:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:85:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:85:1: (lv_name_1_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:86:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleCloudMLRoot143);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

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
            	    	    
            	    pushFollow(FOLLOW_ruleProviderCS_in_ruleCloudMLRoot164);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleCloudMLRoot177); 

                	newLeafNode(otherlv_3, grammarAccess.getCloudMLRootAccess().getComponentsKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleCloudMLRoot189); 

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
                case 43:
                    {
                    alt2=2;
                    }
                    break;
                case 39:
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
            	    	    
            	    pushFollow(FOLLOW_ruleVMCS_in_ruleCloudMLRoot211);
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
            	    	    
            	    pushFollow(FOLLOW_ruleInternalComponentCS_in_ruleCloudMLRoot238);
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
            	    	    
            	    pushFollow(FOLLOW_ruleExternalComponentCS_in_ruleCloudMLRoot265);
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

                if ( (LA3_0==49) ) {
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
            	    	    
            	    pushFollow(FOLLOW_ruleRelationshipCS_in_ruleCloudMLRoot288);
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

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleCloudMLRoot301); 

                	newLeafNode(otherlv_9, grammarAccess.getCloudMLRootAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleCloudMLRoot313); 

                	newLeafNode(otherlv_10, grammarAccess.getCloudMLRootAccess().getInstancesKeyword_8());
                
            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleCloudMLRoot325); 

                	newLeafNode(otherlv_11, grammarAccess.getCloudMLRootAccess().getLeftCurlyBracketKeyword_9());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:214:1: ( ( (lv_internalComponentInstances_12_0= ruleInternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_13_0= ruleExternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_14_0= ruleVMInstanceCS ) ) )*
            loop4:
            do {
                int alt4=4;
                switch ( input.LA(1) ) {
                case 43:
                    {
                    alt4=1;
                    }
                    break;
                case 39:
                    {
                    alt4=2;
                    }
                    break;
                case 18:
                    {
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:214:2: ( (lv_internalComponentInstances_12_0= ruleInternalComponentInstanceCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:214:2: ( (lv_internalComponentInstances_12_0= ruleInternalComponentInstanceCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:215:1: (lv_internalComponentInstances_12_0= ruleInternalComponentInstanceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:215:1: (lv_internalComponentInstances_12_0= ruleInternalComponentInstanceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:216:3: lv_internalComponentInstances_12_0= ruleInternalComponentInstanceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getInternalComponentInstancesInternalComponentInstanceCSParserRuleCall_10_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInternalComponentInstanceCS_in_ruleCloudMLRoot347);
            	    lv_internalComponentInstances_12_0=ruleInternalComponentInstanceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"internalComponentInstances",
            	            		lv_internalComponentInstances_12_0, 
            	            		"InternalComponentInstanceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:233:6: ( (lv_externalComponentInstances_13_0= ruleExternalComponentInstanceCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:233:6: ( (lv_externalComponentInstances_13_0= ruleExternalComponentInstanceCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:234:1: (lv_externalComponentInstances_13_0= ruleExternalComponentInstanceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:234:1: (lv_externalComponentInstances_13_0= ruleExternalComponentInstanceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:235:3: lv_externalComponentInstances_13_0= ruleExternalComponentInstanceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getExternalComponentInstancesExternalComponentInstanceCSParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExternalComponentInstanceCS_in_ruleCloudMLRoot374);
            	    lv_externalComponentInstances_13_0=ruleExternalComponentInstanceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"externalComponentInstances",
            	            		lv_externalComponentInstances_13_0, 
            	            		"ExternalComponentInstanceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:252:6: ( (lv_externalComponentInstances_14_0= ruleVMInstanceCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:252:6: ( (lv_externalComponentInstances_14_0= ruleVMInstanceCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:253:1: (lv_externalComponentInstances_14_0= ruleVMInstanceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:253:1: (lv_externalComponentInstances_14_0= ruleVMInstanceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:254:3: lv_externalComponentInstances_14_0= ruleVMInstanceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getExternalComponentInstancesVMInstanceCSParserRuleCall_10_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVMInstanceCS_in_ruleCloudMLRoot401);
            	    lv_externalComponentInstances_14_0=ruleVMInstanceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"externalComponentInstances",
            	            		lv_externalComponentInstances_14_0, 
            	            		"VMInstanceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:270:4: ( (lv_relationshipInstances_15_0= ruleRelationshipInstanceCS ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==49) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:271:1: (lv_relationshipInstances_15_0= ruleRelationshipInstanceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:271:1: (lv_relationshipInstances_15_0= ruleRelationshipInstanceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:272:3: lv_relationshipInstances_15_0= ruleRelationshipInstanceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getRelationshipInstancesRelationshipInstanceCSParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationshipInstanceCS_in_ruleCloudMLRoot424);
            	    lv_relationshipInstances_15_0=ruleRelationshipInstanceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"relationshipInstances",
            	            		lv_relationshipInstances_15_0, 
            	            		"RelationshipInstanceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:288:3: ( (lv_executesInstances_16_0= ruleExecuteInstanceCS ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==51) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:289:1: (lv_executesInstances_16_0= ruleExecuteInstanceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:289:1: (lv_executesInstances_16_0= ruleExecuteInstanceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:290:3: lv_executesInstances_16_0= ruleExecuteInstanceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getExecutesInstancesExecuteInstanceCSParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExecuteInstanceCS_in_ruleCloudMLRoot446);
            	    lv_executesInstances_16_0=ruleExecuteInstanceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"executesInstances",
            	            		lv_executesInstances_16_0, 
            	            		"ExecuteInstanceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleCloudMLRoot459); 

                	newLeafNode(otherlv_17, grammarAccess.getCloudMLRootAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:318:1: entryRuleProviderCS returns [EObject current=null] : iv_ruleProviderCS= ruleProviderCS EOF ;
    public final EObject entryRuleProviderCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviderCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:319:2: (iv_ruleProviderCS= ruleProviderCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:320:2: iv_ruleProviderCS= ruleProviderCS EOF
            {
             newCompositeNode(grammarAccess.getProviderCSRule()); 
            pushFollow(FOLLOW_ruleProviderCS_in_entryRuleProviderCS495);
            iv_ruleProviderCS=ruleProviderCS();

            state._fsp--;

             current =iv_ruleProviderCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProviderCS505); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:327:1: ruleProviderCS returns [EObject current=null] : (otherlv_0= 'provider' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (lv_credentials_3_0= RULE_STRING ) ) ( (lv_properties_4_0= rulePropertyCS ) )* ) ;
    public final EObject ruleProviderCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_credentials_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:330:28: ( (otherlv_0= 'provider' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (lv_credentials_3_0= RULE_STRING ) ) ( (lv_properties_4_0= rulePropertyCS ) )* ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:331:1: (otherlv_0= 'provider' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (lv_credentials_3_0= RULE_STRING ) ) ( (lv_properties_4_0= rulePropertyCS ) )* )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:331:1: (otherlv_0= 'provider' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (lv_credentials_3_0= RULE_STRING ) ) ( (lv_properties_4_0= rulePropertyCS ) )* )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:331:3: otherlv_0= 'provider' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (lv_credentials_3_0= RULE_STRING ) ) ( (lv_properties_4_0= rulePropertyCS ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleProviderCS542); 

                	newLeafNode(otherlv_0, grammarAccess.getProviderCSAccess().getProviderKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:335:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:336:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:336:1: (lv_name_1_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:337:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getProviderCSAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleProviderCS563);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProviderCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleProviderCS575); 

                	newLeafNode(otherlv_2, grammarAccess.getProviderCSAccess().getColonKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:357:1: ( (lv_credentials_3_0= RULE_STRING ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:358:1: (lv_credentials_3_0= RULE_STRING )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:358:1: (lv_credentials_3_0= RULE_STRING )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:359:3: lv_credentials_3_0= RULE_STRING
            {
            lv_credentials_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProviderCS592); 

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

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:375:2: ( (lv_properties_4_0= rulePropertyCS ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==52) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:376:1: (lv_properties_4_0= rulePropertyCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:376:1: (lv_properties_4_0= rulePropertyCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:377:3: lv_properties_4_0= rulePropertyCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProviderCSAccess().getPropertiesPropertyCSParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyCS_in_ruleProviderCS618);
            	    lv_properties_4_0=rulePropertyCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProviderCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_4_0, 
            	            		"PropertyCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleProviderCS"


    // $ANTLR start "entryRuleVMCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:401:1: entryRuleVMCS returns [EObject current=null] : iv_ruleVMCS= ruleVMCS EOF ;
    public final EObject entryRuleVMCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:402:2: (iv_ruleVMCS= ruleVMCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:403:2: iv_ruleVMCS= ruleVMCS EOF
            {
             newCompositeNode(grammarAccess.getVMCSRule()); 
            pushFollow(FOLLOW_ruleVMCS_in_entryRuleVMCS655);
            iv_ruleVMCS=ruleVMCS();

            state._fsp--;

             current =iv_ruleVMCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVMCS665); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:410:1: ruleVMCS returns [EObject current=null] : (otherlv_0= 'vm' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' (otherlv_3= '[' ( ( (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'group' otherlv_8= ':' ( (lv_groupName_9_0= RULE_STRING ) ) ) | (otherlv_10= 'imageID' otherlv_11= ':' ( (lv_imageId_12_0= RULE_STRING ) ) ) | ( (lv_is64os_13_0= 'os64' ) ) | (otherlv_14= 'location' otherlv_15= ':' ( (lv_location_16_0= RULE_STRING ) ) ) | (otherlv_17= 'login' otherlv_18= ':' ( (lv_login_19_0= RULE_STRING ) ) ) | (otherlv_20= 'core' otherlv_21= ':' ( (lv_minCores_22_0= RULE_INT ) ) otherlv_23= '..' ( (lv_maxCores_24_0= RULE_INT ) )? ) | (otherlv_25= 'ram' otherlv_26= ':' ( (lv_minRam_27_0= RULE_INT ) ) otherlv_28= '..' ( (lv_maxRam_29_0= RULE_INT ) )? ) | (otherlv_30= 'storage' otherlv_31= ':' ( (lv_minStorage_32_0= RULE_INT ) ) otherlv_33= '..' ( (lv_maxStorage_34_0= RULE_INT ) )? ) | (otherlv_35= 'os' otherlv_36= ':' ( (lv_os_37_0= RULE_STRING ) ) ) | (otherlv_38= 'passwd' otherlv_39= ':' ( (lv_passwd_40_0= RULE_STRING ) ) ) | (otherlv_41= 'privateKey' otherlv_42= ':' ( (lv_privateKey_43_0= RULE_STRING ) ) ) | (otherlv_44= 'region' otherlv_45= ':' ( (lv_Region_46_0= RULE_STRING ) ) ) | (otherlv_47= 'securityGroup' otherlv_48= ':' ( (lv_securityGroup_49_0= RULE_STRING ) ) ) | (otherlv_50= 'serviceType' otherlv_51= ':' ( (lv_serviceType_52_0= RULE_STRING ) ) ) | (otherlv_53= 'sshKey' otherlv_54= ':' ( (lv_sshKey_55_0= RULE_STRING ) ) ) ) (otherlv_56= ',' )? )* otherlv_57= ']' )? ( (lv_providedPorts_58_0= ruleProvidedPortCS ) )* ( (lv_providedExecutionPlatforms_59_0= ruleProvidedExecutionPlatformCS ) )* (otherlv_60= 'properties' otherlv_61= ':' ( (lv_properties_62_0= rulePropertyCS ) )* )? otherlv_63= '}' ) ;
    public final EObject ruleVMCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_groupName_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_imageId_12_0=null;
        Token lv_is64os_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_location_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_login_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_minCores_22_0=null;
        Token otherlv_23=null;
        Token lv_maxCores_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_minRam_27_0=null;
        Token otherlv_28=null;
        Token lv_maxRam_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token lv_minStorage_32_0=null;
        Token otherlv_33=null;
        Token lv_maxStorage_34_0=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token lv_os_37_0=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token lv_passwd_40_0=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token lv_privateKey_43_0=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token lv_Region_46_0=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token lv_securityGroup_49_0=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token lv_serviceType_52_0=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token lv_sshKey_55_0=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_providedPorts_58_0 = null;

        EObject lv_providedExecutionPlatforms_59_0 = null;

        EObject lv_properties_62_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:413:28: ( (otherlv_0= 'vm' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' (otherlv_3= '[' ( ( (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'group' otherlv_8= ':' ( (lv_groupName_9_0= RULE_STRING ) ) ) | (otherlv_10= 'imageID' otherlv_11= ':' ( (lv_imageId_12_0= RULE_STRING ) ) ) | ( (lv_is64os_13_0= 'os64' ) ) | (otherlv_14= 'location' otherlv_15= ':' ( (lv_location_16_0= RULE_STRING ) ) ) | (otherlv_17= 'login' otherlv_18= ':' ( (lv_login_19_0= RULE_STRING ) ) ) | (otherlv_20= 'core' otherlv_21= ':' ( (lv_minCores_22_0= RULE_INT ) ) otherlv_23= '..' ( (lv_maxCores_24_0= RULE_INT ) )? ) | (otherlv_25= 'ram' otherlv_26= ':' ( (lv_minRam_27_0= RULE_INT ) ) otherlv_28= '..' ( (lv_maxRam_29_0= RULE_INT ) )? ) | (otherlv_30= 'storage' otherlv_31= ':' ( (lv_minStorage_32_0= RULE_INT ) ) otherlv_33= '..' ( (lv_maxStorage_34_0= RULE_INT ) )? ) | (otherlv_35= 'os' otherlv_36= ':' ( (lv_os_37_0= RULE_STRING ) ) ) | (otherlv_38= 'passwd' otherlv_39= ':' ( (lv_passwd_40_0= RULE_STRING ) ) ) | (otherlv_41= 'privateKey' otherlv_42= ':' ( (lv_privateKey_43_0= RULE_STRING ) ) ) | (otherlv_44= 'region' otherlv_45= ':' ( (lv_Region_46_0= RULE_STRING ) ) ) | (otherlv_47= 'securityGroup' otherlv_48= ':' ( (lv_securityGroup_49_0= RULE_STRING ) ) ) | (otherlv_50= 'serviceType' otherlv_51= ':' ( (lv_serviceType_52_0= RULE_STRING ) ) ) | (otherlv_53= 'sshKey' otherlv_54= ':' ( (lv_sshKey_55_0= RULE_STRING ) ) ) ) (otherlv_56= ',' )? )* otherlv_57= ']' )? ( (lv_providedPorts_58_0= ruleProvidedPortCS ) )* ( (lv_providedExecutionPlatforms_59_0= ruleProvidedExecutionPlatformCS ) )* (otherlv_60= 'properties' otherlv_61= ':' ( (lv_properties_62_0= rulePropertyCS ) )* )? otherlv_63= '}' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:414:1: (otherlv_0= 'vm' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' (otherlv_3= '[' ( ( (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'group' otherlv_8= ':' ( (lv_groupName_9_0= RULE_STRING ) ) ) | (otherlv_10= 'imageID' otherlv_11= ':' ( (lv_imageId_12_0= RULE_STRING ) ) ) | ( (lv_is64os_13_0= 'os64' ) ) | (otherlv_14= 'location' otherlv_15= ':' ( (lv_location_16_0= RULE_STRING ) ) ) | (otherlv_17= 'login' otherlv_18= ':' ( (lv_login_19_0= RULE_STRING ) ) ) | (otherlv_20= 'core' otherlv_21= ':' ( (lv_minCores_22_0= RULE_INT ) ) otherlv_23= '..' ( (lv_maxCores_24_0= RULE_INT ) )? ) | (otherlv_25= 'ram' otherlv_26= ':' ( (lv_minRam_27_0= RULE_INT ) ) otherlv_28= '..' ( (lv_maxRam_29_0= RULE_INT ) )? ) | (otherlv_30= 'storage' otherlv_31= ':' ( (lv_minStorage_32_0= RULE_INT ) ) otherlv_33= '..' ( (lv_maxStorage_34_0= RULE_INT ) )? ) | (otherlv_35= 'os' otherlv_36= ':' ( (lv_os_37_0= RULE_STRING ) ) ) | (otherlv_38= 'passwd' otherlv_39= ':' ( (lv_passwd_40_0= RULE_STRING ) ) ) | (otherlv_41= 'privateKey' otherlv_42= ':' ( (lv_privateKey_43_0= RULE_STRING ) ) ) | (otherlv_44= 'region' otherlv_45= ':' ( (lv_Region_46_0= RULE_STRING ) ) ) | (otherlv_47= 'securityGroup' otherlv_48= ':' ( (lv_securityGroup_49_0= RULE_STRING ) ) ) | (otherlv_50= 'serviceType' otherlv_51= ':' ( (lv_serviceType_52_0= RULE_STRING ) ) ) | (otherlv_53= 'sshKey' otherlv_54= ':' ( (lv_sshKey_55_0= RULE_STRING ) ) ) ) (otherlv_56= ',' )? )* otherlv_57= ']' )? ( (lv_providedPorts_58_0= ruleProvidedPortCS ) )* ( (lv_providedExecutionPlatforms_59_0= ruleProvidedExecutionPlatformCS ) )* (otherlv_60= 'properties' otherlv_61= ':' ( (lv_properties_62_0= rulePropertyCS ) )* )? otherlv_63= '}' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:414:1: (otherlv_0= 'vm' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' (otherlv_3= '[' ( ( (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'group' otherlv_8= ':' ( (lv_groupName_9_0= RULE_STRING ) ) ) | (otherlv_10= 'imageID' otherlv_11= ':' ( (lv_imageId_12_0= RULE_STRING ) ) ) | ( (lv_is64os_13_0= 'os64' ) ) | (otherlv_14= 'location' otherlv_15= ':' ( (lv_location_16_0= RULE_STRING ) ) ) | (otherlv_17= 'login' otherlv_18= ':' ( (lv_login_19_0= RULE_STRING ) ) ) | (otherlv_20= 'core' otherlv_21= ':' ( (lv_minCores_22_0= RULE_INT ) ) otherlv_23= '..' ( (lv_maxCores_24_0= RULE_INT ) )? ) | (otherlv_25= 'ram' otherlv_26= ':' ( (lv_minRam_27_0= RULE_INT ) ) otherlv_28= '..' ( (lv_maxRam_29_0= RULE_INT ) )? ) | (otherlv_30= 'storage' otherlv_31= ':' ( (lv_minStorage_32_0= RULE_INT ) ) otherlv_33= '..' ( (lv_maxStorage_34_0= RULE_INT ) )? ) | (otherlv_35= 'os' otherlv_36= ':' ( (lv_os_37_0= RULE_STRING ) ) ) | (otherlv_38= 'passwd' otherlv_39= ':' ( (lv_passwd_40_0= RULE_STRING ) ) ) | (otherlv_41= 'privateKey' otherlv_42= ':' ( (lv_privateKey_43_0= RULE_STRING ) ) ) | (otherlv_44= 'region' otherlv_45= ':' ( (lv_Region_46_0= RULE_STRING ) ) ) | (otherlv_47= 'securityGroup' otherlv_48= ':' ( (lv_securityGroup_49_0= RULE_STRING ) ) ) | (otherlv_50= 'serviceType' otherlv_51= ':' ( (lv_serviceType_52_0= RULE_STRING ) ) ) | (otherlv_53= 'sshKey' otherlv_54= ':' ( (lv_sshKey_55_0= RULE_STRING ) ) ) ) (otherlv_56= ',' )? )* otherlv_57= ']' )? ( (lv_providedPorts_58_0= ruleProvidedPortCS ) )* ( (lv_providedExecutionPlatforms_59_0= ruleProvidedExecutionPlatformCS ) )* (otherlv_60= 'properties' otherlv_61= ':' ( (lv_properties_62_0= rulePropertyCS ) )* )? otherlv_63= '}' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:414:3: otherlv_0= 'vm' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' (otherlv_3= '[' ( ( (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'group' otherlv_8= ':' ( (lv_groupName_9_0= RULE_STRING ) ) ) | (otherlv_10= 'imageID' otherlv_11= ':' ( (lv_imageId_12_0= RULE_STRING ) ) ) | ( (lv_is64os_13_0= 'os64' ) ) | (otherlv_14= 'location' otherlv_15= ':' ( (lv_location_16_0= RULE_STRING ) ) ) | (otherlv_17= 'login' otherlv_18= ':' ( (lv_login_19_0= RULE_STRING ) ) ) | (otherlv_20= 'core' otherlv_21= ':' ( (lv_minCores_22_0= RULE_INT ) ) otherlv_23= '..' ( (lv_maxCores_24_0= RULE_INT ) )? ) | (otherlv_25= 'ram' otherlv_26= ':' ( (lv_minRam_27_0= RULE_INT ) ) otherlv_28= '..' ( (lv_maxRam_29_0= RULE_INT ) )? ) | (otherlv_30= 'storage' otherlv_31= ':' ( (lv_minStorage_32_0= RULE_INT ) ) otherlv_33= '..' ( (lv_maxStorage_34_0= RULE_INT ) )? ) | (otherlv_35= 'os' otherlv_36= ':' ( (lv_os_37_0= RULE_STRING ) ) ) | (otherlv_38= 'passwd' otherlv_39= ':' ( (lv_passwd_40_0= RULE_STRING ) ) ) | (otherlv_41= 'privateKey' otherlv_42= ':' ( (lv_privateKey_43_0= RULE_STRING ) ) ) | (otherlv_44= 'region' otherlv_45= ':' ( (lv_Region_46_0= RULE_STRING ) ) ) | (otherlv_47= 'securityGroup' otherlv_48= ':' ( (lv_securityGroup_49_0= RULE_STRING ) ) ) | (otherlv_50= 'serviceType' otherlv_51= ':' ( (lv_serviceType_52_0= RULE_STRING ) ) ) | (otherlv_53= 'sshKey' otherlv_54= ':' ( (lv_sshKey_55_0= RULE_STRING ) ) ) ) (otherlv_56= ',' )? )* otherlv_57= ']' )? ( (lv_providedPorts_58_0= ruleProvidedPortCS ) )* ( (lv_providedExecutionPlatforms_59_0= ruleProvidedExecutionPlatformCS ) )* (otherlv_60= 'properties' otherlv_61= ':' ( (lv_properties_62_0= rulePropertyCS ) )* )? otherlv_63= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleVMCS702); 

                	newLeafNode(otherlv_0, grammarAccess.getVMCSAccess().getVmKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:418:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:419:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:419:1: (lv_name_1_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:420:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getVMCSAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleVMCS723);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVMCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleVMCS735); 

                	newLeafNode(otherlv_2, grammarAccess.getVMCSAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:440:1: (otherlv_3= '[' ( ( (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'group' otherlv_8= ':' ( (lv_groupName_9_0= RULE_STRING ) ) ) | (otherlv_10= 'imageID' otherlv_11= ':' ( (lv_imageId_12_0= RULE_STRING ) ) ) | ( (lv_is64os_13_0= 'os64' ) ) | (otherlv_14= 'location' otherlv_15= ':' ( (lv_location_16_0= RULE_STRING ) ) ) | (otherlv_17= 'login' otherlv_18= ':' ( (lv_login_19_0= RULE_STRING ) ) ) | (otherlv_20= 'core' otherlv_21= ':' ( (lv_minCores_22_0= RULE_INT ) ) otherlv_23= '..' ( (lv_maxCores_24_0= RULE_INT ) )? ) | (otherlv_25= 'ram' otherlv_26= ':' ( (lv_minRam_27_0= RULE_INT ) ) otherlv_28= '..' ( (lv_maxRam_29_0= RULE_INT ) )? ) | (otherlv_30= 'storage' otherlv_31= ':' ( (lv_minStorage_32_0= RULE_INT ) ) otherlv_33= '..' ( (lv_maxStorage_34_0= RULE_INT ) )? ) | (otherlv_35= 'os' otherlv_36= ':' ( (lv_os_37_0= RULE_STRING ) ) ) | (otherlv_38= 'passwd' otherlv_39= ':' ( (lv_passwd_40_0= RULE_STRING ) ) ) | (otherlv_41= 'privateKey' otherlv_42= ':' ( (lv_privateKey_43_0= RULE_STRING ) ) ) | (otherlv_44= 'region' otherlv_45= ':' ( (lv_Region_46_0= RULE_STRING ) ) ) | (otherlv_47= 'securityGroup' otherlv_48= ':' ( (lv_securityGroup_49_0= RULE_STRING ) ) ) | (otherlv_50= 'serviceType' otherlv_51= ':' ( (lv_serviceType_52_0= RULE_STRING ) ) ) | (otherlv_53= 'sshKey' otherlv_54= ':' ( (lv_sshKey_55_0= RULE_STRING ) ) ) ) (otherlv_56= ',' )? )* otherlv_57= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:440:3: otherlv_3= '[' ( ( (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'group' otherlv_8= ':' ( (lv_groupName_9_0= RULE_STRING ) ) ) | (otherlv_10= 'imageID' otherlv_11= ':' ( (lv_imageId_12_0= RULE_STRING ) ) ) | ( (lv_is64os_13_0= 'os64' ) ) | (otherlv_14= 'location' otherlv_15= ':' ( (lv_location_16_0= RULE_STRING ) ) ) | (otherlv_17= 'login' otherlv_18= ':' ( (lv_login_19_0= RULE_STRING ) ) ) | (otherlv_20= 'core' otherlv_21= ':' ( (lv_minCores_22_0= RULE_INT ) ) otherlv_23= '..' ( (lv_maxCores_24_0= RULE_INT ) )? ) | (otherlv_25= 'ram' otherlv_26= ':' ( (lv_minRam_27_0= RULE_INT ) ) otherlv_28= '..' ( (lv_maxRam_29_0= RULE_INT ) )? ) | (otherlv_30= 'storage' otherlv_31= ':' ( (lv_minStorage_32_0= RULE_INT ) ) otherlv_33= '..' ( (lv_maxStorage_34_0= RULE_INT ) )? ) | (otherlv_35= 'os' otherlv_36= ':' ( (lv_os_37_0= RULE_STRING ) ) ) | (otherlv_38= 'passwd' otherlv_39= ':' ( (lv_passwd_40_0= RULE_STRING ) ) ) | (otherlv_41= 'privateKey' otherlv_42= ':' ( (lv_privateKey_43_0= RULE_STRING ) ) ) | (otherlv_44= 'region' otherlv_45= ':' ( (lv_Region_46_0= RULE_STRING ) ) ) | (otherlv_47= 'securityGroup' otherlv_48= ':' ( (lv_securityGroup_49_0= RULE_STRING ) ) ) | (otherlv_50= 'serviceType' otherlv_51= ':' ( (lv_serviceType_52_0= RULE_STRING ) ) ) | (otherlv_53= 'sshKey' otherlv_54= ':' ( (lv_sshKey_55_0= RULE_STRING ) ) ) ) (otherlv_56= ',' )? )* otherlv_57= ']'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleVMCS748); 

                        	newLeafNode(otherlv_3, grammarAccess.getVMCSAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:444:1: ( ( (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'group' otherlv_8= ':' ( (lv_groupName_9_0= RULE_STRING ) ) ) | (otherlv_10= 'imageID' otherlv_11= ':' ( (lv_imageId_12_0= RULE_STRING ) ) ) | ( (lv_is64os_13_0= 'os64' ) ) | (otherlv_14= 'location' otherlv_15= ':' ( (lv_location_16_0= RULE_STRING ) ) ) | (otherlv_17= 'login' otherlv_18= ':' ( (lv_login_19_0= RULE_STRING ) ) ) | (otherlv_20= 'core' otherlv_21= ':' ( (lv_minCores_22_0= RULE_INT ) ) otherlv_23= '..' ( (lv_maxCores_24_0= RULE_INT ) )? ) | (otherlv_25= 'ram' otherlv_26= ':' ( (lv_minRam_27_0= RULE_INT ) ) otherlv_28= '..' ( (lv_maxRam_29_0= RULE_INT ) )? ) | (otherlv_30= 'storage' otherlv_31= ':' ( (lv_minStorage_32_0= RULE_INT ) ) otherlv_33= '..' ( (lv_maxStorage_34_0= RULE_INT ) )? ) | (otherlv_35= 'os' otherlv_36= ':' ( (lv_os_37_0= RULE_STRING ) ) ) | (otherlv_38= 'passwd' otherlv_39= ':' ( (lv_passwd_40_0= RULE_STRING ) ) ) | (otherlv_41= 'privateKey' otherlv_42= ':' ( (lv_privateKey_43_0= RULE_STRING ) ) ) | (otherlv_44= 'region' otherlv_45= ':' ( (lv_Region_46_0= RULE_STRING ) ) ) | (otherlv_47= 'securityGroup' otherlv_48= ':' ( (lv_securityGroup_49_0= RULE_STRING ) ) ) | (otherlv_50= 'serviceType' otherlv_51= ':' ( (lv_serviceType_52_0= RULE_STRING ) ) ) | (otherlv_53= 'sshKey' otherlv_54= ':' ( (lv_sshKey_55_0= RULE_STRING ) ) ) ) (otherlv_56= ',' )? )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16||(LA13_0>=20 && LA13_0<=25)||(LA13_0>=27 && LA13_0<=35)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:444:2: ( (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'group' otherlv_8= ':' ( (lv_groupName_9_0= RULE_STRING ) ) ) | (otherlv_10= 'imageID' otherlv_11= ':' ( (lv_imageId_12_0= RULE_STRING ) ) ) | ( (lv_is64os_13_0= 'os64' ) ) | (otherlv_14= 'location' otherlv_15= ':' ( (lv_location_16_0= RULE_STRING ) ) ) | (otherlv_17= 'login' otherlv_18= ':' ( (lv_login_19_0= RULE_STRING ) ) ) | (otherlv_20= 'core' otherlv_21= ':' ( (lv_minCores_22_0= RULE_INT ) ) otherlv_23= '..' ( (lv_maxCores_24_0= RULE_INT ) )? ) | (otherlv_25= 'ram' otherlv_26= ':' ( (lv_minRam_27_0= RULE_INT ) ) otherlv_28= '..' ( (lv_maxRam_29_0= RULE_INT ) )? ) | (otherlv_30= 'storage' otherlv_31= ':' ( (lv_minStorage_32_0= RULE_INT ) ) otherlv_33= '..' ( (lv_maxStorage_34_0= RULE_INT ) )? ) | (otherlv_35= 'os' otherlv_36= ':' ( (lv_os_37_0= RULE_STRING ) ) ) | (otherlv_38= 'passwd' otherlv_39= ':' ( (lv_passwd_40_0= RULE_STRING ) ) ) | (otherlv_41= 'privateKey' otherlv_42= ':' ( (lv_privateKey_43_0= RULE_STRING ) ) ) | (otherlv_44= 'region' otherlv_45= ':' ( (lv_Region_46_0= RULE_STRING ) ) ) | (otherlv_47= 'securityGroup' otherlv_48= ':' ( (lv_securityGroup_49_0= RULE_STRING ) ) ) | (otherlv_50= 'serviceType' otherlv_51= ':' ( (lv_serviceType_52_0= RULE_STRING ) ) ) | (otherlv_53= 'sshKey' otherlv_54= ':' ( (lv_sshKey_55_0= RULE_STRING ) ) ) ) (otherlv_56= ',' )?
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:444:2: ( (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'group' otherlv_8= ':' ( (lv_groupName_9_0= RULE_STRING ) ) ) | (otherlv_10= 'imageID' otherlv_11= ':' ( (lv_imageId_12_0= RULE_STRING ) ) ) | ( (lv_is64os_13_0= 'os64' ) ) | (otherlv_14= 'location' otherlv_15= ':' ( (lv_location_16_0= RULE_STRING ) ) ) | (otherlv_17= 'login' otherlv_18= ':' ( (lv_login_19_0= RULE_STRING ) ) ) | (otherlv_20= 'core' otherlv_21= ':' ( (lv_minCores_22_0= RULE_INT ) ) otherlv_23= '..' ( (lv_maxCores_24_0= RULE_INT ) )? ) | (otherlv_25= 'ram' otherlv_26= ':' ( (lv_minRam_27_0= RULE_INT ) ) otherlv_28= '..' ( (lv_maxRam_29_0= RULE_INT ) )? ) | (otherlv_30= 'storage' otherlv_31= ':' ( (lv_minStorage_32_0= RULE_INT ) ) otherlv_33= '..' ( (lv_maxStorage_34_0= RULE_INT ) )? ) | (otherlv_35= 'os' otherlv_36= ':' ( (lv_os_37_0= RULE_STRING ) ) ) | (otherlv_38= 'passwd' otherlv_39= ':' ( (lv_passwd_40_0= RULE_STRING ) ) ) | (otherlv_41= 'privateKey' otherlv_42= ':' ( (lv_privateKey_43_0= RULE_STRING ) ) ) | (otherlv_44= 'region' otherlv_45= ':' ( (lv_Region_46_0= RULE_STRING ) ) ) | (otherlv_47= 'securityGroup' otherlv_48= ':' ( (lv_securityGroup_49_0= RULE_STRING ) ) ) | (otherlv_50= 'serviceType' otherlv_51= ':' ( (lv_serviceType_52_0= RULE_STRING ) ) ) | (otherlv_53= 'sshKey' otherlv_54= ':' ( (lv_sshKey_55_0= RULE_STRING ) ) ) )
                    	    int alt11=16;
                    	    switch ( input.LA(1) ) {
                    	    case 16:
                    	        {
                    	        alt11=1;
                    	        }
                    	        break;
                    	    case 20:
                    	        {
                    	        alt11=2;
                    	        }
                    	        break;
                    	    case 21:
                    	        {
                    	        alt11=3;
                    	        }
                    	        break;
                    	    case 22:
                    	        {
                    	        alt11=4;
                    	        }
                    	        break;
                    	    case 23:
                    	        {
                    	        alt11=5;
                    	        }
                    	        break;
                    	    case 24:
                    	        {
                    	        alt11=6;
                    	        }
                    	        break;
                    	    case 25:
                    	        {
                    	        alt11=7;
                    	        }
                    	        break;
                    	    case 27:
                    	        {
                    	        alt11=8;
                    	        }
                    	        break;
                    	    case 28:
                    	        {
                    	        alt11=9;
                    	        }
                    	        break;
                    	    case 29:
                    	        {
                    	        alt11=10;
                    	        }
                    	        break;
                    	    case 30:
                    	        {
                    	        alt11=11;
                    	        }
                    	        break;
                    	    case 31:
                    	        {
                    	        alt11=12;
                    	        }
                    	        break;
                    	    case 32:
                    	        {
                    	        alt11=13;
                    	        }
                    	        break;
                    	    case 33:
                    	        {
                    	        alt11=14;
                    	        }
                    	        break;
                    	    case 34:
                    	        {
                    	        alt11=15;
                    	        }
                    	        break;
                    	    case 35:
                    	        {
                    	        alt11=16;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 11, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt11) {
                    	        case 1 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:444:3: (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:444:3: (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:444:5: otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) )
                    	            {
                    	            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleVMCS763); 

                    	                	newLeafNode(otherlv_4, grammarAccess.getVMCSAccess().getProviderKeyword_3_1_0_0_0());
                    	                
                    	            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleVMCS775); 

                    	                	newLeafNode(otherlv_5, grammarAccess.getVMCSAccess().getColonKeyword_3_1_0_0_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:452:1: ( (otherlv_6= RULE_ID ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:453:1: (otherlv_6= RULE_ID )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:453:1: (otherlv_6= RULE_ID )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:454:3: otherlv_6= RULE_ID
                    	            {

                    	            			if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                    
                    	            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVMCS795); 

                    	            		newLeafNode(otherlv_6, grammarAccess.getVMCSAccess().getProviderProviderCrossReference_3_1_0_0_2_0()); 
                    	            	

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:466:6: (otherlv_7= 'group' otherlv_8= ':' ( (lv_groupName_9_0= RULE_STRING ) ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:466:6: (otherlv_7= 'group' otherlv_8= ':' ( (lv_groupName_9_0= RULE_STRING ) ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:466:8: otherlv_7= 'group' otherlv_8= ':' ( (lv_groupName_9_0= RULE_STRING ) )
                    	            {
                    	            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleVMCS815); 

                    	                	newLeafNode(otherlv_7, grammarAccess.getVMCSAccess().getGroupKeyword_3_1_0_1_0());
                    	                
                    	            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleVMCS827); 

                    	                	newLeafNode(otherlv_8, grammarAccess.getVMCSAccess().getColonKeyword_3_1_0_1_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:474:1: ( (lv_groupName_9_0= RULE_STRING ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:475:1: (lv_groupName_9_0= RULE_STRING )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:475:1: (lv_groupName_9_0= RULE_STRING )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:476:3: lv_groupName_9_0= RULE_STRING
                    	            {
                    	            lv_groupName_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS844); 

                    	            			newLeafNode(lv_groupName_9_0, grammarAccess.getVMCSAccess().getGroupNameSTRINGTerminalRuleCall_3_1_0_1_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"groupName",
                    	                    		lv_groupName_9_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:493:6: (otherlv_10= 'imageID' otherlv_11= ':' ( (lv_imageId_12_0= RULE_STRING ) ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:493:6: (otherlv_10= 'imageID' otherlv_11= ':' ( (lv_imageId_12_0= RULE_STRING ) ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:493:8: otherlv_10= 'imageID' otherlv_11= ':' ( (lv_imageId_12_0= RULE_STRING ) )
                    	            {
                    	            otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleVMCS869); 

                    	                	newLeafNode(otherlv_10, grammarAccess.getVMCSAccess().getImageIDKeyword_3_1_0_2_0());
                    	                
                    	            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleVMCS881); 

                    	                	newLeafNode(otherlv_11, grammarAccess.getVMCSAccess().getColonKeyword_3_1_0_2_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:501:1: ( (lv_imageId_12_0= RULE_STRING ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:502:1: (lv_imageId_12_0= RULE_STRING )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:502:1: (lv_imageId_12_0= RULE_STRING )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:503:3: lv_imageId_12_0= RULE_STRING
                    	            {
                    	            lv_imageId_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS898); 

                    	            			newLeafNode(lv_imageId_12_0, grammarAccess.getVMCSAccess().getImageIdSTRINGTerminalRuleCall_3_1_0_2_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"imageId",
                    	                    		lv_imageId_12_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 4 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:520:6: ( (lv_is64os_13_0= 'os64' ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:520:6: ( (lv_is64os_13_0= 'os64' ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:521:1: (lv_is64os_13_0= 'os64' )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:521:1: (lv_is64os_13_0= 'os64' )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:522:3: lv_is64os_13_0= 'os64'
                    	            {
                    	            lv_is64os_13_0=(Token)match(input,22,FOLLOW_22_in_ruleVMCS928); 

                    	                    newLeafNode(lv_is64os_13_0, grammarAccess.getVMCSAccess().getIs64osOs64Keyword_3_1_0_3_0());
                    	                

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(current, "is64os", true, "os64");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 5 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:536:6: (otherlv_14= 'location' otherlv_15= ':' ( (lv_location_16_0= RULE_STRING ) ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:536:6: (otherlv_14= 'location' otherlv_15= ':' ( (lv_location_16_0= RULE_STRING ) ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:536:8: otherlv_14= 'location' otherlv_15= ':' ( (lv_location_16_0= RULE_STRING ) )
                    	            {
                    	            otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleVMCS960); 

                    	                	newLeafNode(otherlv_14, grammarAccess.getVMCSAccess().getLocationKeyword_3_1_0_4_0());
                    	                
                    	            otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleVMCS972); 

                    	                	newLeafNode(otherlv_15, grammarAccess.getVMCSAccess().getColonKeyword_3_1_0_4_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:544:1: ( (lv_location_16_0= RULE_STRING ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:545:1: (lv_location_16_0= RULE_STRING )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:545:1: (lv_location_16_0= RULE_STRING )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:546:3: lv_location_16_0= RULE_STRING
                    	            {
                    	            lv_location_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS989); 

                    	            			newLeafNode(lv_location_16_0, grammarAccess.getVMCSAccess().getLocationSTRINGTerminalRuleCall_3_1_0_4_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"location",
                    	                    		lv_location_16_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 6 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:563:6: (otherlv_17= 'login' otherlv_18= ':' ( (lv_login_19_0= RULE_STRING ) ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:563:6: (otherlv_17= 'login' otherlv_18= ':' ( (lv_login_19_0= RULE_STRING ) ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:563:8: otherlv_17= 'login' otherlv_18= ':' ( (lv_login_19_0= RULE_STRING ) )
                    	            {
                    	            otherlv_17=(Token)match(input,24,FOLLOW_24_in_ruleVMCS1014); 

                    	                	newLeafNode(otherlv_17, grammarAccess.getVMCSAccess().getLoginKeyword_3_1_0_5_0());
                    	                
                    	            otherlv_18=(Token)match(input,17,FOLLOW_17_in_ruleVMCS1026); 

                    	                	newLeafNode(otherlv_18, grammarAccess.getVMCSAccess().getColonKeyword_3_1_0_5_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:571:1: ( (lv_login_19_0= RULE_STRING ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:572:1: (lv_login_19_0= RULE_STRING )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:572:1: (lv_login_19_0= RULE_STRING )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:573:3: lv_login_19_0= RULE_STRING
                    	            {
                    	            lv_login_19_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1043); 

                    	            			newLeafNode(lv_login_19_0, grammarAccess.getVMCSAccess().getLoginSTRINGTerminalRuleCall_3_1_0_5_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"login",
                    	                    		lv_login_19_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 7 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:590:6: (otherlv_20= 'core' otherlv_21= ':' ( (lv_minCores_22_0= RULE_INT ) ) otherlv_23= '..' ( (lv_maxCores_24_0= RULE_INT ) )? )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:590:6: (otherlv_20= 'core' otherlv_21= ':' ( (lv_minCores_22_0= RULE_INT ) ) otherlv_23= '..' ( (lv_maxCores_24_0= RULE_INT ) )? )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:590:8: otherlv_20= 'core' otherlv_21= ':' ( (lv_minCores_22_0= RULE_INT ) ) otherlv_23= '..' ( (lv_maxCores_24_0= RULE_INT ) )?
                    	            {
                    	            otherlv_20=(Token)match(input,25,FOLLOW_25_in_ruleVMCS1068); 

                    	                	newLeafNode(otherlv_20, grammarAccess.getVMCSAccess().getCoreKeyword_3_1_0_6_0());
                    	                
                    	            otherlv_21=(Token)match(input,17,FOLLOW_17_in_ruleVMCS1080); 

                    	                	newLeafNode(otherlv_21, grammarAccess.getVMCSAccess().getColonKeyword_3_1_0_6_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:598:1: ( (lv_minCores_22_0= RULE_INT ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:599:1: (lv_minCores_22_0= RULE_INT )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:599:1: (lv_minCores_22_0= RULE_INT )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:600:3: lv_minCores_22_0= RULE_INT
                    	            {
                    	            lv_minCores_22_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVMCS1097); 

                    	            			newLeafNode(lv_minCores_22_0, grammarAccess.getVMCSAccess().getMinCoresINTTerminalRuleCall_3_1_0_6_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"minCores",
                    	                    		lv_minCores_22_0, 
                    	                    		"INT");
                    	            	    

                    	            }


                    	            }

                    	            otherlv_23=(Token)match(input,26,FOLLOW_26_in_ruleVMCS1114); 

                    	                	newLeafNode(otherlv_23, grammarAccess.getVMCSAccess().getFullStopFullStopKeyword_3_1_0_6_3());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:620:1: ( (lv_maxCores_24_0= RULE_INT ) )?
                    	            int alt8=2;
                    	            int LA8_0 = input.LA(1);

                    	            if ( (LA8_0==RULE_INT) ) {
                    	                alt8=1;
                    	            }
                    	            switch (alt8) {
                    	                case 1 :
                    	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:621:1: (lv_maxCores_24_0= RULE_INT )
                    	                    {
                    	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:621:1: (lv_maxCores_24_0= RULE_INT )
                    	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:622:3: lv_maxCores_24_0= RULE_INT
                    	                    {
                    	                    lv_maxCores_24_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVMCS1131); 

                    	                    			newLeafNode(lv_maxCores_24_0, grammarAccess.getVMCSAccess().getMaxCoresINTTerminalRuleCall_3_1_0_6_4_0()); 
                    	                    		

                    	                    	        if (current==null) {
                    	                    	            current = createModelElement(grammarAccess.getVMCSRule());
                    	                    	        }
                    	                           		setWithLastConsumed(
                    	                           			current, 
                    	                           			"maxCores",
                    	                            		lv_maxCores_24_0, 
                    	                            		"INT");
                    	                    	    

                    	                    }


                    	                    }
                    	                    break;

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 8 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:639:6: (otherlv_25= 'ram' otherlv_26= ':' ( (lv_minRam_27_0= RULE_INT ) ) otherlv_28= '..' ( (lv_maxRam_29_0= RULE_INT ) )? )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:639:6: (otherlv_25= 'ram' otherlv_26= ':' ( (lv_minRam_27_0= RULE_INT ) ) otherlv_28= '..' ( (lv_maxRam_29_0= RULE_INT ) )? )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:639:8: otherlv_25= 'ram' otherlv_26= ':' ( (lv_minRam_27_0= RULE_INT ) ) otherlv_28= '..' ( (lv_maxRam_29_0= RULE_INT ) )?
                    	            {
                    	            otherlv_25=(Token)match(input,27,FOLLOW_27_in_ruleVMCS1157); 

                    	                	newLeafNode(otherlv_25, grammarAccess.getVMCSAccess().getRamKeyword_3_1_0_7_0());
                    	                
                    	            otherlv_26=(Token)match(input,17,FOLLOW_17_in_ruleVMCS1169); 

                    	                	newLeafNode(otherlv_26, grammarAccess.getVMCSAccess().getColonKeyword_3_1_0_7_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:647:1: ( (lv_minRam_27_0= RULE_INT ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:648:1: (lv_minRam_27_0= RULE_INT )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:648:1: (lv_minRam_27_0= RULE_INT )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:649:3: lv_minRam_27_0= RULE_INT
                    	            {
                    	            lv_minRam_27_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVMCS1186); 

                    	            			newLeafNode(lv_minRam_27_0, grammarAccess.getVMCSAccess().getMinRamINTTerminalRuleCall_3_1_0_7_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"minRam",
                    	                    		lv_minRam_27_0, 
                    	                    		"INT");
                    	            	    

                    	            }


                    	            }

                    	            otherlv_28=(Token)match(input,26,FOLLOW_26_in_ruleVMCS1203); 

                    	                	newLeafNode(otherlv_28, grammarAccess.getVMCSAccess().getFullStopFullStopKeyword_3_1_0_7_3());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:669:1: ( (lv_maxRam_29_0= RULE_INT ) )?
                    	            int alt9=2;
                    	            int LA9_0 = input.LA(1);

                    	            if ( (LA9_0==RULE_INT) ) {
                    	                alt9=1;
                    	            }
                    	            switch (alt9) {
                    	                case 1 :
                    	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:670:1: (lv_maxRam_29_0= RULE_INT )
                    	                    {
                    	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:670:1: (lv_maxRam_29_0= RULE_INT )
                    	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:671:3: lv_maxRam_29_0= RULE_INT
                    	                    {
                    	                    lv_maxRam_29_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVMCS1220); 

                    	                    			newLeafNode(lv_maxRam_29_0, grammarAccess.getVMCSAccess().getMaxRamINTTerminalRuleCall_3_1_0_7_4_0()); 
                    	                    		

                    	                    	        if (current==null) {
                    	                    	            current = createModelElement(grammarAccess.getVMCSRule());
                    	                    	        }
                    	                           		setWithLastConsumed(
                    	                           			current, 
                    	                           			"maxRam",
                    	                            		lv_maxRam_29_0, 
                    	                            		"INT");
                    	                    	    

                    	                    }


                    	                    }
                    	                    break;

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 9 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:688:6: (otherlv_30= 'storage' otherlv_31= ':' ( (lv_minStorage_32_0= RULE_INT ) ) otherlv_33= '..' ( (lv_maxStorage_34_0= RULE_INT ) )? )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:688:6: (otherlv_30= 'storage' otherlv_31= ':' ( (lv_minStorage_32_0= RULE_INT ) ) otherlv_33= '..' ( (lv_maxStorage_34_0= RULE_INT ) )? )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:688:8: otherlv_30= 'storage' otherlv_31= ':' ( (lv_minStorage_32_0= RULE_INT ) ) otherlv_33= '..' ( (lv_maxStorage_34_0= RULE_INT ) )?
                    	            {
                    	            otherlv_30=(Token)match(input,28,FOLLOW_28_in_ruleVMCS1246); 

                    	                	newLeafNode(otherlv_30, grammarAccess.getVMCSAccess().getStorageKeyword_3_1_0_8_0());
                    	                
                    	            otherlv_31=(Token)match(input,17,FOLLOW_17_in_ruleVMCS1258); 

                    	                	newLeafNode(otherlv_31, grammarAccess.getVMCSAccess().getColonKeyword_3_1_0_8_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:696:1: ( (lv_minStorage_32_0= RULE_INT ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:697:1: (lv_minStorage_32_0= RULE_INT )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:697:1: (lv_minStorage_32_0= RULE_INT )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:698:3: lv_minStorage_32_0= RULE_INT
                    	            {
                    	            lv_minStorage_32_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVMCS1275); 

                    	            			newLeafNode(lv_minStorage_32_0, grammarAccess.getVMCSAccess().getMinStorageINTTerminalRuleCall_3_1_0_8_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"minStorage",
                    	                    		lv_minStorage_32_0, 
                    	                    		"INT");
                    	            	    

                    	            }


                    	            }

                    	            otherlv_33=(Token)match(input,26,FOLLOW_26_in_ruleVMCS1292); 

                    	                	newLeafNode(otherlv_33, grammarAccess.getVMCSAccess().getFullStopFullStopKeyword_3_1_0_8_3());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:718:1: ( (lv_maxStorage_34_0= RULE_INT ) )?
                    	            int alt10=2;
                    	            int LA10_0 = input.LA(1);

                    	            if ( (LA10_0==RULE_INT) ) {
                    	                alt10=1;
                    	            }
                    	            switch (alt10) {
                    	                case 1 :
                    	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:719:1: (lv_maxStorage_34_0= RULE_INT )
                    	                    {
                    	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:719:1: (lv_maxStorage_34_0= RULE_INT )
                    	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:720:3: lv_maxStorage_34_0= RULE_INT
                    	                    {
                    	                    lv_maxStorage_34_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVMCS1309); 

                    	                    			newLeafNode(lv_maxStorage_34_0, grammarAccess.getVMCSAccess().getMaxStorageINTTerminalRuleCall_3_1_0_8_4_0()); 
                    	                    		

                    	                    	        if (current==null) {
                    	                    	            current = createModelElement(grammarAccess.getVMCSRule());
                    	                    	        }
                    	                           		setWithLastConsumed(
                    	                           			current, 
                    	                           			"maxStorage",
                    	                            		lv_maxStorage_34_0, 
                    	                            		"INT");
                    	                    	    

                    	                    }


                    	                    }
                    	                    break;

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 10 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:737:6: (otherlv_35= 'os' otherlv_36= ':' ( (lv_os_37_0= RULE_STRING ) ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:737:6: (otherlv_35= 'os' otherlv_36= ':' ( (lv_os_37_0= RULE_STRING ) ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:737:8: otherlv_35= 'os' otherlv_36= ':' ( (lv_os_37_0= RULE_STRING ) )
                    	            {
                    	            otherlv_35=(Token)match(input,29,FOLLOW_29_in_ruleVMCS1335); 

                    	                	newLeafNode(otherlv_35, grammarAccess.getVMCSAccess().getOsKeyword_3_1_0_9_0());
                    	                
                    	            otherlv_36=(Token)match(input,17,FOLLOW_17_in_ruleVMCS1347); 

                    	                	newLeafNode(otherlv_36, grammarAccess.getVMCSAccess().getColonKeyword_3_1_0_9_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:745:1: ( (lv_os_37_0= RULE_STRING ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:746:1: (lv_os_37_0= RULE_STRING )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:746:1: (lv_os_37_0= RULE_STRING )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:747:3: lv_os_37_0= RULE_STRING
                    	            {
                    	            lv_os_37_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1364); 

                    	            			newLeafNode(lv_os_37_0, grammarAccess.getVMCSAccess().getOsSTRINGTerminalRuleCall_3_1_0_9_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"os",
                    	                    		lv_os_37_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 11 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:764:6: (otherlv_38= 'passwd' otherlv_39= ':' ( (lv_passwd_40_0= RULE_STRING ) ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:764:6: (otherlv_38= 'passwd' otherlv_39= ':' ( (lv_passwd_40_0= RULE_STRING ) ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:764:8: otherlv_38= 'passwd' otherlv_39= ':' ( (lv_passwd_40_0= RULE_STRING ) )
                    	            {
                    	            otherlv_38=(Token)match(input,30,FOLLOW_30_in_ruleVMCS1389); 

                    	                	newLeafNode(otherlv_38, grammarAccess.getVMCSAccess().getPasswdKeyword_3_1_0_10_0());
                    	                
                    	            otherlv_39=(Token)match(input,17,FOLLOW_17_in_ruleVMCS1401); 

                    	                	newLeafNode(otherlv_39, grammarAccess.getVMCSAccess().getColonKeyword_3_1_0_10_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:772:1: ( (lv_passwd_40_0= RULE_STRING ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:773:1: (lv_passwd_40_0= RULE_STRING )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:773:1: (lv_passwd_40_0= RULE_STRING )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:774:3: lv_passwd_40_0= RULE_STRING
                    	            {
                    	            lv_passwd_40_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1418); 

                    	            			newLeafNode(lv_passwd_40_0, grammarAccess.getVMCSAccess().getPasswdSTRINGTerminalRuleCall_3_1_0_10_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"passwd",
                    	                    		lv_passwd_40_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 12 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:791:6: (otherlv_41= 'privateKey' otherlv_42= ':' ( (lv_privateKey_43_0= RULE_STRING ) ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:791:6: (otherlv_41= 'privateKey' otherlv_42= ':' ( (lv_privateKey_43_0= RULE_STRING ) ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:791:8: otherlv_41= 'privateKey' otherlv_42= ':' ( (lv_privateKey_43_0= RULE_STRING ) )
                    	            {
                    	            otherlv_41=(Token)match(input,31,FOLLOW_31_in_ruleVMCS1443); 

                    	                	newLeafNode(otherlv_41, grammarAccess.getVMCSAccess().getPrivateKeyKeyword_3_1_0_11_0());
                    	                
                    	            otherlv_42=(Token)match(input,17,FOLLOW_17_in_ruleVMCS1455); 

                    	                	newLeafNode(otherlv_42, grammarAccess.getVMCSAccess().getColonKeyword_3_1_0_11_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:799:1: ( (lv_privateKey_43_0= RULE_STRING ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:800:1: (lv_privateKey_43_0= RULE_STRING )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:800:1: (lv_privateKey_43_0= RULE_STRING )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:801:3: lv_privateKey_43_0= RULE_STRING
                    	            {
                    	            lv_privateKey_43_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1472); 

                    	            			newLeafNode(lv_privateKey_43_0, grammarAccess.getVMCSAccess().getPrivateKeySTRINGTerminalRuleCall_3_1_0_11_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"privateKey",
                    	                    		lv_privateKey_43_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 13 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:818:6: (otherlv_44= 'region' otherlv_45= ':' ( (lv_Region_46_0= RULE_STRING ) ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:818:6: (otherlv_44= 'region' otherlv_45= ':' ( (lv_Region_46_0= RULE_STRING ) ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:818:8: otherlv_44= 'region' otherlv_45= ':' ( (lv_Region_46_0= RULE_STRING ) )
                    	            {
                    	            otherlv_44=(Token)match(input,32,FOLLOW_32_in_ruleVMCS1497); 

                    	                	newLeafNode(otherlv_44, grammarAccess.getVMCSAccess().getRegionKeyword_3_1_0_12_0());
                    	                
                    	            otherlv_45=(Token)match(input,17,FOLLOW_17_in_ruleVMCS1509); 

                    	                	newLeafNode(otherlv_45, grammarAccess.getVMCSAccess().getColonKeyword_3_1_0_12_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:826:1: ( (lv_Region_46_0= RULE_STRING ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:827:1: (lv_Region_46_0= RULE_STRING )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:827:1: (lv_Region_46_0= RULE_STRING )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:828:3: lv_Region_46_0= RULE_STRING
                    	            {
                    	            lv_Region_46_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1526); 

                    	            			newLeafNode(lv_Region_46_0, grammarAccess.getVMCSAccess().getRegionSTRINGTerminalRuleCall_3_1_0_12_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"Region",
                    	                    		lv_Region_46_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 14 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:845:6: (otherlv_47= 'securityGroup' otherlv_48= ':' ( (lv_securityGroup_49_0= RULE_STRING ) ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:845:6: (otherlv_47= 'securityGroup' otherlv_48= ':' ( (lv_securityGroup_49_0= RULE_STRING ) ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:845:8: otherlv_47= 'securityGroup' otherlv_48= ':' ( (lv_securityGroup_49_0= RULE_STRING ) )
                    	            {
                    	            otherlv_47=(Token)match(input,33,FOLLOW_33_in_ruleVMCS1551); 

                    	                	newLeafNode(otherlv_47, grammarAccess.getVMCSAccess().getSecurityGroupKeyword_3_1_0_13_0());
                    	                
                    	            otherlv_48=(Token)match(input,17,FOLLOW_17_in_ruleVMCS1563); 

                    	                	newLeafNode(otherlv_48, grammarAccess.getVMCSAccess().getColonKeyword_3_1_0_13_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:853:1: ( (lv_securityGroup_49_0= RULE_STRING ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:854:1: (lv_securityGroup_49_0= RULE_STRING )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:854:1: (lv_securityGroup_49_0= RULE_STRING )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:855:3: lv_securityGroup_49_0= RULE_STRING
                    	            {
                    	            lv_securityGroup_49_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1580); 

                    	            			newLeafNode(lv_securityGroup_49_0, grammarAccess.getVMCSAccess().getSecurityGroupSTRINGTerminalRuleCall_3_1_0_13_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"securityGroup",
                    	                    		lv_securityGroup_49_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 15 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:872:6: (otherlv_50= 'serviceType' otherlv_51= ':' ( (lv_serviceType_52_0= RULE_STRING ) ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:872:6: (otherlv_50= 'serviceType' otherlv_51= ':' ( (lv_serviceType_52_0= RULE_STRING ) ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:872:8: otherlv_50= 'serviceType' otherlv_51= ':' ( (lv_serviceType_52_0= RULE_STRING ) )
                    	            {
                    	            otherlv_50=(Token)match(input,34,FOLLOW_34_in_ruleVMCS1605); 

                    	                	newLeafNode(otherlv_50, grammarAccess.getVMCSAccess().getServiceTypeKeyword_3_1_0_14_0());
                    	                
                    	            otherlv_51=(Token)match(input,17,FOLLOW_17_in_ruleVMCS1617); 

                    	                	newLeafNode(otherlv_51, grammarAccess.getVMCSAccess().getColonKeyword_3_1_0_14_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:880:1: ( (lv_serviceType_52_0= RULE_STRING ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:881:1: (lv_serviceType_52_0= RULE_STRING )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:881:1: (lv_serviceType_52_0= RULE_STRING )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:882:3: lv_serviceType_52_0= RULE_STRING
                    	            {
                    	            lv_serviceType_52_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1634); 

                    	            			newLeafNode(lv_serviceType_52_0, grammarAccess.getVMCSAccess().getServiceTypeSTRINGTerminalRuleCall_3_1_0_14_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"serviceType",
                    	                    		lv_serviceType_52_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 16 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:899:6: (otherlv_53= 'sshKey' otherlv_54= ':' ( (lv_sshKey_55_0= RULE_STRING ) ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:899:6: (otherlv_53= 'sshKey' otherlv_54= ':' ( (lv_sshKey_55_0= RULE_STRING ) ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:899:8: otherlv_53= 'sshKey' otherlv_54= ':' ( (lv_sshKey_55_0= RULE_STRING ) )
                    	            {
                    	            otherlv_53=(Token)match(input,35,FOLLOW_35_in_ruleVMCS1659); 

                    	                	newLeafNode(otherlv_53, grammarAccess.getVMCSAccess().getSshKeyKeyword_3_1_0_15_0());
                    	                
                    	            otherlv_54=(Token)match(input,17,FOLLOW_17_in_ruleVMCS1671); 

                    	                	newLeafNode(otherlv_54, grammarAccess.getVMCSAccess().getColonKeyword_3_1_0_15_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:907:1: ( (lv_sshKey_55_0= RULE_STRING ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:908:1: (lv_sshKey_55_0= RULE_STRING )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:908:1: (lv_sshKey_55_0= RULE_STRING )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:909:3: lv_sshKey_55_0= RULE_STRING
                    	            {
                    	            lv_sshKey_55_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1688); 

                    	            			newLeafNode(lv_sshKey_55_0, grammarAccess.getVMCSAccess().getSshKeySTRINGTerminalRuleCall_3_1_0_15_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getVMCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"sshKey",
                    	                    		lv_sshKey_55_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:925:4: (otherlv_56= ',' )?
                    	    int alt12=2;
                    	    int LA12_0 = input.LA(1);

                    	    if ( (LA12_0==36) ) {
                    	        alt12=1;
                    	    }
                    	    switch (alt12) {
                    	        case 1 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:925:6: otherlv_56= ','
                    	            {
                    	            otherlv_56=(Token)match(input,36,FOLLOW_36_in_ruleVMCS1708); 

                    	                	newLeafNode(otherlv_56, grammarAccess.getVMCSAccess().getCommaKeyword_3_1_1());
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_57=(Token)match(input,37,FOLLOW_37_in_ruleVMCS1724); 

                        	newLeafNode(otherlv_57, grammarAccess.getVMCSAccess().getRightSquareBracketKeyword_3_2());
                        

                    }
                    break;

            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:933:3: ( (lv_providedPorts_58_0= ruleProvidedPortCS ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==40) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==41) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:934:1: (lv_providedPorts_58_0= ruleProvidedPortCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:934:1: (lv_providedPorts_58_0= ruleProvidedPortCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:935:3: lv_providedPorts_58_0= ruleProvidedPortCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVMCSAccess().getProvidedPortsProvidedPortCSParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProvidedPortCS_in_ruleVMCS1747);
            	    lv_providedPorts_58_0=ruleProvidedPortCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVMCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providedPorts",
            	            		lv_providedPorts_58_0, 
            	            		"ProvidedPortCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:951:3: ( (lv_providedExecutionPlatforms_59_0= ruleProvidedExecutionPlatformCS ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:952:1: (lv_providedExecutionPlatforms_59_0= ruleProvidedExecutionPlatformCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:952:1: (lv_providedExecutionPlatforms_59_0= ruleProvidedExecutionPlatformCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:953:3: lv_providedExecutionPlatforms_59_0= ruleProvidedExecutionPlatformCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVMCSAccess().getProvidedExecutionPlatformsProvidedExecutionPlatformCSParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProvidedExecutionPlatformCS_in_ruleVMCS1769);
            	    lv_providedExecutionPlatforms_59_0=ruleProvidedExecutionPlatformCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVMCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providedExecutionPlatforms",
            	            		lv_providedExecutionPlatforms_59_0, 
            	            		"ProvidedExecutionPlatformCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:969:3: (otherlv_60= 'properties' otherlv_61= ':' ( (lv_properties_62_0= rulePropertyCS ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:969:5: otherlv_60= 'properties' otherlv_61= ':' ( (lv_properties_62_0= rulePropertyCS ) )*
                    {
                    otherlv_60=(Token)match(input,38,FOLLOW_38_in_ruleVMCS1783); 

                        	newLeafNode(otherlv_60, grammarAccess.getVMCSAccess().getPropertiesKeyword_6_0());
                        
                    otherlv_61=(Token)match(input,17,FOLLOW_17_in_ruleVMCS1795); 

                        	newLeafNode(otherlv_61, grammarAccess.getVMCSAccess().getColonKeyword_6_1());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:977:1: ( (lv_properties_62_0= rulePropertyCS ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==52) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:978:1: (lv_properties_62_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:978:1: (lv_properties_62_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:979:3: lv_properties_62_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVMCSAccess().getPropertiesPropertyCSParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleVMCS1816);
                    	    lv_properties_62_0=rulePropertyCS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVMCSRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_62_0, 
                    	            		"PropertyCS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_63=(Token)match(input,14,FOLLOW_14_in_ruleVMCS1831); 

                	newLeafNode(otherlv_63, grammarAccess.getVMCSAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleExternalComponentCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1009:1: entryRuleExternalComponentCS returns [EObject current=null] : iv_ruleExternalComponentCS= ruleExternalComponentCS EOF ;
    public final EObject entryRuleExternalComponentCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalComponentCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1010:2: (iv_ruleExternalComponentCS= ruleExternalComponentCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1011:2: iv_ruleExternalComponentCS= ruleExternalComponentCS EOF
            {
             newCompositeNode(grammarAccess.getExternalComponentCSRule()); 
            pushFollow(FOLLOW_ruleExternalComponentCS_in_entryRuleExternalComponentCS1869);
            iv_ruleExternalComponentCS=ruleExternalComponentCS();

            state._fsp--;

             current =iv_ruleExternalComponentCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalComponentCS1879); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1018:1: ruleExternalComponentCS returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_providedPorts_3_0= ruleProvidedPortCS ) ) | ( (lv_providedExecutionPlatforms_4_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_5= 'properties' otherlv_6= ':' ( (lv_properties_7_0= rulePropertyCS ) )* )? ( (lv_resources_8_0= ruleResourceCS ) )* otherlv_9= '}' ) ;
    public final EObject ruleExternalComponentCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_providedPorts_3_0 = null;

        EObject lv_providedExecutionPlatforms_4_0 = null;

        EObject lv_properties_7_0 = null;

        EObject lv_resources_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1021:28: ( (otherlv_0= 'external' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_providedPorts_3_0= ruleProvidedPortCS ) ) | ( (lv_providedExecutionPlatforms_4_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_5= 'properties' otherlv_6= ':' ( (lv_properties_7_0= rulePropertyCS ) )* )? ( (lv_resources_8_0= ruleResourceCS ) )* otherlv_9= '}' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1022:1: (otherlv_0= 'external' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_providedPorts_3_0= ruleProvidedPortCS ) ) | ( (lv_providedExecutionPlatforms_4_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_5= 'properties' otherlv_6= ':' ( (lv_properties_7_0= rulePropertyCS ) )* )? ( (lv_resources_8_0= ruleResourceCS ) )* otherlv_9= '}' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1022:1: (otherlv_0= 'external' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_providedPorts_3_0= ruleProvidedPortCS ) ) | ( (lv_providedExecutionPlatforms_4_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_5= 'properties' otherlv_6= ':' ( (lv_properties_7_0= rulePropertyCS ) )* )? ( (lv_resources_8_0= ruleResourceCS ) )* otherlv_9= '}' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1022:3: otherlv_0= 'external' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_providedPorts_3_0= ruleProvidedPortCS ) ) | ( (lv_providedExecutionPlatforms_4_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_5= 'properties' otherlv_6= ':' ( (lv_properties_7_0= rulePropertyCS ) )* )? ( (lv_resources_8_0= ruleResourceCS ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleExternalComponentCS1916); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalComponentCSAccess().getExternalKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1026:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1027:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1027:1: (lv_name_1_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1028:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getExternalComponentCSAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleExternalComponentCS1937);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalComponentCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleExternalComponentCS1949); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalComponentCSAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1048:1: ( ( (lv_providedPorts_3_0= ruleProvidedPortCS ) ) | ( (lv_providedExecutionPlatforms_4_0= ruleProvidedExecutionPlatformCS ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==46) ) {
                        alt19=2;
                    }
                    else if ( (LA19_2==41) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1048:2: ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1048:2: ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1049:1: (lv_providedPorts_3_0= ruleProvidedPortCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1049:1: (lv_providedPorts_3_0= ruleProvidedPortCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1050:3: lv_providedPorts_3_0= ruleProvidedPortCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExternalComponentCSAccess().getProvidedPortsProvidedPortCSParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProvidedPortCS_in_ruleExternalComponentCS1971);
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


            	    }
            	    break;
            	case 2 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1067:6: ( (lv_providedExecutionPlatforms_4_0= ruleProvidedExecutionPlatformCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1067:6: ( (lv_providedExecutionPlatforms_4_0= ruleProvidedExecutionPlatformCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1068:1: (lv_providedExecutionPlatforms_4_0= ruleProvidedExecutionPlatformCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1068:1: (lv_providedExecutionPlatforms_4_0= ruleProvidedExecutionPlatformCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1069:3: lv_providedExecutionPlatforms_4_0= ruleProvidedExecutionPlatformCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExternalComponentCSAccess().getProvidedExecutionPlatformsProvidedExecutionPlatformCSParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProvidedExecutionPlatformCS_in_ruleExternalComponentCS1998);
            	    lv_providedExecutionPlatforms_4_0=ruleProvidedExecutionPlatformCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExternalComponentCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providedExecutionPlatforms",
            	            		lv_providedExecutionPlatforms_4_0, 
            	            		"ProvidedExecutionPlatformCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1085:4: (otherlv_5= 'properties' otherlv_6= ':' ( (lv_properties_7_0= rulePropertyCS ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1085:6: otherlv_5= 'properties' otherlv_6= ':' ( (lv_properties_7_0= rulePropertyCS ) )*
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleExternalComponentCS2013); 

                        	newLeafNode(otherlv_5, grammarAccess.getExternalComponentCSAccess().getPropertiesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleExternalComponentCS2025); 

                        	newLeafNode(otherlv_6, grammarAccess.getExternalComponentCSAccess().getColonKeyword_4_1());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1093:1: ( (lv_properties_7_0= rulePropertyCS ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==52) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1094:1: (lv_properties_7_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1094:1: (lv_properties_7_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1095:3: lv_properties_7_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExternalComponentCSAccess().getPropertiesPropertyCSParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleExternalComponentCS2046);
                    	    lv_properties_7_0=rulePropertyCS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExternalComponentCSRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_7_0, 
                    	            		"PropertyCS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1111:5: ( (lv_resources_8_0= ruleResourceCS ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==54) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1112:1: (lv_resources_8_0= ruleResourceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1112:1: (lv_resources_8_0= ruleResourceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1113:3: lv_resources_8_0= ruleResourceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExternalComponentCSAccess().getResourcesResourceCSParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceCS_in_ruleExternalComponentCS2070);
            	    lv_resources_8_0=ruleResourceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExternalComponentCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_8_0, 
            	            		"ResourceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleExternalComponentCS2083); 

                	newLeafNode(otherlv_9, grammarAccess.getExternalComponentCSAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1141:1: entryRuleProvidedPortCS returns [EObject current=null] : iv_ruleProvidedPortCS= ruleProvidedPortCS EOF ;
    public final EObject entryRuleProvidedPortCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedPortCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1142:2: (iv_ruleProvidedPortCS= ruleProvidedPortCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1143:2: iv_ruleProvidedPortCS= ruleProvidedPortCS EOF
            {
             newCompositeNode(grammarAccess.getProvidedPortCSRule()); 
            pushFollow(FOLLOW_ruleProvidedPortCS_in_entryRuleProvidedPortCS2119);
            iv_ruleProvidedPortCS=ruleProvidedPortCS();

            state._fsp--;

             current =iv_ruleProvidedPortCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedPortCS2129); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1150:1: ruleProvidedPortCS returns [EObject current=null] : (otherlv_0= 'provided' otherlv_1= 'port' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' )? ( (lv_properties_11_0= rulePropertyCS ) )* )? ) ;
    public final EObject ruleProvidedPortCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_isLocal_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_portNumber_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1153:28: ( (otherlv_0= 'provided' otherlv_1= 'port' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' )? ( (lv_properties_11_0= rulePropertyCS ) )* )? ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1154:1: (otherlv_0= 'provided' otherlv_1= 'port' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' )? ( (lv_properties_11_0= rulePropertyCS ) )* )? )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1154:1: (otherlv_0= 'provided' otherlv_1= 'port' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' )? ( (lv_properties_11_0= rulePropertyCS ) )* )? )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1154:3: otherlv_0= 'provided' otherlv_1= 'port' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' )? ( (lv_properties_11_0= rulePropertyCS ) )* )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleProvidedPortCS2166); 

                	newLeafNode(otherlv_0, grammarAccess.getProvidedPortCSAccess().getProvidedKeyword_0());
                
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleProvidedPortCS2178); 

                	newLeafNode(otherlv_1, grammarAccess.getProvidedPortCSAccess().getPortKeyword_1());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1162:1: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1163:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1163:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1164:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getProvidedPortCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleProvidedPortCS2199);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProvidedPortCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1180:2: (otherlv_3= ':' (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' )? ( (lv_properties_11_0= rulePropertyCS ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1180:4: otherlv_3= ':' (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' )? ( (lv_properties_11_0= rulePropertyCS ) )*
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleProvidedPortCS2212); 

                        	newLeafNode(otherlv_3, grammarAccess.getProvidedPortCSAccess().getColonKeyword_3_0());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1184:1: (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==19) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1184:3: otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']'
                            {
                            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleProvidedPortCS2225); 

                                	newLeafNode(otherlv_4, grammarAccess.getProvidedPortCSAccess().getLeftSquareBracketKeyword_3_1_0());
                                
                            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1188:1: ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) ) (otherlv_9= ',' )? )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( ((LA25_0>=41 && LA25_0<=42)) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1188:2: ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) ) (otherlv_9= ',' )?
                            	    {
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1188:2: ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) )
                            	    int alt23=2;
                            	    int LA23_0 = input.LA(1);

                            	    if ( (LA23_0==42) ) {
                            	        alt23=1;
                            	    }
                            	    else if ( (LA23_0==41) ) {
                            	        alt23=2;
                            	    }
                            	    else {
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 23, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt23) {
                            	        case 1 :
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1188:3: ( (lv_isLocal_5_0= 'local' ) )
                            	            {
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1188:3: ( (lv_isLocal_5_0= 'local' ) )
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1189:1: (lv_isLocal_5_0= 'local' )
                            	            {
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1189:1: (lv_isLocal_5_0= 'local' )
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1190:3: lv_isLocal_5_0= 'local'
                            	            {
                            	            lv_isLocal_5_0=(Token)match(input,42,FOLLOW_42_in_ruleProvidedPortCS2245); 

                            	                    newLeafNode(lv_isLocal_5_0, grammarAccess.getProvidedPortCSAccess().getIsLocalLocalKeyword_3_1_1_0_0_0());
                            	                

                            	            	        if (current==null) {
                            	            	            current = createModelElement(grammarAccess.getProvidedPortCSRule());
                            	            	        }
                            	                   		setWithLastConsumed(current, "isLocal", true, "local");
                            	            	    

                            	            }


                            	            }


                            	            }
                            	            break;
                            	        case 2 :
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1204:6: (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) )
                            	            {
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1204:6: (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) )
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1204:8: otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) )
                            	            {
                            	            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleProvidedPortCS2277); 

                            	                	newLeafNode(otherlv_6, grammarAccess.getProvidedPortCSAccess().getPortKeyword_3_1_1_0_1_0());
                            	                
                            	            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleProvidedPortCS2289); 

                            	                	newLeafNode(otherlv_7, grammarAccess.getProvidedPortCSAccess().getColonKeyword_3_1_1_0_1_1());
                            	                
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1212:1: ( (lv_portNumber_8_0= RULE_INT ) )
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1213:1: (lv_portNumber_8_0= RULE_INT )
                            	            {
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1213:1: (lv_portNumber_8_0= RULE_INT )
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1214:3: lv_portNumber_8_0= RULE_INT
                            	            {
                            	            lv_portNumber_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProvidedPortCS2306); 

                            	            			newLeafNode(lv_portNumber_8_0, grammarAccess.getProvidedPortCSAccess().getPortNumberINTTerminalRuleCall_3_1_1_0_1_2_0()); 
                            	            		

                            	            	        if (current==null) {
                            	            	            current = createModelElement(grammarAccess.getProvidedPortCSRule());
                            	            	        }
                            	                   		setWithLastConsumed(
                            	                   			current, 
                            	                   			"portNumber",
                            	                    		lv_portNumber_8_0, 
                            	                    		"INT");
                            	            	    

                            	            }


                            	            }


                            	            }


                            	            }
                            	            break;

                            	    }

                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1230:4: (otherlv_9= ',' )?
                            	    int alt24=2;
                            	    int LA24_0 = input.LA(1);

                            	    if ( (LA24_0==36) ) {
                            	        alt24=1;
                            	    }
                            	    switch (alt24) {
                            	        case 1 :
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1230:6: otherlv_9= ','
                            	            {
                            	            otherlv_9=(Token)match(input,36,FOLLOW_36_in_ruleProvidedPortCS2326); 

                            	                	newLeafNode(otherlv_9, grammarAccess.getProvidedPortCSAccess().getCommaKeyword_3_1_1_1());
                            	                

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop25;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleProvidedPortCS2342); 

                                	newLeafNode(otherlv_10, grammarAccess.getProvidedPortCSAccess().getRightSquareBracketKeyword_3_1_2());
                                

                            }
                            break;

                    }

                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1238:3: ( (lv_properties_11_0= rulePropertyCS ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==52) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1239:1: (lv_properties_11_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1239:1: (lv_properties_11_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1240:3: lv_properties_11_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProvidedPortCSAccess().getPropertiesPropertyCSParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleProvidedPortCS2365);
                    	    lv_properties_11_0=rulePropertyCS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProvidedPortCSRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_11_0, 
                    	            		"PropertyCS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1264:1: entryRuleInternalComponentCS returns [EObject current=null] : iv_ruleInternalComponentCS= ruleInternalComponentCS EOF ;
    public final EObject entryRuleInternalComponentCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalComponentCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1265:2: (iv_ruleInternalComponentCS= ruleInternalComponentCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1266:2: iv_ruleInternalComponentCS= ruleInternalComponentCS EOF
            {
             newCompositeNode(grammarAccess.getInternalComponentCSRule()); 
            pushFollow(FOLLOW_ruleInternalComponentCS_in_entryRuleInternalComponentCS2404);
            iv_ruleInternalComponentCS=ruleInternalComponentCS();

            state._fsp--;

             current =iv_ruleInternalComponentCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalComponentCS2414); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1273:1: ruleInternalComponentCS returns [EObject current=null] : (otherlv_0= 'internal' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_providedPorts_3_0= ruleProvidedPortCS ) ) | ( (lv_requiredPorts_4_0= ruleRequiredPortCS ) ) | ( (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS ) ) | ( (lv_providedExecutionPlatforms_6_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? ( (lv_resources_10_0= ruleResourceCS ) )* otherlv_11= '}' ) ;
    public final EObject ruleInternalComponentCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_providedPorts_3_0 = null;

        EObject lv_requiredPorts_4_0 = null;

        EObject lv_requiredExecutionPlatform_5_0 = null;

        EObject lv_providedExecutionPlatforms_6_0 = null;

        EObject lv_properties_9_0 = null;

        EObject lv_resources_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1276:28: ( (otherlv_0= 'internal' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_providedPorts_3_0= ruleProvidedPortCS ) ) | ( (lv_requiredPorts_4_0= ruleRequiredPortCS ) ) | ( (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS ) ) | ( (lv_providedExecutionPlatforms_6_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? ( (lv_resources_10_0= ruleResourceCS ) )* otherlv_11= '}' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1277:1: (otherlv_0= 'internal' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_providedPorts_3_0= ruleProvidedPortCS ) ) | ( (lv_requiredPorts_4_0= ruleRequiredPortCS ) ) | ( (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS ) ) | ( (lv_providedExecutionPlatforms_6_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? ( (lv_resources_10_0= ruleResourceCS ) )* otherlv_11= '}' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1277:1: (otherlv_0= 'internal' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_providedPorts_3_0= ruleProvidedPortCS ) ) | ( (lv_requiredPorts_4_0= ruleRequiredPortCS ) ) | ( (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS ) ) | ( (lv_providedExecutionPlatforms_6_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? ( (lv_resources_10_0= ruleResourceCS ) )* otherlv_11= '}' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1277:3: otherlv_0= 'internal' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_providedPorts_3_0= ruleProvidedPortCS ) ) | ( (lv_requiredPorts_4_0= ruleRequiredPortCS ) ) | ( (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS ) ) | ( (lv_providedExecutionPlatforms_6_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? ( (lv_resources_10_0= ruleResourceCS ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleInternalComponentCS2451); 

                	newLeafNode(otherlv_0, grammarAccess.getInternalComponentCSAccess().getInternalKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1281:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1282:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1282:1: (lv_name_1_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1283:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleInternalComponentCS2472);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInternalComponentCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleInternalComponentCS2484); 

                	newLeafNode(otherlv_2, grammarAccess.getInternalComponentCSAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1303:1: ( ( (lv_providedPorts_3_0= ruleProvidedPortCS ) ) | ( (lv_requiredPorts_4_0= ruleRequiredPortCS ) ) | ( (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS ) ) | ( (lv_providedExecutionPlatforms_6_0= ruleProvidedExecutionPlatformCS ) ) )*
            loop29:
            do {
                int alt29=5;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==40) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==46) ) {
                        alt29=4;
                    }
                    else if ( (LA29_2==41) ) {
                        alt29=1;
                    }


                }
                else if ( (LA29_0==44) ) {
                    int LA29_3 = input.LA(2);

                    if ( (LA29_3==41) ) {
                        alt29=2;
                    }
                    else if ( (LA29_3==46) ) {
                        alt29=3;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1303:2: ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1303:2: ( (lv_providedPorts_3_0= ruleProvidedPortCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1304:1: (lv_providedPorts_3_0= ruleProvidedPortCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1304:1: (lv_providedPorts_3_0= ruleProvidedPortCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1305:3: lv_providedPorts_3_0= ruleProvidedPortCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getProvidedPortsProvidedPortCSParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProvidedPortCS_in_ruleInternalComponentCS2506);
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


            	    }
            	    break;
            	case 2 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1322:6: ( (lv_requiredPorts_4_0= ruleRequiredPortCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1322:6: ( (lv_requiredPorts_4_0= ruleRequiredPortCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1323:1: (lv_requiredPorts_4_0= ruleRequiredPortCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1323:1: (lv_requiredPorts_4_0= ruleRequiredPortCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1324:3: lv_requiredPorts_4_0= ruleRequiredPortCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getRequiredPortsRequiredPortCSParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequiredPortCS_in_ruleInternalComponentCS2533);
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


            	    }
            	    break;
            	case 3 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1341:6: ( (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1341:6: ( (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1342:1: (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1342:1: (lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1343:3: lv_requiredExecutionPlatform_5_0= ruleRequiredExecutionPlatformCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getRequiredExecutionPlatformRequiredExecutionPlatformCSParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequiredExecutionPlatformCS_in_ruleInternalComponentCS2560);
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


            	    }
            	    break;
            	case 4 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1360:6: ( (lv_providedExecutionPlatforms_6_0= ruleProvidedExecutionPlatformCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1360:6: ( (lv_providedExecutionPlatforms_6_0= ruleProvidedExecutionPlatformCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1361:1: (lv_providedExecutionPlatforms_6_0= ruleProvidedExecutionPlatformCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1361:1: (lv_providedExecutionPlatforms_6_0= ruleProvidedExecutionPlatformCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1362:3: lv_providedExecutionPlatforms_6_0= ruleProvidedExecutionPlatformCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getProvidedExecutionPlatformsProvidedExecutionPlatformCSParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProvidedExecutionPlatformCS_in_ruleInternalComponentCS2587);
            	    lv_providedExecutionPlatforms_6_0=ruleProvidedExecutionPlatformCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInternalComponentCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providedExecutionPlatforms",
            	            		lv_providedExecutionPlatforms_6_0, 
            	            		"ProvidedExecutionPlatformCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1378:4: (otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1378:6: otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )*
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleInternalComponentCS2602); 

                        	newLeafNode(otherlv_7, grammarAccess.getInternalComponentCSAccess().getPropertiesKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleInternalComponentCS2614); 

                        	newLeafNode(otherlv_8, grammarAccess.getInternalComponentCSAccess().getColonKeyword_4_1());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1386:1: ( (lv_properties_9_0= rulePropertyCS ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==52) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1387:1: (lv_properties_9_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1387:1: (lv_properties_9_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1388:3: lv_properties_9_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getPropertiesPropertyCSParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleInternalComponentCS2635);
                    	    lv_properties_9_0=rulePropertyCS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInternalComponentCSRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_9_0, 
                    	            		"PropertyCS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1404:5: ( (lv_resources_10_0= ruleResourceCS ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==54) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1405:1: (lv_resources_10_0= ruleResourceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1405:1: (lv_resources_10_0= ruleResourceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1406:3: lv_resources_10_0= ruleResourceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getResourcesResourceCSParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceCS_in_ruleInternalComponentCS2659);
            	    lv_resources_10_0=ruleResourceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInternalComponentCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_10_0, 
            	            		"ResourceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleInternalComponentCS2672); 

                	newLeafNode(otherlv_11, grammarAccess.getInternalComponentCSAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1434:1: entryRuleRequiredPortCS returns [EObject current=null] : iv_ruleRequiredPortCS= ruleRequiredPortCS EOF ;
    public final EObject entryRuleRequiredPortCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredPortCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1435:2: (iv_ruleRequiredPortCS= ruleRequiredPortCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1436:2: iv_ruleRequiredPortCS= ruleRequiredPortCS EOF
            {
             newCompositeNode(grammarAccess.getRequiredPortCSRule()); 
            pushFollow(FOLLOW_ruleRequiredPortCS_in_entryRuleRequiredPortCS2708);
            iv_ruleRequiredPortCS=ruleRequiredPortCS();

            state._fsp--;

             current =iv_ruleRequiredPortCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredPortCS2718); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1443:1: ruleRequiredPortCS returns [EObject current=null] : (otherlv_0= 'required' otherlv_1= 'port' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) | ( (lv_isMandatory_9_0= 'mandatory' ) ) ) (otherlv_10= ',' )? )* otherlv_11= ']' )? ( (lv_properties_12_0= rulePropertyCS ) )* )? ) ;
    public final EObject ruleRequiredPortCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_isLocal_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_portNumber_8_0=null;
        Token lv_isMandatory_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1446:28: ( (otherlv_0= 'required' otherlv_1= 'port' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) | ( (lv_isMandatory_9_0= 'mandatory' ) ) ) (otherlv_10= ',' )? )* otherlv_11= ']' )? ( (lv_properties_12_0= rulePropertyCS ) )* )? ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1447:1: (otherlv_0= 'required' otherlv_1= 'port' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) | ( (lv_isMandatory_9_0= 'mandatory' ) ) ) (otherlv_10= ',' )? )* otherlv_11= ']' )? ( (lv_properties_12_0= rulePropertyCS ) )* )? )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1447:1: (otherlv_0= 'required' otherlv_1= 'port' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) | ( (lv_isMandatory_9_0= 'mandatory' ) ) ) (otherlv_10= ',' )? )* otherlv_11= ']' )? ( (lv_properties_12_0= rulePropertyCS ) )* )? )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1447:3: otherlv_0= 'required' otherlv_1= 'port' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) | ( (lv_isMandatory_9_0= 'mandatory' ) ) ) (otherlv_10= ',' )? )* otherlv_11= ']' )? ( (lv_properties_12_0= rulePropertyCS ) )* )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleRequiredPortCS2755); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiredPortCSAccess().getRequiredKeyword_0());
                
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleRequiredPortCS2767); 

                	newLeafNode(otherlv_1, grammarAccess.getRequiredPortCSAccess().getPortKeyword_1());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1455:1: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1456:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1456:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1457:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getRequiredPortCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleRequiredPortCS2788);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequiredPortCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1473:2: (otherlv_3= ':' (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) | ( (lv_isMandatory_9_0= 'mandatory' ) ) ) (otherlv_10= ',' )? )* otherlv_11= ']' )? ( (lv_properties_12_0= rulePropertyCS ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==17) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1473:4: otherlv_3= ':' (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) | ( (lv_isMandatory_9_0= 'mandatory' ) ) ) (otherlv_10= ',' )? )* otherlv_11= ']' )? ( (lv_properties_12_0= rulePropertyCS ) )*
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleRequiredPortCS2801); 

                        	newLeafNode(otherlv_3, grammarAccess.getRequiredPortCSAccess().getColonKeyword_3_0());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1477:1: (otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) | ( (lv_isMandatory_9_0= 'mandatory' ) ) ) (otherlv_10= ',' )? )* otherlv_11= ']' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==19) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1477:3: otherlv_4= '[' ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) | ( (lv_isMandatory_9_0= 'mandatory' ) ) ) (otherlv_10= ',' )? )* otherlv_11= ']'
                            {
                            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleRequiredPortCS2814); 

                                	newLeafNode(otherlv_4, grammarAccess.getRequiredPortCSAccess().getLeftSquareBracketKeyword_3_1_0());
                                
                            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1481:1: ( ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) | ( (lv_isMandatory_9_0= 'mandatory' ) ) ) (otherlv_10= ',' )? )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( ((LA35_0>=41 && LA35_0<=42)||LA35_0==45) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1481:2: ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) | ( (lv_isMandatory_9_0= 'mandatory' ) ) ) (otherlv_10= ',' )?
                            	    {
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1481:2: ( ( (lv_isLocal_5_0= 'local' ) ) | (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) ) | ( (lv_isMandatory_9_0= 'mandatory' ) ) )
                            	    int alt33=3;
                            	    switch ( input.LA(1) ) {
                            	    case 42:
                            	        {
                            	        alt33=1;
                            	        }
                            	        break;
                            	    case 41:
                            	        {
                            	        alt33=2;
                            	        }
                            	        break;
                            	    case 45:
                            	        {
                            	        alt33=3;
                            	        }
                            	        break;
                            	    default:
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 33, 0, input);

                            	        throw nvae;
                            	    }

                            	    switch (alt33) {
                            	        case 1 :
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1481:3: ( (lv_isLocal_5_0= 'local' ) )
                            	            {
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1481:3: ( (lv_isLocal_5_0= 'local' ) )
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1482:1: (lv_isLocal_5_0= 'local' )
                            	            {
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1482:1: (lv_isLocal_5_0= 'local' )
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1483:3: lv_isLocal_5_0= 'local'
                            	            {
                            	            lv_isLocal_5_0=(Token)match(input,42,FOLLOW_42_in_ruleRequiredPortCS2834); 

                            	                    newLeafNode(lv_isLocal_5_0, grammarAccess.getRequiredPortCSAccess().getIsLocalLocalKeyword_3_1_1_0_0_0());
                            	                

                            	            	        if (current==null) {
                            	            	            current = createModelElement(grammarAccess.getRequiredPortCSRule());
                            	            	        }
                            	                   		setWithLastConsumed(current, "isLocal", true, "local");
                            	            	    

                            	            }


                            	            }


                            	            }
                            	            break;
                            	        case 2 :
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1497:6: (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) )
                            	            {
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1497:6: (otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) ) )
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1497:8: otherlv_6= 'port' otherlv_7= ':' ( (lv_portNumber_8_0= RULE_INT ) )
                            	            {
                            	            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleRequiredPortCS2866); 

                            	                	newLeafNode(otherlv_6, grammarAccess.getRequiredPortCSAccess().getPortKeyword_3_1_1_0_1_0());
                            	                
                            	            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleRequiredPortCS2878); 

                            	                	newLeafNode(otherlv_7, grammarAccess.getRequiredPortCSAccess().getColonKeyword_3_1_1_0_1_1());
                            	                
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1505:1: ( (lv_portNumber_8_0= RULE_INT ) )
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1506:1: (lv_portNumber_8_0= RULE_INT )
                            	            {
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1506:1: (lv_portNumber_8_0= RULE_INT )
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1507:3: lv_portNumber_8_0= RULE_INT
                            	            {
                            	            lv_portNumber_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRequiredPortCS2895); 

                            	            			newLeafNode(lv_portNumber_8_0, grammarAccess.getRequiredPortCSAccess().getPortNumberINTTerminalRuleCall_3_1_1_0_1_2_0()); 
                            	            		

                            	            	        if (current==null) {
                            	            	            current = createModelElement(grammarAccess.getRequiredPortCSRule());
                            	            	        }
                            	                   		setWithLastConsumed(
                            	                   			current, 
                            	                   			"portNumber",
                            	                    		lv_portNumber_8_0, 
                            	                    		"INT");
                            	            	    

                            	            }


                            	            }


                            	            }


                            	            }
                            	            break;
                            	        case 3 :
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1524:6: ( (lv_isMandatory_9_0= 'mandatory' ) )
                            	            {
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1524:6: ( (lv_isMandatory_9_0= 'mandatory' ) )
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1525:1: (lv_isMandatory_9_0= 'mandatory' )
                            	            {
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1525:1: (lv_isMandatory_9_0= 'mandatory' )
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1526:3: lv_isMandatory_9_0= 'mandatory'
                            	            {
                            	            lv_isMandatory_9_0=(Token)match(input,45,FOLLOW_45_in_ruleRequiredPortCS2925); 

                            	                    newLeafNode(lv_isMandatory_9_0, grammarAccess.getRequiredPortCSAccess().getIsMandatoryMandatoryKeyword_3_1_1_0_2_0());
                            	                

                            	            	        if (current==null) {
                            	            	            current = createModelElement(grammarAccess.getRequiredPortCSRule());
                            	            	        }
                            	                   		setWithLastConsumed(current, "isMandatory", true, "mandatory");
                            	            	    

                            	            }


                            	            }


                            	            }
                            	            break;

                            	    }

                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1539:3: (otherlv_10= ',' )?
                            	    int alt34=2;
                            	    int LA34_0 = input.LA(1);

                            	    if ( (LA34_0==36) ) {
                            	        alt34=1;
                            	    }
                            	    switch (alt34) {
                            	        case 1 :
                            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1539:5: otherlv_10= ','
                            	            {
                            	            otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleRequiredPortCS2952); 

                            	                	newLeafNode(otherlv_10, grammarAccess.getRequiredPortCSAccess().getCommaKeyword_3_1_1_1());
                            	                

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop35;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleRequiredPortCS2968); 

                                	newLeafNode(otherlv_11, grammarAccess.getRequiredPortCSAccess().getRightSquareBracketKeyword_3_1_2());
                                

                            }
                            break;

                    }

                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1547:3: ( (lv_properties_12_0= rulePropertyCS ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==52) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1548:1: (lv_properties_12_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1548:1: (lv_properties_12_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1549:3: lv_properties_12_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequiredPortCSAccess().getPropertiesPropertyCSParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleRequiredPortCS2991);
                    	    lv_properties_12_0=rulePropertyCS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRequiredPortCSRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_12_0, 
                    	            		"PropertyCS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1573:1: entryRuleRequiredExecutionPlatformCS returns [EObject current=null] : iv_ruleRequiredExecutionPlatformCS= ruleRequiredExecutionPlatformCS EOF ;
    public final EObject entryRuleRequiredExecutionPlatformCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredExecutionPlatformCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1574:2: (iv_ruleRequiredExecutionPlatformCS= ruleRequiredExecutionPlatformCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1575:2: iv_ruleRequiredExecutionPlatformCS= ruleRequiredExecutionPlatformCS EOF
            {
             newCompositeNode(grammarAccess.getRequiredExecutionPlatformCSRule()); 
            pushFollow(FOLLOW_ruleRequiredExecutionPlatformCS_in_entryRuleRequiredExecutionPlatformCS3030);
            iv_ruleRequiredExecutionPlatformCS=ruleRequiredExecutionPlatformCS();

            state._fsp--;

             current =iv_ruleRequiredExecutionPlatformCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredExecutionPlatformCS3040); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1582:1: ruleRequiredExecutionPlatformCS returns [EObject current=null] : (otherlv_0= 'required' otherlv_1= 'execution' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' otherlv_5= 'demands' otherlv_6= ':' ( (lv_demands_7_0= rulePropertyCS ) )* otherlv_8= ']' )? ( (lv_properties_9_0= rulePropertyCS ) )* )? ) ;
    public final EObject ruleRequiredExecutionPlatformCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_demands_7_0 = null;

        EObject lv_properties_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1585:28: ( (otherlv_0= 'required' otherlv_1= 'execution' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' otherlv_5= 'demands' otherlv_6= ':' ( (lv_demands_7_0= rulePropertyCS ) )* otherlv_8= ']' )? ( (lv_properties_9_0= rulePropertyCS ) )* )? ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1586:1: (otherlv_0= 'required' otherlv_1= 'execution' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' otherlv_5= 'demands' otherlv_6= ':' ( (lv_demands_7_0= rulePropertyCS ) )* otherlv_8= ']' )? ( (lv_properties_9_0= rulePropertyCS ) )* )? )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1586:1: (otherlv_0= 'required' otherlv_1= 'execution' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' otherlv_5= 'demands' otherlv_6= ':' ( (lv_demands_7_0= rulePropertyCS ) )* otherlv_8= ']' )? ( (lv_properties_9_0= rulePropertyCS ) )* )? )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1586:3: otherlv_0= 'required' otherlv_1= 'execution' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' otherlv_5= 'demands' otherlv_6= ':' ( (lv_demands_7_0= rulePropertyCS ) )* otherlv_8= ']' )? ( (lv_properties_9_0= rulePropertyCS ) )* )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleRequiredExecutionPlatformCS3077); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiredExecutionPlatformCSAccess().getRequiredKeyword_0());
                
            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleRequiredExecutionPlatformCS3089); 

                	newLeafNode(otherlv_1, grammarAccess.getRequiredExecutionPlatformCSAccess().getExecutionKeyword_1());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1594:1: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1595:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1595:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1596:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getRequiredExecutionPlatformCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleRequiredExecutionPlatformCS3110);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequiredExecutionPlatformCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1612:2: (otherlv_3= ':' (otherlv_4= '[' otherlv_5= 'demands' otherlv_6= ':' ( (lv_demands_7_0= rulePropertyCS ) )* otherlv_8= ']' )? ( (lv_properties_9_0= rulePropertyCS ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==17) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1612:4: otherlv_3= ':' (otherlv_4= '[' otherlv_5= 'demands' otherlv_6= ':' ( (lv_demands_7_0= rulePropertyCS ) )* otherlv_8= ']' )? ( (lv_properties_9_0= rulePropertyCS ) )*
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleRequiredExecutionPlatformCS3123); 

                        	newLeafNode(otherlv_3, grammarAccess.getRequiredExecutionPlatformCSAccess().getColonKeyword_3_0());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1616:1: (otherlv_4= '[' otherlv_5= 'demands' otherlv_6= ':' ( (lv_demands_7_0= rulePropertyCS ) )* otherlv_8= ']' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==19) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1616:3: otherlv_4= '[' otherlv_5= 'demands' otherlv_6= ':' ( (lv_demands_7_0= rulePropertyCS ) )* otherlv_8= ']'
                            {
                            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleRequiredExecutionPlatformCS3136); 

                                	newLeafNode(otherlv_4, grammarAccess.getRequiredExecutionPlatformCSAccess().getLeftSquareBracketKeyword_3_1_0());
                                
                            otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleRequiredExecutionPlatformCS3148); 

                                	newLeafNode(otherlv_5, grammarAccess.getRequiredExecutionPlatformCSAccess().getDemandsKeyword_3_1_1());
                                
                            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleRequiredExecutionPlatformCS3160); 

                                	newLeafNode(otherlv_6, grammarAccess.getRequiredExecutionPlatformCSAccess().getColonKeyword_3_1_2());
                                
                            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1628:1: ( (lv_demands_7_0= rulePropertyCS ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==52) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1629:1: (lv_demands_7_0= rulePropertyCS )
                            	    {
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1629:1: (lv_demands_7_0= rulePropertyCS )
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1630:3: lv_demands_7_0= rulePropertyCS
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getRequiredExecutionPlatformCSAccess().getDemandsPropertyCSParserRuleCall_3_1_3_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_rulePropertyCS_in_ruleRequiredExecutionPlatformCS3181);
                            	    lv_demands_7_0=rulePropertyCS();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getRequiredExecutionPlatformCSRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"demands",
                            	            		lv_demands_7_0, 
                            	            		"PropertyCS");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop39;
                                }
                            } while (true);

                            otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleRequiredExecutionPlatformCS3194); 

                                	newLeafNode(otherlv_8, grammarAccess.getRequiredExecutionPlatformCSAccess().getRightSquareBracketKeyword_3_1_4());
                                

                            }
                            break;

                    }

                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1650:3: ( (lv_properties_9_0= rulePropertyCS ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==52) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1651:1: (lv_properties_9_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1651:1: (lv_properties_9_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1652:3: lv_properties_9_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequiredExecutionPlatformCSAccess().getPropertiesPropertyCSParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleRequiredExecutionPlatformCS3217);
                    	    lv_properties_9_0=rulePropertyCS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRequiredExecutionPlatformCSRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_9_0, 
                    	            		"PropertyCS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


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


    // $ANTLR start "entryRuleProvidedExecutionPlatformCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1676:1: entryRuleProvidedExecutionPlatformCS returns [EObject current=null] : iv_ruleProvidedExecutionPlatformCS= ruleProvidedExecutionPlatformCS EOF ;
    public final EObject entryRuleProvidedExecutionPlatformCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedExecutionPlatformCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1677:2: (iv_ruleProvidedExecutionPlatformCS= ruleProvidedExecutionPlatformCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1678:2: iv_ruleProvidedExecutionPlatformCS= ruleProvidedExecutionPlatformCS EOF
            {
             newCompositeNode(grammarAccess.getProvidedExecutionPlatformCSRule()); 
            pushFollow(FOLLOW_ruleProvidedExecutionPlatformCS_in_entryRuleProvidedExecutionPlatformCS3256);
            iv_ruleProvidedExecutionPlatformCS=ruleProvidedExecutionPlatformCS();

            state._fsp--;

             current =iv_ruleProvidedExecutionPlatformCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedExecutionPlatformCS3266); 

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
    // $ANTLR end "entryRuleProvidedExecutionPlatformCS"


    // $ANTLR start "ruleProvidedExecutionPlatformCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1685:1: ruleProvidedExecutionPlatformCS returns [EObject current=null] : (otherlv_0= 'provided' otherlv_1= 'execution' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' otherlv_5= 'offers' otherlv_6= ':' ( (lv_offers_7_0= rulePropertyCS ) )* otherlv_8= ']' )? ( (lv_properties_9_0= rulePropertyCS ) )* )? ) ;
    public final EObject ruleProvidedExecutionPlatformCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_offers_7_0 = null;

        EObject lv_properties_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1688:28: ( (otherlv_0= 'provided' otherlv_1= 'execution' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' otherlv_5= 'offers' otherlv_6= ':' ( (lv_offers_7_0= rulePropertyCS ) )* otherlv_8= ']' )? ( (lv_properties_9_0= rulePropertyCS ) )* )? ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1689:1: (otherlv_0= 'provided' otherlv_1= 'execution' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' otherlv_5= 'offers' otherlv_6= ':' ( (lv_offers_7_0= rulePropertyCS ) )* otherlv_8= ']' )? ( (lv_properties_9_0= rulePropertyCS ) )* )? )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1689:1: (otherlv_0= 'provided' otherlv_1= 'execution' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' otherlv_5= 'offers' otherlv_6= ':' ( (lv_offers_7_0= rulePropertyCS ) )* otherlv_8= ']' )? ( (lv_properties_9_0= rulePropertyCS ) )* )? )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1689:3: otherlv_0= 'provided' otherlv_1= 'execution' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= '[' otherlv_5= 'offers' otherlv_6= ':' ( (lv_offers_7_0= rulePropertyCS ) )* otherlv_8= ']' )? ( (lv_properties_9_0= rulePropertyCS ) )* )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleProvidedExecutionPlatformCS3303); 

                	newLeafNode(otherlv_0, grammarAccess.getProvidedExecutionPlatformCSAccess().getProvidedKeyword_0());
                
            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleProvidedExecutionPlatformCS3315); 

                	newLeafNode(otherlv_1, grammarAccess.getProvidedExecutionPlatformCSAccess().getExecutionKeyword_1());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1697:1: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1698:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1698:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1699:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getProvidedExecutionPlatformCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleProvidedExecutionPlatformCS3336);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProvidedExecutionPlatformCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1715:2: (otherlv_3= ':' (otherlv_4= '[' otherlv_5= 'offers' otherlv_6= ':' ( (lv_offers_7_0= rulePropertyCS ) )* otherlv_8= ']' )? ( (lv_properties_9_0= rulePropertyCS ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==17) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1715:4: otherlv_3= ':' (otherlv_4= '[' otherlv_5= 'offers' otherlv_6= ':' ( (lv_offers_7_0= rulePropertyCS ) )* otherlv_8= ']' )? ( (lv_properties_9_0= rulePropertyCS ) )*
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleProvidedExecutionPlatformCS3349); 

                        	newLeafNode(otherlv_3, grammarAccess.getProvidedExecutionPlatformCSAccess().getColonKeyword_3_0());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1719:1: (otherlv_4= '[' otherlv_5= 'offers' otherlv_6= ':' ( (lv_offers_7_0= rulePropertyCS ) )* otherlv_8= ']' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==19) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1719:3: otherlv_4= '[' otherlv_5= 'offers' otherlv_6= ':' ( (lv_offers_7_0= rulePropertyCS ) )* otherlv_8= ']'
                            {
                            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleProvidedExecutionPlatformCS3362); 

                                	newLeafNode(otherlv_4, grammarAccess.getProvidedExecutionPlatformCSAccess().getLeftSquareBracketKeyword_3_1_0());
                                
                            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleProvidedExecutionPlatformCS3374); 

                                	newLeafNode(otherlv_5, grammarAccess.getProvidedExecutionPlatformCSAccess().getOffersKeyword_3_1_1());
                                
                            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleProvidedExecutionPlatformCS3386); 

                                	newLeafNode(otherlv_6, grammarAccess.getProvidedExecutionPlatformCSAccess().getColonKeyword_3_1_2());
                                
                            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1731:1: ( (lv_offers_7_0= rulePropertyCS ) )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==52) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1732:1: (lv_offers_7_0= rulePropertyCS )
                            	    {
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1732:1: (lv_offers_7_0= rulePropertyCS )
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1733:3: lv_offers_7_0= rulePropertyCS
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getProvidedExecutionPlatformCSAccess().getOffersPropertyCSParserRuleCall_3_1_3_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_rulePropertyCS_in_ruleProvidedExecutionPlatformCS3407);
                            	    lv_offers_7_0=rulePropertyCS();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getProvidedExecutionPlatformCSRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"offers",
                            	            		lv_offers_7_0, 
                            	            		"PropertyCS");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop43;
                                }
                            } while (true);

                            otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleProvidedExecutionPlatformCS3420); 

                                	newLeafNode(otherlv_8, grammarAccess.getProvidedExecutionPlatformCSAccess().getRightSquareBracketKeyword_3_1_4());
                                

                            }
                            break;

                    }

                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1753:3: ( (lv_properties_9_0= rulePropertyCS ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==52) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1754:1: (lv_properties_9_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1754:1: (lv_properties_9_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1755:3: lv_properties_9_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProvidedExecutionPlatformCSAccess().getPropertiesPropertyCSParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleProvidedExecutionPlatformCS3443);
                    	    lv_properties_9_0=rulePropertyCS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProvidedExecutionPlatformCSRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_9_0, 
                    	            		"PropertyCS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


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
    // $ANTLR end "ruleProvidedExecutionPlatformCS"


    // $ANTLR start "entryRuleRelationshipCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1779:1: entryRuleRelationshipCS returns [EObject current=null] : iv_ruleRelationshipCS= ruleRelationshipCS EOF ;
    public final EObject entryRuleRelationshipCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1780:2: (iv_ruleRelationshipCS= ruleRelationshipCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1781:2: iv_ruleRelationshipCS= ruleRelationshipCS EOF
            {
             newCompositeNode(grammarAccess.getRelationshipCSRule()); 
            pushFollow(FOLLOW_ruleRelationshipCS_in_entryRuleRelationshipCS3482);
            iv_ruleRelationshipCS=ruleRelationshipCS();

            state._fsp--;

             current =iv_ruleRelationshipCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationshipCS3492); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1788:1: ruleRelationshipCS returns [EObject current=null] : (otherlv_0= 'relationship' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= ':' ( ( ruleFqn ) ) otherlv_4= '=>' ( ( ruleFqn ) ) ) | (otherlv_6= '{' ( ( ruleFqn ) ) otherlv_8= '=>' ( ( ruleFqn ) ) (otherlv_10= 'properties' otherlv_11= ':' ( (lv_properties_12_0= rulePropertyCS ) )* )? ( (lv_resources_13_0= ruleResourceCS ) )* otherlv_14= '}' ) ) ) ;
    public final EObject ruleRelationshipCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_resources_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1791:28: ( (otherlv_0= 'relationship' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= ':' ( ( ruleFqn ) ) otherlv_4= '=>' ( ( ruleFqn ) ) ) | (otherlv_6= '{' ( ( ruleFqn ) ) otherlv_8= '=>' ( ( ruleFqn ) ) (otherlv_10= 'properties' otherlv_11= ':' ( (lv_properties_12_0= rulePropertyCS ) )* )? ( (lv_resources_13_0= ruleResourceCS ) )* otherlv_14= '}' ) ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1792:1: (otherlv_0= 'relationship' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= ':' ( ( ruleFqn ) ) otherlv_4= '=>' ( ( ruleFqn ) ) ) | (otherlv_6= '{' ( ( ruleFqn ) ) otherlv_8= '=>' ( ( ruleFqn ) ) (otherlv_10= 'properties' otherlv_11= ':' ( (lv_properties_12_0= rulePropertyCS ) )* )? ( (lv_resources_13_0= ruleResourceCS ) )* otherlv_14= '}' ) ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1792:1: (otherlv_0= 'relationship' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= ':' ( ( ruleFqn ) ) otherlv_4= '=>' ( ( ruleFqn ) ) ) | (otherlv_6= '{' ( ( ruleFqn ) ) otherlv_8= '=>' ( ( ruleFqn ) ) (otherlv_10= 'properties' otherlv_11= ':' ( (lv_properties_12_0= rulePropertyCS ) )* )? ( (lv_resources_13_0= ruleResourceCS ) )* otherlv_14= '}' ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1792:3: otherlv_0= 'relationship' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= ':' ( ( ruleFqn ) ) otherlv_4= '=>' ( ( ruleFqn ) ) ) | (otherlv_6= '{' ( ( ruleFqn ) ) otherlv_8= '=>' ( ( ruleFqn ) ) (otherlv_10= 'properties' otherlv_11= ':' ( (lv_properties_12_0= rulePropertyCS ) )* )? ( (lv_resources_13_0= ruleResourceCS ) )* otherlv_14= '}' ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleRelationshipCS3529); 

                	newLeafNode(otherlv_0, grammarAccess.getRelationshipCSAccess().getRelationshipKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1796:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1797:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1797:1: (lv_name_1_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1798:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipCSAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleRelationshipCS3550);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationshipCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1814:2: ( (otherlv_2= ':' ( ( ruleFqn ) ) otherlv_4= '=>' ( ( ruleFqn ) ) ) | (otherlv_6= '{' ( ( ruleFqn ) ) otherlv_8= '=>' ( ( ruleFqn ) ) (otherlv_10= 'properties' otherlv_11= ':' ( (lv_properties_12_0= rulePropertyCS ) )* )? ( (lv_resources_13_0= ruleResourceCS ) )* otherlv_14= '}' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==17) ) {
                alt50=1;
            }
            else if ( (LA50_0==13) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1814:3: (otherlv_2= ':' ( ( ruleFqn ) ) otherlv_4= '=>' ( ( ruleFqn ) ) )
                    {
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1814:3: (otherlv_2= ':' ( ( ruleFqn ) ) otherlv_4= '=>' ( ( ruleFqn ) ) )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1814:5: otherlv_2= ':' ( ( ruleFqn ) ) otherlv_4= '=>' ( ( ruleFqn ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleRelationshipCS3564); 

                        	newLeafNode(otherlv_2, grammarAccess.getRelationshipCSAccess().getColonKeyword_2_0_0());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1818:1: ( ( ruleFqn ) )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1819:1: ( ruleFqn )
                    {
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1819:1: ( ruleFqn )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1820:3: ruleFqn
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationshipCSRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRelationshipCSAccess().getRequiredPortRequiredPortCrossReference_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFqn_in_ruleRelationshipCS3587);
                    ruleFqn();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleRelationshipCS3599); 

                        	newLeafNode(otherlv_4, grammarAccess.getRelationshipCSAccess().getEqualsSignGreaterThanSignKeyword_2_0_2());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1837:1: ( ( ruleFqn ) )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1838:1: ( ruleFqn )
                    {
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1838:1: ( ruleFqn )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1839:3: ruleFqn
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationshipCSRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRelationshipCSAccess().getProvidedPortProvidedPortCrossReference_2_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFqn_in_ruleRelationshipCS3622);
                    ruleFqn();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1853:6: (otherlv_6= '{' ( ( ruleFqn ) ) otherlv_8= '=>' ( ( ruleFqn ) ) (otherlv_10= 'properties' otherlv_11= ':' ( (lv_properties_12_0= rulePropertyCS ) )* )? ( (lv_resources_13_0= ruleResourceCS ) )* otherlv_14= '}' )
                    {
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1853:6: (otherlv_6= '{' ( ( ruleFqn ) ) otherlv_8= '=>' ( ( ruleFqn ) ) (otherlv_10= 'properties' otherlv_11= ':' ( (lv_properties_12_0= rulePropertyCS ) )* )? ( (lv_resources_13_0= ruleResourceCS ) )* otherlv_14= '}' )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1853:8: otherlv_6= '{' ( ( ruleFqn ) ) otherlv_8= '=>' ( ( ruleFqn ) ) (otherlv_10= 'properties' otherlv_11= ':' ( (lv_properties_12_0= rulePropertyCS ) )* )? ( (lv_resources_13_0= ruleResourceCS ) )* otherlv_14= '}'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleRelationshipCS3642); 

                        	newLeafNode(otherlv_6, grammarAccess.getRelationshipCSAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1857:1: ( ( ruleFqn ) )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1858:1: ( ruleFqn )
                    {
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1858:1: ( ruleFqn )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1859:3: ruleFqn
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationshipCSRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRelationshipCSAccess().getRequiredPortRequiredPortCrossReference_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFqn_in_ruleRelationshipCS3665);
                    ruleFqn();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,50,FOLLOW_50_in_ruleRelationshipCS3677); 

                        	newLeafNode(otherlv_8, grammarAccess.getRelationshipCSAccess().getEqualsSignGreaterThanSignKeyword_2_1_2());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1876:1: ( ( ruleFqn ) )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1877:1: ( ruleFqn )
                    {
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1877:1: ( ruleFqn )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1878:3: ruleFqn
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationshipCSRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRelationshipCSAccess().getProvidedPortProvidedPortCrossReference_2_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFqn_in_ruleRelationshipCS3700);
                    ruleFqn();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1891:2: (otherlv_10= 'properties' otherlv_11= ':' ( (lv_properties_12_0= rulePropertyCS ) )* )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==38) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1891:4: otherlv_10= 'properties' otherlv_11= ':' ( (lv_properties_12_0= rulePropertyCS ) )*
                            {
                            otherlv_10=(Token)match(input,38,FOLLOW_38_in_ruleRelationshipCS3713); 

                                	newLeafNode(otherlv_10, grammarAccess.getRelationshipCSAccess().getPropertiesKeyword_2_1_4_0());
                                
                            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleRelationshipCS3725); 

                                	newLeafNode(otherlv_11, grammarAccess.getRelationshipCSAccess().getColonKeyword_2_1_4_1());
                                
                            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1899:1: ( (lv_properties_12_0= rulePropertyCS ) )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==52) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1900:1: (lv_properties_12_0= rulePropertyCS )
                            	    {
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1900:1: (lv_properties_12_0= rulePropertyCS )
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1901:3: lv_properties_12_0= rulePropertyCS
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getRelationshipCSAccess().getPropertiesPropertyCSParserRuleCall_2_1_4_2_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_rulePropertyCS_in_ruleRelationshipCS3746);
                            	    lv_properties_12_0=rulePropertyCS();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getRelationshipCSRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"properties",
                            	            		lv_properties_12_0, 
                            	            		"PropertyCS");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop47;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1917:5: ( (lv_resources_13_0= ruleResourceCS ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==54) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1918:1: (lv_resources_13_0= ruleResourceCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1918:1: (lv_resources_13_0= ruleResourceCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1919:3: lv_resources_13_0= ruleResourceCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRelationshipCSAccess().getResourcesResourceCSParserRuleCall_2_1_5_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleResourceCS_in_ruleRelationshipCS3770);
                    	    lv_resources_13_0=ruleResourceCS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRelationshipCSRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_13_0, 
                    	            		"ResourceCS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,14,FOLLOW_14_in_ruleRelationshipCS3783); 

                        	newLeafNode(otherlv_14, grammarAccess.getRelationshipCSAccess().getRightCurlyBracketKeyword_2_1_6());
                        

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
    // $ANTLR end "ruleRelationshipCS"


    // $ANTLR start "entryRuleExternalComponentInstanceCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1947:1: entryRuleExternalComponentInstanceCS returns [EObject current=null] : iv_ruleExternalComponentInstanceCS= ruleExternalComponentInstanceCS EOF ;
    public final EObject entryRuleExternalComponentInstanceCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalComponentInstanceCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1948:2: (iv_ruleExternalComponentInstanceCS= ruleExternalComponentInstanceCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1949:2: iv_ruleExternalComponentInstanceCS= ruleExternalComponentInstanceCS EOF
            {
             newCompositeNode(grammarAccess.getExternalComponentInstanceCSRule()); 
            pushFollow(FOLLOW_ruleExternalComponentInstanceCS_in_entryRuleExternalComponentInstanceCS3821);
            iv_ruleExternalComponentInstanceCS=ruleExternalComponentInstanceCS();

            state._fsp--;

             current =iv_ruleExternalComponentInstanceCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalComponentInstanceCS3831); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1956:1: ruleExternalComponentInstanceCS returns [EObject current=null] : (otherlv_0= 'external' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) ) ;
    public final EObject ruleExternalComponentInstanceCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1959:28: ( (otherlv_0= 'external' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1960:1: (otherlv_0= 'external' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1960:1: (otherlv_0= 'external' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1960:3: otherlv_0= 'external' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleExternalComponentInstanceCS3868); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalComponentInstanceCSAccess().getExternalKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1964:1: ( (otherlv_1= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1965:1: (otherlv_1= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1965:1: (otherlv_1= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1966:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalComponentInstanceCSRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalComponentInstanceCS3888); 

            		newLeafNode(otherlv_1, grammarAccess.getExternalComponentInstanceCSAccess().getTypeExternalComponentCrossReference_1_0()); 
            	

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1977:2: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1978:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1978:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1979:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getExternalComponentInstanceCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleExternalComponentInstanceCS3909);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalComponentInstanceCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ValidID");
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
    // $ANTLR end "ruleExternalComponentInstanceCS"


    // $ANTLR start "entryRuleInternalComponentInstanceCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2003:1: entryRuleInternalComponentInstanceCS returns [EObject current=null] : iv_ruleInternalComponentInstanceCS= ruleInternalComponentInstanceCS EOF ;
    public final EObject entryRuleInternalComponentInstanceCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalComponentInstanceCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2004:2: (iv_ruleInternalComponentInstanceCS= ruleInternalComponentInstanceCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2005:2: iv_ruleInternalComponentInstanceCS= ruleInternalComponentInstanceCS EOF
            {
             newCompositeNode(grammarAccess.getInternalComponentInstanceCSRule()); 
            pushFollow(FOLLOW_ruleInternalComponentInstanceCS_in_entryRuleInternalComponentInstanceCS3945);
            iv_ruleInternalComponentInstanceCS=ruleInternalComponentInstanceCS();

            state._fsp--;

             current =iv_ruleInternalComponentInstanceCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalComponentInstanceCS3955); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2012:1: ruleInternalComponentInstanceCS returns [EObject current=null] : (otherlv_0= 'internal' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) ) ;
    public final EObject ruleInternalComponentInstanceCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2015:28: ( (otherlv_0= 'internal' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2016:1: (otherlv_0= 'internal' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2016:1: (otherlv_0= 'internal' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2016:3: otherlv_0= 'internal' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleInternalComponentInstanceCS3992); 

                	newLeafNode(otherlv_0, grammarAccess.getInternalComponentInstanceCSAccess().getInternalKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2020:1: ( (otherlv_1= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2021:1: (otherlv_1= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2021:1: (otherlv_1= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2022:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInternalComponentInstanceCSRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInternalComponentInstanceCS4012); 

            		newLeafNode(otherlv_1, grammarAccess.getInternalComponentInstanceCSAccess().getTypeInternalComponentCrossReference_1_0()); 
            	

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2033:2: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2034:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2034:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2035:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getInternalComponentInstanceCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleInternalComponentInstanceCS4033);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInternalComponentInstanceCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ValidID");
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
    // $ANTLR end "ruleInternalComponentInstanceCS"


    // $ANTLR start "entryRuleVMInstanceCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2059:1: entryRuleVMInstanceCS returns [EObject current=null] : iv_ruleVMInstanceCS= ruleVMInstanceCS EOF ;
    public final EObject entryRuleVMInstanceCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMInstanceCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2060:2: (iv_ruleVMInstanceCS= ruleVMInstanceCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2061:2: iv_ruleVMInstanceCS= ruleVMInstanceCS EOF
            {
             newCompositeNode(grammarAccess.getVMInstanceCSRule()); 
            pushFollow(FOLLOW_ruleVMInstanceCS_in_entryRuleVMInstanceCS4069);
            iv_ruleVMInstanceCS=ruleVMInstanceCS();

            state._fsp--;

             current =iv_ruleVMInstanceCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVMInstanceCS4079); 

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
    // $ANTLR end "entryRuleVMInstanceCS"


    // $ANTLR start "ruleVMInstanceCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2068:1: ruleVMInstanceCS returns [EObject current=null] : (otherlv_0= 'vm' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) ) ;
    public final EObject ruleVMInstanceCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2071:28: ( (otherlv_0= 'vm' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2072:1: (otherlv_0= 'vm' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2072:1: (otherlv_0= 'vm' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2072:3: otherlv_0= 'vm' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleVMInstanceCS4116); 

                	newLeafNode(otherlv_0, grammarAccess.getVMInstanceCSAccess().getVmKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2076:1: ( (otherlv_1= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2077:1: (otherlv_1= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2077:1: (otherlv_1= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2078:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVMInstanceCSRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVMInstanceCS4136); 

            		newLeafNode(otherlv_1, grammarAccess.getVMInstanceCSAccess().getTypeVMCrossReference_1_0()); 
            	

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2089:2: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2090:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2090:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2091:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getVMInstanceCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleVMInstanceCS4157);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVMInstanceCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ValidID");
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
    // $ANTLR end "ruleVMInstanceCS"


    // $ANTLR start "entryRuleRelationshipInstanceCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2115:1: entryRuleRelationshipInstanceCS returns [EObject current=null] : iv_ruleRelationshipInstanceCS= ruleRelationshipInstanceCS EOF ;
    public final EObject entryRuleRelationshipInstanceCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipInstanceCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2116:2: (iv_ruleRelationshipInstanceCS= ruleRelationshipInstanceCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2117:2: iv_ruleRelationshipInstanceCS= ruleRelationshipInstanceCS EOF
            {
             newCompositeNode(grammarAccess.getRelationshipInstanceCSRule()); 
            pushFollow(FOLLOW_ruleRelationshipInstanceCS_in_entryRuleRelationshipInstanceCS4193);
            iv_ruleRelationshipInstanceCS=ruleRelationshipInstanceCS();

            state._fsp--;

             current =iv_ruleRelationshipInstanceCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationshipInstanceCS4203); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2124:1: ruleRelationshipInstanceCS returns [EObject current=null] : (otherlv_0= 'relationship' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ':' ( ( ruleFqn ) ) otherlv_5= '=>' ( ( ruleFqn ) ) ) ;
    public final EObject ruleRelationshipInstanceCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2127:28: ( (otherlv_0= 'relationship' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ':' ( ( ruleFqn ) ) otherlv_5= '=>' ( ( ruleFqn ) ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2128:1: (otherlv_0= 'relationship' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ':' ( ( ruleFqn ) ) otherlv_5= '=>' ( ( ruleFqn ) ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2128:1: (otherlv_0= 'relationship' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ':' ( ( ruleFqn ) ) otherlv_5= '=>' ( ( ruleFqn ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2128:3: otherlv_0= 'relationship' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ':' ( ( ruleFqn ) ) otherlv_5= '=>' ( ( ruleFqn ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleRelationshipInstanceCS4240); 

                	newLeafNode(otherlv_0, grammarAccess.getRelationshipInstanceCSAccess().getRelationshipKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2132:1: ( (otherlv_1= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2133:1: (otherlv_1= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2133:1: (otherlv_1= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2134:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipInstanceCSRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationshipInstanceCS4260); 

            		newLeafNode(otherlv_1, grammarAccess.getRelationshipInstanceCSAccess().getTypeRelationshipCrossReference_1_0()); 
            	

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2145:2: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2146:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2146:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2147:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipInstanceCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleRelationshipInstanceCS4281);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationshipInstanceCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleRelationshipInstanceCS4293); 

                	newLeafNode(otherlv_3, grammarAccess.getRelationshipInstanceCSAccess().getColonKeyword_3());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2167:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2168:1: ( ruleFqn )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2168:1: ( ruleFqn )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2169:3: ruleFqn
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipInstanceCSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipInstanceCSAccess().getRequiredPortInstanceRequiredPortInstanceCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFqn_in_ruleRelationshipInstanceCS4316);
            ruleFqn();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleRelationshipInstanceCS4328); 

                	newLeafNode(otherlv_5, grammarAccess.getRelationshipInstanceCSAccess().getEqualsSignGreaterThanSignKeyword_5());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2186:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2187:1: ( ruleFqn )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2187:1: ( ruleFqn )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2188:3: ruleFqn
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipInstanceCSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipInstanceCSAccess().getProvidedPortInstanceProvidedPortInstanceCrossReference_6_0()); 
            	    
            pushFollow(FOLLOW_ruleFqn_in_ruleRelationshipInstanceCS4351);
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


    // $ANTLR start "entryRuleExecuteInstanceCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2209:1: entryRuleExecuteInstanceCS returns [EObject current=null] : iv_ruleExecuteInstanceCS= ruleExecuteInstanceCS EOF ;
    public final EObject entryRuleExecuteInstanceCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecuteInstanceCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2210:2: (iv_ruleExecuteInstanceCS= ruleExecuteInstanceCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2211:2: iv_ruleExecuteInstanceCS= ruleExecuteInstanceCS EOF
            {
             newCompositeNode(grammarAccess.getExecuteInstanceCSRule()); 
            pushFollow(FOLLOW_ruleExecuteInstanceCS_in_entryRuleExecuteInstanceCS4387);
            iv_ruleExecuteInstanceCS=ruleExecuteInstanceCS();

            state._fsp--;

             current =iv_ruleExecuteInstanceCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecuteInstanceCS4397); 

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
    // $ANTLR end "entryRuleExecuteInstanceCS"


    // $ANTLR start "ruleExecuteInstanceCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2218:1: ruleExecuteInstanceCS returns [EObject current=null] : (otherlv_0= 'execute' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( ( ruleFqn ) ) otherlv_4= '=>' ( ( ruleFqn ) ) ) ;
    public final EObject ruleExecuteInstanceCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2221:28: ( (otherlv_0= 'execute' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( ( ruleFqn ) ) otherlv_4= '=>' ( ( ruleFqn ) ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2222:1: (otherlv_0= 'execute' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( ( ruleFqn ) ) otherlv_4= '=>' ( ( ruleFqn ) ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2222:1: (otherlv_0= 'execute' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( ( ruleFqn ) ) otherlv_4= '=>' ( ( ruleFqn ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2222:3: otherlv_0= 'execute' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( ( ruleFqn ) ) otherlv_4= '=>' ( ( ruleFqn ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleExecuteInstanceCS4434); 

                	newLeafNode(otherlv_0, grammarAccess.getExecuteInstanceCSAccess().getExecuteKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2226:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2227:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2227:1: (lv_name_1_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2228:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getExecuteInstanceCSAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleExecuteInstanceCS4455);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExecuteInstanceCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleExecuteInstanceCS4467); 

                	newLeafNode(otherlv_2, grammarAccess.getExecuteInstanceCSAccess().getColonKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2248:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2249:1: ( ruleFqn )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2249:1: ( ruleFqn )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2250:3: ruleFqn
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExecuteInstanceCSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getExecuteInstanceCSAccess().getRequiredExecutionPlatformInstanceRequiredExecutionPlatformInstanceCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFqn_in_ruleExecuteInstanceCS4490);
            ruleFqn();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleExecuteInstanceCS4502); 

                	newLeafNode(otherlv_4, grammarAccess.getExecuteInstanceCSAccess().getEqualsSignGreaterThanSignKeyword_4());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2267:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2268:1: ( ruleFqn )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2268:1: ( ruleFqn )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2269:3: ruleFqn
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExecuteInstanceCSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getExecuteInstanceCSAccess().getProvidedExecutionPlatformInstanceProvidedExecutionPlatformInstanceCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleFqn_in_ruleExecuteInstanceCS4525);
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
    // $ANTLR end "ruleExecuteInstanceCS"


    // $ANTLR start "entryRulePropertyCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2290:1: entryRulePropertyCS returns [EObject current=null] : iv_rulePropertyCS= rulePropertyCS EOF ;
    public final EObject entryRulePropertyCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2291:2: (iv_rulePropertyCS= rulePropertyCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2292:2: iv_rulePropertyCS= rulePropertyCS EOF
            {
             newCompositeNode(grammarAccess.getPropertyCSRule()); 
            pushFollow(FOLLOW_rulePropertyCS_in_entryRulePropertyCS4561);
            iv_rulePropertyCS=rulePropertyCS();

            state._fsp--;

             current =iv_rulePropertyCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyCS4571); 

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
    // $ANTLR end "entryRulePropertyCS"


    // $ANTLR start "rulePropertyCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2299:1: rulePropertyCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject rulePropertyCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2302:28: ( (otherlv_0= '(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2303:1: (otherlv_0= '(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2303:1: (otherlv_0= '(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2303:3: otherlv_0= '(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_rulePropertyCS4608); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyCSAccess().getLeftParenthesisKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2307:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2308:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2308:1: (lv_name_1_0= RULE_STRING )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2309:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyCS4625); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPropertyCSAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePropertyCS4642); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyCSAccess().getColonKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2329:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2330:1: (lv_value_3_0= RULE_STRING )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2330:1: (lv_value_3_0= RULE_STRING )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2331:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyCS4659); 

            			newLeafNode(lv_value_3_0, grammarAccess.getPropertyCSAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,53,FOLLOW_53_in_rulePropertyCS4676); 

                	newLeafNode(otherlv_4, grammarAccess.getPropertyCSAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "rulePropertyCS"


    // $ANTLR start "entryRuleResourceCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2359:1: entryRuleResourceCS returns [EObject current=null] : iv_ruleResourceCS= ruleResourceCS EOF ;
    public final EObject entryRuleResourceCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2360:2: (iv_ruleResourceCS= ruleResourceCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2361:2: iv_ruleResourceCS= ruleResourceCS EOF
            {
             newCompositeNode(grammarAccess.getResourceCSRule()); 
            pushFollow(FOLLOW_ruleResourceCS_in_entryRuleResourceCS4712);
            iv_ruleResourceCS=ruleResourceCS();

            state._fsp--;

             current =iv_ruleResourceCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceCS4722); 

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
    // $ANTLR end "entryRuleResourceCS"


    // $ANTLR start "ruleResourceCS"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2368:1: ruleResourceCS returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) ) (otherlv_23= ',' )? )* otherlv_24= '}' ) ;
    public final EObject ruleResourceCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_downloadCommand_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_uploadCommand_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_installCommand_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_configureCommand_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_startCommand_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_stopCommand_20_0=null;
        Token lv_requireCredentials_21_0=null;
        Token lv_executeLocally_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2371:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) ) (otherlv_23= ',' )? )* otherlv_24= '}' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2372:1: (otherlv_0= 'resource' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) ) (otherlv_23= ',' )? )* otherlv_24= '}' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2372:1: (otherlv_0= 'resource' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) ) (otherlv_23= ',' )? )* otherlv_24= '}' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2372:3: otherlv_0= 'resource' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) ) (otherlv_23= ',' )? )* otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleResourceCS4759); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceCSAccess().getResourceKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2376:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2377:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2377:1: (lv_name_1_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2378:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getResourceCSAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleResourceCS4780);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleResourceCS4792); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceCSAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2398:1: ( ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) ) (otherlv_23= ',' )? )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=55 && LA53_0<=62)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2398:2: ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) ) (otherlv_23= ',' )?
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2398:2: ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) )
            	    int alt51=8;
            	    switch ( input.LA(1) ) {
            	    case 55:
            	        {
            	        alt51=1;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt51=2;
            	        }
            	        break;
            	    case 57:
            	        {
            	        alt51=3;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt51=4;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt51=5;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt51=6;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt51=7;
            	        }
            	        break;
            	    case 62:
            	        {
            	        alt51=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 51, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt51) {
            	        case 1 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2398:3: (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2398:3: (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2398:5: otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) )
            	            {
            	            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleResourceCS4807); 

            	                	newLeafNode(otherlv_3, grammarAccess.getResourceCSAccess().getDownloadKeyword_3_0_0_0());
            	                
            	            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleResourceCS4819); 

            	                	newLeafNode(otherlv_4, grammarAccess.getResourceCSAccess().getColonKeyword_3_0_0_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2406:1: ( (lv_downloadCommand_5_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2407:1: (lv_downloadCommand_5_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2407:1: (lv_downloadCommand_5_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2408:3: lv_downloadCommand_5_0= RULE_STRING
            	            {
            	            lv_downloadCommand_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceCS4836); 

            	            			newLeafNode(lv_downloadCommand_5_0, grammarAccess.getResourceCSAccess().getDownloadCommandSTRINGTerminalRuleCall_3_0_0_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getResourceCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"downloadCommand",
            	                    		lv_downloadCommand_5_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2425:6: (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2425:6: (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2425:8: otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) )
            	            {
            	            otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleResourceCS4861); 

            	                	newLeafNode(otherlv_6, grammarAccess.getResourceCSAccess().getUploadKeyword_3_0_1_0());
            	                
            	            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleResourceCS4873); 

            	                	newLeafNode(otherlv_7, grammarAccess.getResourceCSAccess().getColonKeyword_3_0_1_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2433:1: ( (lv_uploadCommand_8_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2434:1: (lv_uploadCommand_8_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2434:1: (lv_uploadCommand_8_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2435:3: lv_uploadCommand_8_0= RULE_STRING
            	            {
            	            lv_uploadCommand_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceCS4890); 

            	            			newLeafNode(lv_uploadCommand_8_0, grammarAccess.getResourceCSAccess().getUploadCommandSTRINGTerminalRuleCall_3_0_1_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getResourceCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"uploadCommand",
            	                    		lv_uploadCommand_8_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2452:6: (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2452:6: (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2452:8: otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) )
            	            {
            	            otherlv_9=(Token)match(input,57,FOLLOW_57_in_ruleResourceCS4915); 

            	                	newLeafNode(otherlv_9, grammarAccess.getResourceCSAccess().getInstallKeyword_3_0_2_0());
            	                
            	            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleResourceCS4927); 

            	                	newLeafNode(otherlv_10, grammarAccess.getResourceCSAccess().getColonKeyword_3_0_2_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2460:1: ( (lv_installCommand_11_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2461:1: (lv_installCommand_11_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2461:1: (lv_installCommand_11_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2462:3: lv_installCommand_11_0= RULE_STRING
            	            {
            	            lv_installCommand_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceCS4944); 

            	            			newLeafNode(lv_installCommand_11_0, grammarAccess.getResourceCSAccess().getInstallCommandSTRINGTerminalRuleCall_3_0_2_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getResourceCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"installCommand",
            	                    		lv_installCommand_11_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2479:6: (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2479:6: (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2479:8: otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) )
            	            {
            	            otherlv_12=(Token)match(input,58,FOLLOW_58_in_ruleResourceCS4969); 

            	                	newLeafNode(otherlv_12, grammarAccess.getResourceCSAccess().getConfigureKeyword_3_0_3_0());
            	                
            	            otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleResourceCS4981); 

            	                	newLeafNode(otherlv_13, grammarAccess.getResourceCSAccess().getColonKeyword_3_0_3_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2487:1: ( (lv_configureCommand_14_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2488:1: (lv_configureCommand_14_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2488:1: (lv_configureCommand_14_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2489:3: lv_configureCommand_14_0= RULE_STRING
            	            {
            	            lv_configureCommand_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceCS4998); 

            	            			newLeafNode(lv_configureCommand_14_0, grammarAccess.getResourceCSAccess().getConfigureCommandSTRINGTerminalRuleCall_3_0_3_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getResourceCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"configureCommand",
            	                    		lv_configureCommand_14_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2506:6: (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2506:6: (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2506:8: otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) )
            	            {
            	            otherlv_15=(Token)match(input,59,FOLLOW_59_in_ruleResourceCS5023); 

            	                	newLeafNode(otherlv_15, grammarAccess.getResourceCSAccess().getStartKeyword_3_0_4_0());
            	                
            	            otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleResourceCS5035); 

            	                	newLeafNode(otherlv_16, grammarAccess.getResourceCSAccess().getColonKeyword_3_0_4_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2514:1: ( (lv_startCommand_17_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2515:1: (lv_startCommand_17_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2515:1: (lv_startCommand_17_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2516:3: lv_startCommand_17_0= RULE_STRING
            	            {
            	            lv_startCommand_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceCS5052); 

            	            			newLeafNode(lv_startCommand_17_0, grammarAccess.getResourceCSAccess().getStartCommandSTRINGTerminalRuleCall_3_0_4_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getResourceCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"startCommand",
            	                    		lv_startCommand_17_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2533:6: (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2533:6: (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2533:8: otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) )
            	            {
            	            otherlv_18=(Token)match(input,60,FOLLOW_60_in_ruleResourceCS5077); 

            	                	newLeafNode(otherlv_18, grammarAccess.getResourceCSAccess().getStopKeyword_3_0_5_0());
            	                
            	            otherlv_19=(Token)match(input,17,FOLLOW_17_in_ruleResourceCS5089); 

            	                	newLeafNode(otherlv_19, grammarAccess.getResourceCSAccess().getColonKeyword_3_0_5_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2541:1: ( (lv_stopCommand_20_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2542:1: (lv_stopCommand_20_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2542:1: (lv_stopCommand_20_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2543:3: lv_stopCommand_20_0= RULE_STRING
            	            {
            	            lv_stopCommand_20_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceCS5106); 

            	            			newLeafNode(lv_stopCommand_20_0, grammarAccess.getResourceCSAccess().getStopCommandSTRINGTerminalRuleCall_3_0_5_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getResourceCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"stopCommand",
            	                    		lv_stopCommand_20_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 7 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2560:6: ( (lv_requireCredentials_21_0= 'requireCredentials' ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2560:6: ( (lv_requireCredentials_21_0= 'requireCredentials' ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2561:1: (lv_requireCredentials_21_0= 'requireCredentials' )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2561:1: (lv_requireCredentials_21_0= 'requireCredentials' )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2562:3: lv_requireCredentials_21_0= 'requireCredentials'
            	            {
            	            lv_requireCredentials_21_0=(Token)match(input,61,FOLLOW_61_in_ruleResourceCS5136); 

            	                    newLeafNode(lv_requireCredentials_21_0, grammarAccess.getResourceCSAccess().getRequireCredentialsRequireCredentialsKeyword_3_0_6_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getResourceCSRule());
            	            	        }
            	                   		setWithLastConsumed(current, "requireCredentials", true, "requireCredentials");
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 8 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2576:6: ( (lv_executeLocally_22_0= 'executeLocally' ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2576:6: ( (lv_executeLocally_22_0= 'executeLocally' ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2577:1: (lv_executeLocally_22_0= 'executeLocally' )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2577:1: (lv_executeLocally_22_0= 'executeLocally' )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2578:3: lv_executeLocally_22_0= 'executeLocally'
            	            {
            	            lv_executeLocally_22_0=(Token)match(input,62,FOLLOW_62_in_ruleResourceCS5173); 

            	                    newLeafNode(lv_executeLocally_22_0, grammarAccess.getResourceCSAccess().getExecuteLocallyExecuteLocallyKeyword_3_0_7_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getResourceCSRule());
            	            	        }
            	                   		setWithLastConsumed(current, "executeLocally", true, "executeLocally");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2591:3: (otherlv_23= ',' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==36) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2591:5: otherlv_23= ','
            	            {
            	            otherlv_23=(Token)match(input,36,FOLLOW_36_in_ruleResourceCS5200); 

            	                	newLeafNode(otherlv_23, grammarAccess.getResourceCSAccess().getCommaKeyword_3_1());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_24=(Token)match(input,14,FOLLOW_14_in_ruleResourceCS5216); 

                	newLeafNode(otherlv_24, grammarAccess.getResourceCSAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleResourceCS"


    // $ANTLR start "entryRuleValidID"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2607:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2608:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2609:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID5253);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID5264); 

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2616:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2619:28: (this_ID_0= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2620:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID5303); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleFqn"
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2635:1: entryRuleFqn returns [String current=null] : iv_ruleFqn= ruleFqn EOF ;
    public final String entryRuleFqn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFqn = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2636:2: (iv_ruleFqn= ruleFqn EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2637:2: iv_ruleFqn= ruleFqn EOF
            {
             newCompositeNode(grammarAccess.getFqnRule()); 
            pushFollow(FOLLOW_ruleFqn_in_entryRuleFqn5348);
            iv_ruleFqn=ruleFqn();

            state._fsp--;

             current =iv_ruleFqn.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqn5359); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2644:1: ruleFqn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleFqn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2647:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2648:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2648:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2649:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
             
                    newCompositeNode(grammarAccess.getFqnAccess().getValidIDParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleValidID_in_ruleFqn5406);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            		current.merge(this_ValidID_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2659:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==63) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2660:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,63,FOLLOW_63_in_ruleFqn5425); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFqnAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFqnAccess().getValidIDParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleValidID_in_ruleFqn5447);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    		current.merge(this_ValidID_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop54;
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
    public static final BitSet FOLLOW_11_in_ruleCloudMLRoot122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleCloudMLRoot143 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_ruleProviderCS_in_ruleCloudMLRoot164 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleCloudMLRoot177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCloudMLRoot189 = new BitSet(new long[]{0x0002088000044000L});
    public static final BitSet FOLLOW_ruleVMCS_in_ruleCloudMLRoot211 = new BitSet(new long[]{0x0002088000044000L});
    public static final BitSet FOLLOW_ruleInternalComponentCS_in_ruleCloudMLRoot238 = new BitSet(new long[]{0x0002088000044000L});
    public static final BitSet FOLLOW_ruleExternalComponentCS_in_ruleCloudMLRoot265 = new BitSet(new long[]{0x0002088000044000L});
    public static final BitSet FOLLOW_ruleRelationshipCS_in_ruleCloudMLRoot288 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCloudMLRoot301 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCloudMLRoot313 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCloudMLRoot325 = new BitSet(new long[]{0x000A088000044000L});
    public static final BitSet FOLLOW_ruleInternalComponentInstanceCS_in_ruleCloudMLRoot347 = new BitSet(new long[]{0x000A088000044000L});
    public static final BitSet FOLLOW_ruleExternalComponentInstanceCS_in_ruleCloudMLRoot374 = new BitSet(new long[]{0x000A088000044000L});
    public static final BitSet FOLLOW_ruleVMInstanceCS_in_ruleCloudMLRoot401 = new BitSet(new long[]{0x000A088000044000L});
    public static final BitSet FOLLOW_ruleRelationshipInstanceCS_in_ruleCloudMLRoot424 = new BitSet(new long[]{0x000A000000004000L});
    public static final BitSet FOLLOW_ruleExecuteInstanceCS_in_ruleCloudMLRoot446 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCloudMLRoot459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderCS_in_entryRuleProviderCS495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProviderCS505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleProviderCS542 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleProviderCS563 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProviderCS575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProviderCS592 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleProviderCS618 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleVMCS_in_entryRuleVMCS655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVMCS665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleVMCS702 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleVMCS723 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVMCS735 = new BitSet(new long[]{0x0000014000084000L});
    public static final BitSet FOLLOW_19_in_ruleVMCS748 = new BitSet(new long[]{0x0000002FFBF10000L});
    public static final BitSet FOLLOW_16_in_ruleVMCS763 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS775 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVMCS795 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_20_in_ruleVMCS815 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS844 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_21_in_ruleVMCS869 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS881 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS898 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_22_in_ruleVMCS928 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_23_in_ruleVMCS960 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS989 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_24_in_ruleVMCS1014 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS1026 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1043 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_25_in_ruleVMCS1068 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS1080 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVMCS1097 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleVMCS1114 = new BitSet(new long[]{0x0000003FFBF10040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVMCS1131 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_27_in_ruleVMCS1157 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS1169 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVMCS1186 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleVMCS1203 = new BitSet(new long[]{0x0000003FFBF10040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVMCS1220 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_28_in_ruleVMCS1246 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS1258 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVMCS1275 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleVMCS1292 = new BitSet(new long[]{0x0000003FFBF10040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVMCS1309 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_29_in_ruleVMCS1335 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS1347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1364 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_30_in_ruleVMCS1389 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS1401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1418 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_31_in_ruleVMCS1443 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS1455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1472 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_32_in_ruleVMCS1497 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS1509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1526 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_33_in_ruleVMCS1551 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS1563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1580 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_34_in_ruleVMCS1605 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS1617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1634 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_35_in_ruleVMCS1659 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS1671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1688 = new BitSet(new long[]{0x0000003FFBF10000L});
    public static final BitSet FOLLOW_36_in_ruleVMCS1708 = new BitSet(new long[]{0x0000002FFBF10000L});
    public static final BitSet FOLLOW_37_in_ruleVMCS1724 = new BitSet(new long[]{0x0000014000004000L});
    public static final BitSet FOLLOW_ruleProvidedPortCS_in_ruleVMCS1747 = new BitSet(new long[]{0x0000014000004000L});
    public static final BitSet FOLLOW_ruleProvidedExecutionPlatformCS_in_ruleVMCS1769 = new BitSet(new long[]{0x0000014000004000L});
    public static final BitSet FOLLOW_38_in_ruleVMCS1783 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS1795 = new BitSet(new long[]{0x0010000000004000L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleVMCS1816 = new BitSet(new long[]{0x0010000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVMCS1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalComponentCS_in_entryRuleExternalComponentCS1869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalComponentCS1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExternalComponentCS1916 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleExternalComponentCS1937 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleExternalComponentCS1949 = new BitSet(new long[]{0x0040014000004000L});
    public static final BitSet FOLLOW_ruleProvidedPortCS_in_ruleExternalComponentCS1971 = new BitSet(new long[]{0x0040014000004000L});
    public static final BitSet FOLLOW_ruleProvidedExecutionPlatformCS_in_ruleExternalComponentCS1998 = new BitSet(new long[]{0x0040014000004000L});
    public static final BitSet FOLLOW_38_in_ruleExternalComponentCS2013 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExternalComponentCS2025 = new BitSet(new long[]{0x0050000000004000L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleExternalComponentCS2046 = new BitSet(new long[]{0x0050000000004000L});
    public static final BitSet FOLLOW_ruleResourceCS_in_ruleExternalComponentCS2070 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExternalComponentCS2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedPortCS_in_entryRuleProvidedPortCS2119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedPortCS2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleProvidedPortCS2166 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleProvidedPortCS2178 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleProvidedPortCS2199 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleProvidedPortCS2212 = new BitSet(new long[]{0x0010000000080002L});
    public static final BitSet FOLLOW_19_in_ruleProvidedPortCS2225 = new BitSet(new long[]{0x0000062000000000L});
    public static final BitSet FOLLOW_42_in_ruleProvidedPortCS2245 = new BitSet(new long[]{0x0000063000000000L});
    public static final BitSet FOLLOW_41_in_ruleProvidedPortCS2277 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProvidedPortCS2289 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProvidedPortCS2306 = new BitSet(new long[]{0x0000063000000000L});
    public static final BitSet FOLLOW_36_in_ruleProvidedPortCS2326 = new BitSet(new long[]{0x0000062000000000L});
    public static final BitSet FOLLOW_37_in_ruleProvidedPortCS2342 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleProvidedPortCS2365 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleInternalComponentCS_in_entryRuleInternalComponentCS2404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalComponentCS2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInternalComponentCS2451 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleInternalComponentCS2472 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInternalComponentCS2484 = new BitSet(new long[]{0x0040114000004000L});
    public static final BitSet FOLLOW_ruleProvidedPortCS_in_ruleInternalComponentCS2506 = new BitSet(new long[]{0x0040114000004000L});
    public static final BitSet FOLLOW_ruleRequiredPortCS_in_ruleInternalComponentCS2533 = new BitSet(new long[]{0x0040114000004000L});
    public static final BitSet FOLLOW_ruleRequiredExecutionPlatformCS_in_ruleInternalComponentCS2560 = new BitSet(new long[]{0x0040114000004000L});
    public static final BitSet FOLLOW_ruleProvidedExecutionPlatformCS_in_ruleInternalComponentCS2587 = new BitSet(new long[]{0x0040114000004000L});
    public static final BitSet FOLLOW_38_in_ruleInternalComponentCS2602 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInternalComponentCS2614 = new BitSet(new long[]{0x0050000000004000L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleInternalComponentCS2635 = new BitSet(new long[]{0x0050000000004000L});
    public static final BitSet FOLLOW_ruleResourceCS_in_ruleInternalComponentCS2659 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInternalComponentCS2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredPortCS_in_entryRuleRequiredPortCS2708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredPortCS2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRequiredPortCS2755 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleRequiredPortCS2767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleRequiredPortCS2788 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleRequiredPortCS2801 = new BitSet(new long[]{0x0010000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRequiredPortCS2814 = new BitSet(new long[]{0x0000262000000000L});
    public static final BitSet FOLLOW_42_in_ruleRequiredPortCS2834 = new BitSet(new long[]{0x0000263000000000L});
    public static final BitSet FOLLOW_41_in_ruleRequiredPortCS2866 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRequiredPortCS2878 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRequiredPortCS2895 = new BitSet(new long[]{0x0000263000000000L});
    public static final BitSet FOLLOW_45_in_ruleRequiredPortCS2925 = new BitSet(new long[]{0x0000263000000000L});
    public static final BitSet FOLLOW_36_in_ruleRequiredPortCS2952 = new BitSet(new long[]{0x0000262000000000L});
    public static final BitSet FOLLOW_37_in_ruleRequiredPortCS2968 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleRequiredPortCS2991 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleRequiredExecutionPlatformCS_in_entryRuleRequiredExecutionPlatformCS3030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredExecutionPlatformCS3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRequiredExecutionPlatformCS3077 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleRequiredExecutionPlatformCS3089 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleRequiredExecutionPlatformCS3110 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleRequiredExecutionPlatformCS3123 = new BitSet(new long[]{0x0010000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRequiredExecutionPlatformCS3136 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRequiredExecutionPlatformCS3148 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRequiredExecutionPlatformCS3160 = new BitSet(new long[]{0x0010002000000000L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleRequiredExecutionPlatformCS3181 = new BitSet(new long[]{0x0010002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRequiredExecutionPlatformCS3194 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleRequiredExecutionPlatformCS3217 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleProvidedExecutionPlatformCS_in_entryRuleProvidedExecutionPlatformCS3256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedExecutionPlatformCS3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleProvidedExecutionPlatformCS3303 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleProvidedExecutionPlatformCS3315 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleProvidedExecutionPlatformCS3336 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleProvidedExecutionPlatformCS3349 = new BitSet(new long[]{0x0010000000080002L});
    public static final BitSet FOLLOW_19_in_ruleProvidedExecutionPlatformCS3362 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleProvidedExecutionPlatformCS3374 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProvidedExecutionPlatformCS3386 = new BitSet(new long[]{0x0010002000000000L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleProvidedExecutionPlatformCS3407 = new BitSet(new long[]{0x0010002000000000L});
    public static final BitSet FOLLOW_37_in_ruleProvidedExecutionPlatformCS3420 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleProvidedExecutionPlatformCS3443 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipCS_in_entryRuleRelationshipCS3482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipCS3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRelationshipCS3529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleRelationshipCS3550 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleRelationshipCS3564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleRelationshipCS3587 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleRelationshipCS3599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleRelationshipCS3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRelationshipCS3642 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleRelationshipCS3665 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleRelationshipCS3677 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleRelationshipCS3700 = new BitSet(new long[]{0x0040004000004000L});
    public static final BitSet FOLLOW_38_in_ruleRelationshipCS3713 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRelationshipCS3725 = new BitSet(new long[]{0x0050000000004000L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleRelationshipCS3746 = new BitSet(new long[]{0x0050000000004000L});
    public static final BitSet FOLLOW_ruleResourceCS_in_ruleRelationshipCS3770 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRelationshipCS3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalComponentInstanceCS_in_entryRuleExternalComponentInstanceCS3821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalComponentInstanceCS3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExternalComponentInstanceCS3868 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalComponentInstanceCS3888 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleExternalComponentInstanceCS3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalComponentInstanceCS_in_entryRuleInternalComponentInstanceCS3945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalComponentInstanceCS3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInternalComponentInstanceCS3992 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInternalComponentInstanceCS4012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleInternalComponentInstanceCS4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVMInstanceCS_in_entryRuleVMInstanceCS4069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVMInstanceCS4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleVMInstanceCS4116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVMInstanceCS4136 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleVMInstanceCS4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipInstanceCS_in_entryRuleRelationshipInstanceCS4193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipInstanceCS4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRelationshipInstanceCS4240 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationshipInstanceCS4260 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleRelationshipInstanceCS4281 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRelationshipInstanceCS4293 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleRelationshipInstanceCS4316 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleRelationshipInstanceCS4328 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleRelationshipInstanceCS4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteInstanceCS_in_entryRuleExecuteInstanceCS4387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecuteInstanceCS4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleExecuteInstanceCS4434 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleExecuteInstanceCS4455 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExecuteInstanceCS4467 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleExecuteInstanceCS4490 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleExecuteInstanceCS4502 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleExecuteInstanceCS4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyCS_in_entryRulePropertyCS4561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyCS4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePropertyCS4608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyCS4625 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePropertyCS4642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyCS4659 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_rulePropertyCS4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceCS_in_entryRuleResourceCS4712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceCS4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleResourceCS4759 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleResourceCS4780 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleResourceCS4792 = new BitSet(new long[]{0x7F80000000004000L});
    public static final BitSet FOLLOW_55_in_ruleResourceCS4807 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResourceCS4819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceCS4836 = new BitSet(new long[]{0x7F80001000004000L});
    public static final BitSet FOLLOW_56_in_ruleResourceCS4861 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResourceCS4873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceCS4890 = new BitSet(new long[]{0x7F80001000004000L});
    public static final BitSet FOLLOW_57_in_ruleResourceCS4915 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResourceCS4927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceCS4944 = new BitSet(new long[]{0x7F80001000004000L});
    public static final BitSet FOLLOW_58_in_ruleResourceCS4969 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResourceCS4981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceCS4998 = new BitSet(new long[]{0x7F80001000004000L});
    public static final BitSet FOLLOW_59_in_ruleResourceCS5023 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResourceCS5035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceCS5052 = new BitSet(new long[]{0x7F80001000004000L});
    public static final BitSet FOLLOW_60_in_ruleResourceCS5077 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResourceCS5089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceCS5106 = new BitSet(new long[]{0x7F80001000004000L});
    public static final BitSet FOLLOW_61_in_ruleResourceCS5136 = new BitSet(new long[]{0x7F80001000004000L});
    public static final BitSet FOLLOW_62_in_ruleResourceCS5173 = new BitSet(new long[]{0x7F80001000004000L});
    public static final BitSet FOLLOW_36_in_ruleResourceCS5200 = new BitSet(new long[]{0x7F80000000004000L});
    public static final BitSet FOLLOW_14_in_ruleResourceCS5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID5253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqn_in_entryRuleFqn5348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqn5359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFqn5406 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleFqn5425 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFqn5447 = new BitSet(new long[]{0x8000000000000002L});

}