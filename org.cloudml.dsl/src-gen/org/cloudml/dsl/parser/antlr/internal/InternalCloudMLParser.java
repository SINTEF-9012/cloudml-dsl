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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'deployment'", "'model'", "'types'", "'{'", "'}'", "'instances'", "'provider'", "':'", "'vm'", "'group'", "'imageID'", "'os64'", "'location'", "'login'", "'core'", "'..'", "'ram'", "'storage'", "'os'", "'passwd'", "'privateKey'", "'region'", "'securityGroup'", "'serviceType'", "'sshKey'", "','", "'properties'", "'external'", "'component'", "'provided'", "'communication'", "'local'", "'port'", "'internal'", "'required'", "'mandatory'", "'host'", "'demands'", "'offers'", "'from'", "'to'", "'typed'", "'connect'", "'named'", "'on'", "'('", "')'", "'resource'", "'download'", "'upload'", "'install'", "'configure'", "'start'", "'stop'", "'requireCredentials'", "'executeLocally'", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:76:1: ruleCloudMLRoot returns [EObject current=null] : (otherlv_0= 'deployment' otherlv_1= 'model' ( (lv_name_2_0= ruleValidID ) ) ( (lv_providers_3_0= ruleProviderCS ) )* otherlv_4= 'types' otherlv_5= '{' ( ( (lv_vms_6_0= ruleVMCS ) ) | ( (lv_internalComponents_7_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_8_0= ruleExternalComponentCS ) ) )* ( (lv_relationships_9_0= ruleRelationshipCS ) )* otherlv_10= '}' otherlv_11= 'instances' otherlv_12= '{' ( ( (lv_internalComponentInstances_13_0= ruleInternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_14_0= ruleExternalComponentInstanceCS ) ) | ( (lv_vmInstances_15_0= ruleVMInstanceCS ) ) )* ( (lv_relationshipInstances_16_0= ruleRelationshipInstanceCS ) )* ( (lv_executesInstances_17_0= ruleExecuteInstanceCS ) )* otherlv_18= '}' ) ;
    public final EObject ruleCloudMLRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_providers_3_0 = null;

        EObject lv_vms_6_0 = null;

        EObject lv_internalComponents_7_0 = null;

        EObject lv_externalComponents_8_0 = null;

        EObject lv_relationships_9_0 = null;

        EObject lv_internalComponentInstances_13_0 = null;

        EObject lv_externalComponentInstances_14_0 = null;

        EObject lv_vmInstances_15_0 = null;

        EObject lv_relationshipInstances_16_0 = null;

        EObject lv_executesInstances_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:79:28: ( (otherlv_0= 'deployment' otherlv_1= 'model' ( (lv_name_2_0= ruleValidID ) ) ( (lv_providers_3_0= ruleProviderCS ) )* otherlv_4= 'types' otherlv_5= '{' ( ( (lv_vms_6_0= ruleVMCS ) ) | ( (lv_internalComponents_7_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_8_0= ruleExternalComponentCS ) ) )* ( (lv_relationships_9_0= ruleRelationshipCS ) )* otherlv_10= '}' otherlv_11= 'instances' otherlv_12= '{' ( ( (lv_internalComponentInstances_13_0= ruleInternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_14_0= ruleExternalComponentInstanceCS ) ) | ( (lv_vmInstances_15_0= ruleVMInstanceCS ) ) )* ( (lv_relationshipInstances_16_0= ruleRelationshipInstanceCS ) )* ( (lv_executesInstances_17_0= ruleExecuteInstanceCS ) )* otherlv_18= '}' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:80:1: (otherlv_0= 'deployment' otherlv_1= 'model' ( (lv_name_2_0= ruleValidID ) ) ( (lv_providers_3_0= ruleProviderCS ) )* otherlv_4= 'types' otherlv_5= '{' ( ( (lv_vms_6_0= ruleVMCS ) ) | ( (lv_internalComponents_7_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_8_0= ruleExternalComponentCS ) ) )* ( (lv_relationships_9_0= ruleRelationshipCS ) )* otherlv_10= '}' otherlv_11= 'instances' otherlv_12= '{' ( ( (lv_internalComponentInstances_13_0= ruleInternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_14_0= ruleExternalComponentInstanceCS ) ) | ( (lv_vmInstances_15_0= ruleVMInstanceCS ) ) )* ( (lv_relationshipInstances_16_0= ruleRelationshipInstanceCS ) )* ( (lv_executesInstances_17_0= ruleExecuteInstanceCS ) )* otherlv_18= '}' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:80:1: (otherlv_0= 'deployment' otherlv_1= 'model' ( (lv_name_2_0= ruleValidID ) ) ( (lv_providers_3_0= ruleProviderCS ) )* otherlv_4= 'types' otherlv_5= '{' ( ( (lv_vms_6_0= ruleVMCS ) ) | ( (lv_internalComponents_7_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_8_0= ruleExternalComponentCS ) ) )* ( (lv_relationships_9_0= ruleRelationshipCS ) )* otherlv_10= '}' otherlv_11= 'instances' otherlv_12= '{' ( ( (lv_internalComponentInstances_13_0= ruleInternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_14_0= ruleExternalComponentInstanceCS ) ) | ( (lv_vmInstances_15_0= ruleVMInstanceCS ) ) )* ( (lv_relationshipInstances_16_0= ruleRelationshipInstanceCS ) )* ( (lv_executesInstances_17_0= ruleExecuteInstanceCS ) )* otherlv_18= '}' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:80:3: otherlv_0= 'deployment' otherlv_1= 'model' ( (lv_name_2_0= ruleValidID ) ) ( (lv_providers_3_0= ruleProviderCS ) )* otherlv_4= 'types' otherlv_5= '{' ( ( (lv_vms_6_0= ruleVMCS ) ) | ( (lv_internalComponents_7_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_8_0= ruleExternalComponentCS ) ) )* ( (lv_relationships_9_0= ruleRelationshipCS ) )* otherlv_10= '}' otherlv_11= 'instances' otherlv_12= '{' ( ( (lv_internalComponentInstances_13_0= ruleInternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_14_0= ruleExternalComponentInstanceCS ) ) | ( (lv_vmInstances_15_0= ruleVMInstanceCS ) ) )* ( (lv_relationshipInstances_16_0= ruleRelationshipInstanceCS ) )* ( (lv_executesInstances_17_0= ruleExecuteInstanceCS ) )* otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleCloudMLRoot122); 

                	newLeafNode(otherlv_0, grammarAccess.getCloudMLRootAccess().getDeploymentKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleCloudMLRoot134); 

                	newLeafNode(otherlv_1, grammarAccess.getCloudMLRootAccess().getModelKeyword_1());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:88:1: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:89:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:89:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:90:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleCloudMLRoot155);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:106:2: ( (lv_providers_3_0= ruleProviderCS ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:107:1: (lv_providers_3_0= ruleProviderCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:107:1: (lv_providers_3_0= ruleProviderCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:108:3: lv_providers_3_0= ruleProviderCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getProvidersProviderCSParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProviderCS_in_ruleCloudMLRoot176);
            	    lv_providers_3_0=ruleProviderCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providers",
            	            		lv_providers_3_0, 
            	            		"ProviderCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleCloudMLRoot189); 

                	newLeafNode(otherlv_4, grammarAccess.getCloudMLRootAccess().getTypesKeyword_4());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCloudMLRoot201); 

                	newLeafNode(otherlv_5, grammarAccess.getCloudMLRootAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:132:1: ( ( (lv_vms_6_0= ruleVMCS ) ) | ( (lv_internalComponents_7_0= ruleInternalComponentCS ) ) | ( (lv_externalComponents_8_0= ruleExternalComponentCS ) ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt2=1;
                    }
                    break;
                case 44:
                    {
                    alt2=2;
                    }
                    break;
                case 38:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:132:2: ( (lv_vms_6_0= ruleVMCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:132:2: ( (lv_vms_6_0= ruleVMCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:133:1: (lv_vms_6_0= ruleVMCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:133:1: (lv_vms_6_0= ruleVMCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:134:3: lv_vms_6_0= ruleVMCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getVmsVMCSParserRuleCall_6_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVMCS_in_ruleCloudMLRoot223);
            	    lv_vms_6_0=ruleVMCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"vms",
            	            		lv_vms_6_0, 
            	            		"VMCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:151:6: ( (lv_internalComponents_7_0= ruleInternalComponentCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:151:6: ( (lv_internalComponents_7_0= ruleInternalComponentCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:152:1: (lv_internalComponents_7_0= ruleInternalComponentCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:152:1: (lv_internalComponents_7_0= ruleInternalComponentCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:153:3: lv_internalComponents_7_0= ruleInternalComponentCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getInternalComponentsInternalComponentCSParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInternalComponentCS_in_ruleCloudMLRoot250);
            	    lv_internalComponents_7_0=ruleInternalComponentCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"internalComponents",
            	            		lv_internalComponents_7_0, 
            	            		"InternalComponentCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:170:6: ( (lv_externalComponents_8_0= ruleExternalComponentCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:170:6: ( (lv_externalComponents_8_0= ruleExternalComponentCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:171:1: (lv_externalComponents_8_0= ruleExternalComponentCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:171:1: (lv_externalComponents_8_0= ruleExternalComponentCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:172:3: lv_externalComponents_8_0= ruleExternalComponentCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getExternalComponentsExternalComponentCSParserRuleCall_6_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExternalComponentCS_in_ruleCloudMLRoot277);
            	    lv_externalComponents_8_0=ruleExternalComponentCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"externalComponents",
            	            		lv_externalComponents_8_0, 
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

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:188:4: ( (lv_relationships_9_0= ruleRelationshipCS ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==41) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:189:1: (lv_relationships_9_0= ruleRelationshipCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:189:1: (lv_relationships_9_0= ruleRelationshipCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:190:3: lv_relationships_9_0= ruleRelationshipCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getRelationshipsRelationshipCSParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationshipCS_in_ruleCloudMLRoot300);
            	    lv_relationships_9_0=ruleRelationshipCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"relationships",
            	            		lv_relationships_9_0, 
            	            		"RelationshipCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleCloudMLRoot313); 

                	newLeafNode(otherlv_10, grammarAccess.getCloudMLRootAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleCloudMLRoot325); 

                	newLeafNode(otherlv_11, grammarAccess.getCloudMLRootAccess().getInstancesKeyword_9());
                
            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleCloudMLRoot337); 

                	newLeafNode(otherlv_12, grammarAccess.getCloudMLRootAccess().getLeftCurlyBracketKeyword_10());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:218:1: ( ( (lv_internalComponentInstances_13_0= ruleInternalComponentInstanceCS ) ) | ( (lv_externalComponentInstances_14_0= ruleExternalComponentInstanceCS ) ) | ( (lv_vmInstances_15_0= ruleVMInstanceCS ) ) )*
            loop4:
            do {
                int alt4=4;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    alt4=1;
                    }
                    break;
                case 38:
                    {
                    alt4=2;
                    }
                    break;
                case 19:
                    {
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:218:2: ( (lv_internalComponentInstances_13_0= ruleInternalComponentInstanceCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:218:2: ( (lv_internalComponentInstances_13_0= ruleInternalComponentInstanceCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:219:1: (lv_internalComponentInstances_13_0= ruleInternalComponentInstanceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:219:1: (lv_internalComponentInstances_13_0= ruleInternalComponentInstanceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:220:3: lv_internalComponentInstances_13_0= ruleInternalComponentInstanceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getInternalComponentInstancesInternalComponentInstanceCSParserRuleCall_11_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInternalComponentInstanceCS_in_ruleCloudMLRoot359);
            	    lv_internalComponentInstances_13_0=ruleInternalComponentInstanceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"internalComponentInstances",
            	            		lv_internalComponentInstances_13_0, 
            	            		"InternalComponentInstanceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:237:6: ( (lv_externalComponentInstances_14_0= ruleExternalComponentInstanceCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:237:6: ( (lv_externalComponentInstances_14_0= ruleExternalComponentInstanceCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:238:1: (lv_externalComponentInstances_14_0= ruleExternalComponentInstanceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:238:1: (lv_externalComponentInstances_14_0= ruleExternalComponentInstanceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:239:3: lv_externalComponentInstances_14_0= ruleExternalComponentInstanceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getExternalComponentInstancesExternalComponentInstanceCSParserRuleCall_11_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExternalComponentInstanceCS_in_ruleCloudMLRoot386);
            	    lv_externalComponentInstances_14_0=ruleExternalComponentInstanceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"externalComponentInstances",
            	            		lv_externalComponentInstances_14_0, 
            	            		"ExternalComponentInstanceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:256:6: ( (lv_vmInstances_15_0= ruleVMInstanceCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:256:6: ( (lv_vmInstances_15_0= ruleVMInstanceCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:257:1: (lv_vmInstances_15_0= ruleVMInstanceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:257:1: (lv_vmInstances_15_0= ruleVMInstanceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:258:3: lv_vmInstances_15_0= ruleVMInstanceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getVmInstancesVMInstanceCSParserRuleCall_11_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVMInstanceCS_in_ruleCloudMLRoot413);
            	    lv_vmInstances_15_0=ruleVMInstanceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"vmInstances",
            	            		lv_vmInstances_15_0, 
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

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:274:4: ( (lv_relationshipInstances_16_0= ruleRelationshipInstanceCS ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==53) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:275:1: (lv_relationshipInstances_16_0= ruleRelationshipInstanceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:275:1: (lv_relationshipInstances_16_0= ruleRelationshipInstanceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:276:3: lv_relationshipInstances_16_0= ruleRelationshipInstanceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getRelationshipInstancesRelationshipInstanceCSParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationshipInstanceCS_in_ruleCloudMLRoot436);
            	    lv_relationshipInstances_16_0=ruleRelationshipInstanceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"relationshipInstances",
            	            		lv_relationshipInstances_16_0, 
            	            		"RelationshipInstanceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:292:3: ( (lv_executesInstances_17_0= ruleExecuteInstanceCS ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==47) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:293:1: (lv_executesInstances_17_0= ruleExecuteInstanceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:293:1: (lv_executesInstances_17_0= ruleExecuteInstanceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:294:3: lv_executesInstances_17_0= ruleExecuteInstanceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudMLRootAccess().getExecutesInstancesExecuteInstanceCSParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExecuteInstanceCS_in_ruleCloudMLRoot458);
            	    lv_executesInstances_17_0=ruleExecuteInstanceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudMLRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"executesInstances",
            	            		lv_executesInstances_17_0, 
            	            		"ExecuteInstanceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleCloudMLRoot471); 

                	newLeafNode(otherlv_18, grammarAccess.getCloudMLRootAccess().getRightCurlyBracketKeyword_14());
                

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:322:1: entryRuleProviderCS returns [EObject current=null] : iv_ruleProviderCS= ruleProviderCS EOF ;
    public final EObject entryRuleProviderCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviderCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:323:2: (iv_ruleProviderCS= ruleProviderCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:324:2: iv_ruleProviderCS= ruleProviderCS EOF
            {
             newCompositeNode(grammarAccess.getProviderCSRule()); 
            pushFollow(FOLLOW_ruleProviderCS_in_entryRuleProviderCS507);
            iv_ruleProviderCS=ruleProviderCS();

            state._fsp--;

             current =iv_ruleProviderCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProviderCS517); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:331:1: ruleProviderCS returns [EObject current=null] : (otherlv_0= 'provider' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (lv_credentials_3_0= RULE_STRING ) ) ( (lv_properties_4_0= rulePropertyCS ) )* ) ;
    public final EObject ruleProviderCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_credentials_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:334:28: ( (otherlv_0= 'provider' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (lv_credentials_3_0= RULE_STRING ) ) ( (lv_properties_4_0= rulePropertyCS ) )* ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:335:1: (otherlv_0= 'provider' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (lv_credentials_3_0= RULE_STRING ) ) ( (lv_properties_4_0= rulePropertyCS ) )* )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:335:1: (otherlv_0= 'provider' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (lv_credentials_3_0= RULE_STRING ) ) ( (lv_properties_4_0= rulePropertyCS ) )* )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:335:3: otherlv_0= 'provider' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (lv_credentials_3_0= RULE_STRING ) ) ( (lv_properties_4_0= rulePropertyCS ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleProviderCS554); 

                	newLeafNode(otherlv_0, grammarAccess.getProviderCSAccess().getProviderKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:339:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:340:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:340:1: (lv_name_1_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:341:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getProviderCSAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleProviderCS575);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleProviderCS587); 

                	newLeafNode(otherlv_2, grammarAccess.getProviderCSAccess().getColonKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:361:1: ( (lv_credentials_3_0= RULE_STRING ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:362:1: (lv_credentials_3_0= RULE_STRING )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:362:1: (lv_credentials_3_0= RULE_STRING )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:363:3: lv_credentials_3_0= RULE_STRING
            {
            lv_credentials_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProviderCS604); 

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

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:379:2: ( (lv_properties_4_0= rulePropertyCS ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==56) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:380:1: (lv_properties_4_0= rulePropertyCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:380:1: (lv_properties_4_0= rulePropertyCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:381:3: lv_properties_4_0= rulePropertyCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProviderCSAccess().getPropertiesPropertyCSParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyCS_in_ruleProviderCS630);
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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:405:1: entryRuleVMCS returns [EObject current=null] : iv_ruleVMCS= ruleVMCS EOF ;
    public final EObject entryRuleVMCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:406:2: (iv_ruleVMCS= ruleVMCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:407:2: iv_ruleVMCS= ruleVMCS EOF
            {
             newCompositeNode(grammarAccess.getVMCSRule()); 
            pushFollow(FOLLOW_ruleVMCS_in_entryRuleVMCS667);
            iv_ruleVMCS=ruleVMCS();

            state._fsp--;

             current =iv_ruleVMCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVMCS677); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:414:1: ruleVMCS returns [EObject current=null] : (otherlv_0= 'vm' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (otherlv_3= 'provider' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'group' otherlv_7= ':' ( (lv_groupName_8_0= RULE_STRING ) ) ) | (otherlv_9= 'imageID' otherlv_10= ':' ( (lv_imageId_11_0= RULE_STRING ) ) ) | ( (lv_is64os_12_0= 'os64' ) ) | (otherlv_13= 'location' otherlv_14= ':' ( (lv_location_15_0= RULE_STRING ) ) ) | (otherlv_16= 'login' otherlv_17= ':' ( (lv_login_18_0= RULE_STRING ) ) ) | (otherlv_19= 'core' otherlv_20= ':' ( (lv_minCores_21_0= RULE_INT ) ) otherlv_22= '..' ( (lv_maxCores_23_0= RULE_INT ) )? ) | (otherlv_24= 'ram' otherlv_25= ':' ( (lv_minRam_26_0= RULE_INT ) ) otherlv_27= '..' ( (lv_maxRam_28_0= RULE_INT ) )? ) | (otherlv_29= 'storage' otherlv_30= ':' ( (lv_minStorage_31_0= RULE_INT ) ) otherlv_32= '..' ( (lv_maxStorage_33_0= RULE_INT ) )? ) | (otherlv_34= 'os' otherlv_35= ':' ( (lv_os_36_0= RULE_STRING ) ) ) | (otherlv_37= 'passwd' otherlv_38= ':' ( (lv_passwd_39_0= RULE_STRING ) ) ) | (otherlv_40= 'privateKey' otherlv_41= ':' ( (lv_privateKey_42_0= RULE_STRING ) ) ) | (otherlv_43= 'region' otherlv_44= ':' ( (lv_Region_45_0= RULE_STRING ) ) ) | (otherlv_46= 'securityGroup' otherlv_47= ':' ( (lv_securityGroup_48_0= RULE_STRING ) ) ) | (otherlv_49= 'serviceType' otherlv_50= ':' ( (lv_serviceType_51_0= RULE_STRING ) ) ) | (otherlv_52= 'sshKey' otherlv_53= ':' ( (lv_sshKey_54_0= RULE_STRING ) ) ) ) (otherlv_55= ',' )? )* ( (lv_providedPorts_56_0= ruleProvidedPortCS ) )* ( (lv_providedExecutionPlatforms_57_0= ruleProvidedExecutionPlatformCS ) )* (otherlv_58= 'properties' otherlv_59= ':' ( (lv_properties_60_0= rulePropertyCS ) )* )? otherlv_61= '}' ) ;
    public final EObject ruleVMCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_groupName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_imageId_11_0=null;
        Token lv_is64os_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_location_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_login_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_minCores_21_0=null;
        Token otherlv_22=null;
        Token lv_maxCores_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_minRam_26_0=null;
        Token otherlv_27=null;
        Token lv_maxRam_28_0=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token lv_minStorage_31_0=null;
        Token otherlv_32=null;
        Token lv_maxStorage_33_0=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token lv_os_36_0=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token lv_passwd_39_0=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token lv_privateKey_42_0=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token lv_Region_45_0=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token lv_securityGroup_48_0=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token lv_serviceType_51_0=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token lv_sshKey_54_0=null;
        Token otherlv_55=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_providedPorts_56_0 = null;

        EObject lv_providedExecutionPlatforms_57_0 = null;

        EObject lv_properties_60_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:417:28: ( (otherlv_0= 'vm' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (otherlv_3= 'provider' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'group' otherlv_7= ':' ( (lv_groupName_8_0= RULE_STRING ) ) ) | (otherlv_9= 'imageID' otherlv_10= ':' ( (lv_imageId_11_0= RULE_STRING ) ) ) | ( (lv_is64os_12_0= 'os64' ) ) | (otherlv_13= 'location' otherlv_14= ':' ( (lv_location_15_0= RULE_STRING ) ) ) | (otherlv_16= 'login' otherlv_17= ':' ( (lv_login_18_0= RULE_STRING ) ) ) | (otherlv_19= 'core' otherlv_20= ':' ( (lv_minCores_21_0= RULE_INT ) ) otherlv_22= '..' ( (lv_maxCores_23_0= RULE_INT ) )? ) | (otherlv_24= 'ram' otherlv_25= ':' ( (lv_minRam_26_0= RULE_INT ) ) otherlv_27= '..' ( (lv_maxRam_28_0= RULE_INT ) )? ) | (otherlv_29= 'storage' otherlv_30= ':' ( (lv_minStorage_31_0= RULE_INT ) ) otherlv_32= '..' ( (lv_maxStorage_33_0= RULE_INT ) )? ) | (otherlv_34= 'os' otherlv_35= ':' ( (lv_os_36_0= RULE_STRING ) ) ) | (otherlv_37= 'passwd' otherlv_38= ':' ( (lv_passwd_39_0= RULE_STRING ) ) ) | (otherlv_40= 'privateKey' otherlv_41= ':' ( (lv_privateKey_42_0= RULE_STRING ) ) ) | (otherlv_43= 'region' otherlv_44= ':' ( (lv_Region_45_0= RULE_STRING ) ) ) | (otherlv_46= 'securityGroup' otherlv_47= ':' ( (lv_securityGroup_48_0= RULE_STRING ) ) ) | (otherlv_49= 'serviceType' otherlv_50= ':' ( (lv_serviceType_51_0= RULE_STRING ) ) ) | (otherlv_52= 'sshKey' otherlv_53= ':' ( (lv_sshKey_54_0= RULE_STRING ) ) ) ) (otherlv_55= ',' )? )* ( (lv_providedPorts_56_0= ruleProvidedPortCS ) )* ( (lv_providedExecutionPlatforms_57_0= ruleProvidedExecutionPlatformCS ) )* (otherlv_58= 'properties' otherlv_59= ':' ( (lv_properties_60_0= rulePropertyCS ) )* )? otherlv_61= '}' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:418:1: (otherlv_0= 'vm' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (otherlv_3= 'provider' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'group' otherlv_7= ':' ( (lv_groupName_8_0= RULE_STRING ) ) ) | (otherlv_9= 'imageID' otherlv_10= ':' ( (lv_imageId_11_0= RULE_STRING ) ) ) | ( (lv_is64os_12_0= 'os64' ) ) | (otherlv_13= 'location' otherlv_14= ':' ( (lv_location_15_0= RULE_STRING ) ) ) | (otherlv_16= 'login' otherlv_17= ':' ( (lv_login_18_0= RULE_STRING ) ) ) | (otherlv_19= 'core' otherlv_20= ':' ( (lv_minCores_21_0= RULE_INT ) ) otherlv_22= '..' ( (lv_maxCores_23_0= RULE_INT ) )? ) | (otherlv_24= 'ram' otherlv_25= ':' ( (lv_minRam_26_0= RULE_INT ) ) otherlv_27= '..' ( (lv_maxRam_28_0= RULE_INT ) )? ) | (otherlv_29= 'storage' otherlv_30= ':' ( (lv_minStorage_31_0= RULE_INT ) ) otherlv_32= '..' ( (lv_maxStorage_33_0= RULE_INT ) )? ) | (otherlv_34= 'os' otherlv_35= ':' ( (lv_os_36_0= RULE_STRING ) ) ) | (otherlv_37= 'passwd' otherlv_38= ':' ( (lv_passwd_39_0= RULE_STRING ) ) ) | (otherlv_40= 'privateKey' otherlv_41= ':' ( (lv_privateKey_42_0= RULE_STRING ) ) ) | (otherlv_43= 'region' otherlv_44= ':' ( (lv_Region_45_0= RULE_STRING ) ) ) | (otherlv_46= 'securityGroup' otherlv_47= ':' ( (lv_securityGroup_48_0= RULE_STRING ) ) ) | (otherlv_49= 'serviceType' otherlv_50= ':' ( (lv_serviceType_51_0= RULE_STRING ) ) ) | (otherlv_52= 'sshKey' otherlv_53= ':' ( (lv_sshKey_54_0= RULE_STRING ) ) ) ) (otherlv_55= ',' )? )* ( (lv_providedPorts_56_0= ruleProvidedPortCS ) )* ( (lv_providedExecutionPlatforms_57_0= ruleProvidedExecutionPlatformCS ) )* (otherlv_58= 'properties' otherlv_59= ':' ( (lv_properties_60_0= rulePropertyCS ) )* )? otherlv_61= '}' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:418:1: (otherlv_0= 'vm' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (otherlv_3= 'provider' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'group' otherlv_7= ':' ( (lv_groupName_8_0= RULE_STRING ) ) ) | (otherlv_9= 'imageID' otherlv_10= ':' ( (lv_imageId_11_0= RULE_STRING ) ) ) | ( (lv_is64os_12_0= 'os64' ) ) | (otherlv_13= 'location' otherlv_14= ':' ( (lv_location_15_0= RULE_STRING ) ) ) | (otherlv_16= 'login' otherlv_17= ':' ( (lv_login_18_0= RULE_STRING ) ) ) | (otherlv_19= 'core' otherlv_20= ':' ( (lv_minCores_21_0= RULE_INT ) ) otherlv_22= '..' ( (lv_maxCores_23_0= RULE_INT ) )? ) | (otherlv_24= 'ram' otherlv_25= ':' ( (lv_minRam_26_0= RULE_INT ) ) otherlv_27= '..' ( (lv_maxRam_28_0= RULE_INT ) )? ) | (otherlv_29= 'storage' otherlv_30= ':' ( (lv_minStorage_31_0= RULE_INT ) ) otherlv_32= '..' ( (lv_maxStorage_33_0= RULE_INT ) )? ) | (otherlv_34= 'os' otherlv_35= ':' ( (lv_os_36_0= RULE_STRING ) ) ) | (otherlv_37= 'passwd' otherlv_38= ':' ( (lv_passwd_39_0= RULE_STRING ) ) ) | (otherlv_40= 'privateKey' otherlv_41= ':' ( (lv_privateKey_42_0= RULE_STRING ) ) ) | (otherlv_43= 'region' otherlv_44= ':' ( (lv_Region_45_0= RULE_STRING ) ) ) | (otherlv_46= 'securityGroup' otherlv_47= ':' ( (lv_securityGroup_48_0= RULE_STRING ) ) ) | (otherlv_49= 'serviceType' otherlv_50= ':' ( (lv_serviceType_51_0= RULE_STRING ) ) ) | (otherlv_52= 'sshKey' otherlv_53= ':' ( (lv_sshKey_54_0= RULE_STRING ) ) ) ) (otherlv_55= ',' )? )* ( (lv_providedPorts_56_0= ruleProvidedPortCS ) )* ( (lv_providedExecutionPlatforms_57_0= ruleProvidedExecutionPlatformCS ) )* (otherlv_58= 'properties' otherlv_59= ':' ( (lv_properties_60_0= rulePropertyCS ) )* )? otherlv_61= '}' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:418:3: otherlv_0= 'vm' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (otherlv_3= 'provider' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'group' otherlv_7= ':' ( (lv_groupName_8_0= RULE_STRING ) ) ) | (otherlv_9= 'imageID' otherlv_10= ':' ( (lv_imageId_11_0= RULE_STRING ) ) ) | ( (lv_is64os_12_0= 'os64' ) ) | (otherlv_13= 'location' otherlv_14= ':' ( (lv_location_15_0= RULE_STRING ) ) ) | (otherlv_16= 'login' otherlv_17= ':' ( (lv_login_18_0= RULE_STRING ) ) ) | (otherlv_19= 'core' otherlv_20= ':' ( (lv_minCores_21_0= RULE_INT ) ) otherlv_22= '..' ( (lv_maxCores_23_0= RULE_INT ) )? ) | (otherlv_24= 'ram' otherlv_25= ':' ( (lv_minRam_26_0= RULE_INT ) ) otherlv_27= '..' ( (lv_maxRam_28_0= RULE_INT ) )? ) | (otherlv_29= 'storage' otherlv_30= ':' ( (lv_minStorage_31_0= RULE_INT ) ) otherlv_32= '..' ( (lv_maxStorage_33_0= RULE_INT ) )? ) | (otherlv_34= 'os' otherlv_35= ':' ( (lv_os_36_0= RULE_STRING ) ) ) | (otherlv_37= 'passwd' otherlv_38= ':' ( (lv_passwd_39_0= RULE_STRING ) ) ) | (otherlv_40= 'privateKey' otherlv_41= ':' ( (lv_privateKey_42_0= RULE_STRING ) ) ) | (otherlv_43= 'region' otherlv_44= ':' ( (lv_Region_45_0= RULE_STRING ) ) ) | (otherlv_46= 'securityGroup' otherlv_47= ':' ( (lv_securityGroup_48_0= RULE_STRING ) ) ) | (otherlv_49= 'serviceType' otherlv_50= ':' ( (lv_serviceType_51_0= RULE_STRING ) ) ) | (otherlv_52= 'sshKey' otherlv_53= ':' ( (lv_sshKey_54_0= RULE_STRING ) ) ) ) (otherlv_55= ',' )? )* ( (lv_providedPorts_56_0= ruleProvidedPortCS ) )* ( (lv_providedExecutionPlatforms_57_0= ruleProvidedExecutionPlatformCS ) )* (otherlv_58= 'properties' otherlv_59= ':' ( (lv_properties_60_0= rulePropertyCS ) )* )? otherlv_61= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleVMCS714); 

                	newLeafNode(otherlv_0, grammarAccess.getVMCSAccess().getVmKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:422:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:423:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:423:1: (lv_name_1_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:424:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getVMCSAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleVMCS735);
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleVMCS747); 

                	newLeafNode(otherlv_2, grammarAccess.getVMCSAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:444:1: ( ( (otherlv_3= 'provider' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'group' otherlv_7= ':' ( (lv_groupName_8_0= RULE_STRING ) ) ) | (otherlv_9= 'imageID' otherlv_10= ':' ( (lv_imageId_11_0= RULE_STRING ) ) ) | ( (lv_is64os_12_0= 'os64' ) ) | (otherlv_13= 'location' otherlv_14= ':' ( (lv_location_15_0= RULE_STRING ) ) ) | (otherlv_16= 'login' otherlv_17= ':' ( (lv_login_18_0= RULE_STRING ) ) ) | (otherlv_19= 'core' otherlv_20= ':' ( (lv_minCores_21_0= RULE_INT ) ) otherlv_22= '..' ( (lv_maxCores_23_0= RULE_INT ) )? ) | (otherlv_24= 'ram' otherlv_25= ':' ( (lv_minRam_26_0= RULE_INT ) ) otherlv_27= '..' ( (lv_maxRam_28_0= RULE_INT ) )? ) | (otherlv_29= 'storage' otherlv_30= ':' ( (lv_minStorage_31_0= RULE_INT ) ) otherlv_32= '..' ( (lv_maxStorage_33_0= RULE_INT ) )? ) | (otherlv_34= 'os' otherlv_35= ':' ( (lv_os_36_0= RULE_STRING ) ) ) | (otherlv_37= 'passwd' otherlv_38= ':' ( (lv_passwd_39_0= RULE_STRING ) ) ) | (otherlv_40= 'privateKey' otherlv_41= ':' ( (lv_privateKey_42_0= RULE_STRING ) ) ) | (otherlv_43= 'region' otherlv_44= ':' ( (lv_Region_45_0= RULE_STRING ) ) ) | (otherlv_46= 'securityGroup' otherlv_47= ':' ( (lv_securityGroup_48_0= RULE_STRING ) ) ) | (otherlv_49= 'serviceType' otherlv_50= ':' ( (lv_serviceType_51_0= RULE_STRING ) ) ) | (otherlv_52= 'sshKey' otherlv_53= ':' ( (lv_sshKey_54_0= RULE_STRING ) ) ) ) (otherlv_55= ',' )? )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17||(LA13_0>=20 && LA13_0<=25)||(LA13_0>=27 && LA13_0<=35)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:444:2: ( (otherlv_3= 'provider' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'group' otherlv_7= ':' ( (lv_groupName_8_0= RULE_STRING ) ) ) | (otherlv_9= 'imageID' otherlv_10= ':' ( (lv_imageId_11_0= RULE_STRING ) ) ) | ( (lv_is64os_12_0= 'os64' ) ) | (otherlv_13= 'location' otherlv_14= ':' ( (lv_location_15_0= RULE_STRING ) ) ) | (otherlv_16= 'login' otherlv_17= ':' ( (lv_login_18_0= RULE_STRING ) ) ) | (otherlv_19= 'core' otherlv_20= ':' ( (lv_minCores_21_0= RULE_INT ) ) otherlv_22= '..' ( (lv_maxCores_23_0= RULE_INT ) )? ) | (otherlv_24= 'ram' otherlv_25= ':' ( (lv_minRam_26_0= RULE_INT ) ) otherlv_27= '..' ( (lv_maxRam_28_0= RULE_INT ) )? ) | (otherlv_29= 'storage' otherlv_30= ':' ( (lv_minStorage_31_0= RULE_INT ) ) otherlv_32= '..' ( (lv_maxStorage_33_0= RULE_INT ) )? ) | (otherlv_34= 'os' otherlv_35= ':' ( (lv_os_36_0= RULE_STRING ) ) ) | (otherlv_37= 'passwd' otherlv_38= ':' ( (lv_passwd_39_0= RULE_STRING ) ) ) | (otherlv_40= 'privateKey' otherlv_41= ':' ( (lv_privateKey_42_0= RULE_STRING ) ) ) | (otherlv_43= 'region' otherlv_44= ':' ( (lv_Region_45_0= RULE_STRING ) ) ) | (otherlv_46= 'securityGroup' otherlv_47= ':' ( (lv_securityGroup_48_0= RULE_STRING ) ) ) | (otherlv_49= 'serviceType' otherlv_50= ':' ( (lv_serviceType_51_0= RULE_STRING ) ) ) | (otherlv_52= 'sshKey' otherlv_53= ':' ( (lv_sshKey_54_0= RULE_STRING ) ) ) ) (otherlv_55= ',' )?
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:444:2: ( (otherlv_3= 'provider' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'group' otherlv_7= ':' ( (lv_groupName_8_0= RULE_STRING ) ) ) | (otherlv_9= 'imageID' otherlv_10= ':' ( (lv_imageId_11_0= RULE_STRING ) ) ) | ( (lv_is64os_12_0= 'os64' ) ) | (otherlv_13= 'location' otherlv_14= ':' ( (lv_location_15_0= RULE_STRING ) ) ) | (otherlv_16= 'login' otherlv_17= ':' ( (lv_login_18_0= RULE_STRING ) ) ) | (otherlv_19= 'core' otherlv_20= ':' ( (lv_minCores_21_0= RULE_INT ) ) otherlv_22= '..' ( (lv_maxCores_23_0= RULE_INT ) )? ) | (otherlv_24= 'ram' otherlv_25= ':' ( (lv_minRam_26_0= RULE_INT ) ) otherlv_27= '..' ( (lv_maxRam_28_0= RULE_INT ) )? ) | (otherlv_29= 'storage' otherlv_30= ':' ( (lv_minStorage_31_0= RULE_INT ) ) otherlv_32= '..' ( (lv_maxStorage_33_0= RULE_INT ) )? ) | (otherlv_34= 'os' otherlv_35= ':' ( (lv_os_36_0= RULE_STRING ) ) ) | (otherlv_37= 'passwd' otherlv_38= ':' ( (lv_passwd_39_0= RULE_STRING ) ) ) | (otherlv_40= 'privateKey' otherlv_41= ':' ( (lv_privateKey_42_0= RULE_STRING ) ) ) | (otherlv_43= 'region' otherlv_44= ':' ( (lv_Region_45_0= RULE_STRING ) ) ) | (otherlv_46= 'securityGroup' otherlv_47= ':' ( (lv_securityGroup_48_0= RULE_STRING ) ) ) | (otherlv_49= 'serviceType' otherlv_50= ':' ( (lv_serviceType_51_0= RULE_STRING ) ) ) | (otherlv_52= 'sshKey' otherlv_53= ':' ( (lv_sshKey_54_0= RULE_STRING ) ) ) )
            	    int alt11=16;
            	    switch ( input.LA(1) ) {
            	    case 17:
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
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:444:3: (otherlv_3= 'provider' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:444:3: (otherlv_3= 'provider' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:444:5: otherlv_3= 'provider' otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            	            {
            	            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleVMCS762); 

            	                	newLeafNode(otherlv_3, grammarAccess.getVMCSAccess().getProviderKeyword_3_0_0_0());
            	                
            	            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleVMCS774); 

            	                	newLeafNode(otherlv_4, grammarAccess.getVMCSAccess().getColonKeyword_3_0_0_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:452:1: ( (otherlv_5= RULE_ID ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:453:1: (otherlv_5= RULE_ID )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:453:1: (otherlv_5= RULE_ID )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:454:3: otherlv_5= RULE_ID
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                    
            	            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVMCS794); 

            	            		newLeafNode(otherlv_5, grammarAccess.getVMCSAccess().getProviderProviderCrossReference_3_0_0_2_0()); 
            	            	

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:466:6: (otherlv_6= 'group' otherlv_7= ':' ( (lv_groupName_8_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:466:6: (otherlv_6= 'group' otherlv_7= ':' ( (lv_groupName_8_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:466:8: otherlv_6= 'group' otherlv_7= ':' ( (lv_groupName_8_0= RULE_STRING ) )
            	            {
            	            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleVMCS814); 

            	                	newLeafNode(otherlv_6, grammarAccess.getVMCSAccess().getGroupKeyword_3_0_1_0());
            	                
            	            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleVMCS826); 

            	                	newLeafNode(otherlv_7, grammarAccess.getVMCSAccess().getColonKeyword_3_0_1_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:474:1: ( (lv_groupName_8_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:475:1: (lv_groupName_8_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:475:1: (lv_groupName_8_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:476:3: lv_groupName_8_0= RULE_STRING
            	            {
            	            lv_groupName_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS843); 

            	            			newLeafNode(lv_groupName_8_0, grammarAccess.getVMCSAccess().getGroupNameSTRINGTerminalRuleCall_3_0_1_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"groupName",
            	                    		lv_groupName_8_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:493:6: (otherlv_9= 'imageID' otherlv_10= ':' ( (lv_imageId_11_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:493:6: (otherlv_9= 'imageID' otherlv_10= ':' ( (lv_imageId_11_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:493:8: otherlv_9= 'imageID' otherlv_10= ':' ( (lv_imageId_11_0= RULE_STRING ) )
            	            {
            	            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleVMCS868); 

            	                	newLeafNode(otherlv_9, grammarAccess.getVMCSAccess().getImageIDKeyword_3_0_2_0());
            	                
            	            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleVMCS880); 

            	                	newLeafNode(otherlv_10, grammarAccess.getVMCSAccess().getColonKeyword_3_0_2_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:501:1: ( (lv_imageId_11_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:502:1: (lv_imageId_11_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:502:1: (lv_imageId_11_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:503:3: lv_imageId_11_0= RULE_STRING
            	            {
            	            lv_imageId_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS897); 

            	            			newLeafNode(lv_imageId_11_0, grammarAccess.getVMCSAccess().getImageIdSTRINGTerminalRuleCall_3_0_2_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"imageId",
            	                    		lv_imageId_11_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:520:6: ( (lv_is64os_12_0= 'os64' ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:520:6: ( (lv_is64os_12_0= 'os64' ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:521:1: (lv_is64os_12_0= 'os64' )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:521:1: (lv_is64os_12_0= 'os64' )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:522:3: lv_is64os_12_0= 'os64'
            	            {
            	            lv_is64os_12_0=(Token)match(input,22,FOLLOW_22_in_ruleVMCS927); 

            	                    newLeafNode(lv_is64os_12_0, grammarAccess.getVMCSAccess().getIs64osOs64Keyword_3_0_3_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                   		setWithLastConsumed(current, "is64os", true, "os64");
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:536:6: (otherlv_13= 'location' otherlv_14= ':' ( (lv_location_15_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:536:6: (otherlv_13= 'location' otherlv_14= ':' ( (lv_location_15_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:536:8: otherlv_13= 'location' otherlv_14= ':' ( (lv_location_15_0= RULE_STRING ) )
            	            {
            	            otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleVMCS959); 

            	                	newLeafNode(otherlv_13, grammarAccess.getVMCSAccess().getLocationKeyword_3_0_4_0());
            	                
            	            otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleVMCS971); 

            	                	newLeafNode(otherlv_14, grammarAccess.getVMCSAccess().getColonKeyword_3_0_4_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:544:1: ( (lv_location_15_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:545:1: (lv_location_15_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:545:1: (lv_location_15_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:546:3: lv_location_15_0= RULE_STRING
            	            {
            	            lv_location_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS988); 

            	            			newLeafNode(lv_location_15_0, grammarAccess.getVMCSAccess().getLocationSTRINGTerminalRuleCall_3_0_4_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"location",
            	                    		lv_location_15_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:563:6: (otherlv_16= 'login' otherlv_17= ':' ( (lv_login_18_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:563:6: (otherlv_16= 'login' otherlv_17= ':' ( (lv_login_18_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:563:8: otherlv_16= 'login' otherlv_17= ':' ( (lv_login_18_0= RULE_STRING ) )
            	            {
            	            otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleVMCS1013); 

            	                	newLeafNode(otherlv_16, grammarAccess.getVMCSAccess().getLoginKeyword_3_0_5_0());
            	                
            	            otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleVMCS1025); 

            	                	newLeafNode(otherlv_17, grammarAccess.getVMCSAccess().getColonKeyword_3_0_5_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:571:1: ( (lv_login_18_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:572:1: (lv_login_18_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:572:1: (lv_login_18_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:573:3: lv_login_18_0= RULE_STRING
            	            {
            	            lv_login_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1042); 

            	            			newLeafNode(lv_login_18_0, grammarAccess.getVMCSAccess().getLoginSTRINGTerminalRuleCall_3_0_5_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"login",
            	                    		lv_login_18_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 7 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:590:6: (otherlv_19= 'core' otherlv_20= ':' ( (lv_minCores_21_0= RULE_INT ) ) otherlv_22= '..' ( (lv_maxCores_23_0= RULE_INT ) )? )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:590:6: (otherlv_19= 'core' otherlv_20= ':' ( (lv_minCores_21_0= RULE_INT ) ) otherlv_22= '..' ( (lv_maxCores_23_0= RULE_INT ) )? )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:590:8: otherlv_19= 'core' otherlv_20= ':' ( (lv_minCores_21_0= RULE_INT ) ) otherlv_22= '..' ( (lv_maxCores_23_0= RULE_INT ) )?
            	            {
            	            otherlv_19=(Token)match(input,25,FOLLOW_25_in_ruleVMCS1067); 

            	                	newLeafNode(otherlv_19, grammarAccess.getVMCSAccess().getCoreKeyword_3_0_6_0());
            	                
            	            otherlv_20=(Token)match(input,18,FOLLOW_18_in_ruleVMCS1079); 

            	                	newLeafNode(otherlv_20, grammarAccess.getVMCSAccess().getColonKeyword_3_0_6_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:598:1: ( (lv_minCores_21_0= RULE_INT ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:599:1: (lv_minCores_21_0= RULE_INT )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:599:1: (lv_minCores_21_0= RULE_INT )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:600:3: lv_minCores_21_0= RULE_INT
            	            {
            	            lv_minCores_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVMCS1096); 

            	            			newLeafNode(lv_minCores_21_0, grammarAccess.getVMCSAccess().getMinCoresINTTerminalRuleCall_3_0_6_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"minCores",
            	                    		lv_minCores_21_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }

            	            otherlv_22=(Token)match(input,26,FOLLOW_26_in_ruleVMCS1113); 

            	                	newLeafNode(otherlv_22, grammarAccess.getVMCSAccess().getFullStopFullStopKeyword_3_0_6_3());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:620:1: ( (lv_maxCores_23_0= RULE_INT ) )?
            	            int alt8=2;
            	            int LA8_0 = input.LA(1);

            	            if ( (LA8_0==RULE_INT) ) {
            	                alt8=1;
            	            }
            	            switch (alt8) {
            	                case 1 :
            	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:621:1: (lv_maxCores_23_0= RULE_INT )
            	                    {
            	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:621:1: (lv_maxCores_23_0= RULE_INT )
            	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:622:3: lv_maxCores_23_0= RULE_INT
            	                    {
            	                    lv_maxCores_23_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVMCS1130); 

            	                    			newLeafNode(lv_maxCores_23_0, grammarAccess.getVMCSAccess().getMaxCoresINTTerminalRuleCall_3_0_6_4_0()); 
            	                    		

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getVMCSRule());
            	                    	        }
            	                           		setWithLastConsumed(
            	                           			current, 
            	                           			"maxCores",
            	                            		lv_maxCores_23_0, 
            	                            		"INT");
            	                    	    

            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 8 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:639:6: (otherlv_24= 'ram' otherlv_25= ':' ( (lv_minRam_26_0= RULE_INT ) ) otherlv_27= '..' ( (lv_maxRam_28_0= RULE_INT ) )? )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:639:6: (otherlv_24= 'ram' otherlv_25= ':' ( (lv_minRam_26_0= RULE_INT ) ) otherlv_27= '..' ( (lv_maxRam_28_0= RULE_INT ) )? )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:639:8: otherlv_24= 'ram' otherlv_25= ':' ( (lv_minRam_26_0= RULE_INT ) ) otherlv_27= '..' ( (lv_maxRam_28_0= RULE_INT ) )?
            	            {
            	            otherlv_24=(Token)match(input,27,FOLLOW_27_in_ruleVMCS1156); 

            	                	newLeafNode(otherlv_24, grammarAccess.getVMCSAccess().getRamKeyword_3_0_7_0());
            	                
            	            otherlv_25=(Token)match(input,18,FOLLOW_18_in_ruleVMCS1168); 

            	                	newLeafNode(otherlv_25, grammarAccess.getVMCSAccess().getColonKeyword_3_0_7_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:647:1: ( (lv_minRam_26_0= RULE_INT ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:648:1: (lv_minRam_26_0= RULE_INT )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:648:1: (lv_minRam_26_0= RULE_INT )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:649:3: lv_minRam_26_0= RULE_INT
            	            {
            	            lv_minRam_26_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVMCS1185); 

            	            			newLeafNode(lv_minRam_26_0, grammarAccess.getVMCSAccess().getMinRamINTTerminalRuleCall_3_0_7_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"minRam",
            	                    		lv_minRam_26_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }

            	            otherlv_27=(Token)match(input,26,FOLLOW_26_in_ruleVMCS1202); 

            	                	newLeafNode(otherlv_27, grammarAccess.getVMCSAccess().getFullStopFullStopKeyword_3_0_7_3());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:669:1: ( (lv_maxRam_28_0= RULE_INT ) )?
            	            int alt9=2;
            	            int LA9_0 = input.LA(1);

            	            if ( (LA9_0==RULE_INT) ) {
            	                alt9=1;
            	            }
            	            switch (alt9) {
            	                case 1 :
            	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:670:1: (lv_maxRam_28_0= RULE_INT )
            	                    {
            	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:670:1: (lv_maxRam_28_0= RULE_INT )
            	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:671:3: lv_maxRam_28_0= RULE_INT
            	                    {
            	                    lv_maxRam_28_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVMCS1219); 

            	                    			newLeafNode(lv_maxRam_28_0, grammarAccess.getVMCSAccess().getMaxRamINTTerminalRuleCall_3_0_7_4_0()); 
            	                    		

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getVMCSRule());
            	                    	        }
            	                           		setWithLastConsumed(
            	                           			current, 
            	                           			"maxRam",
            	                            		lv_maxRam_28_0, 
            	                            		"INT");
            	                    	    

            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 9 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:688:6: (otherlv_29= 'storage' otherlv_30= ':' ( (lv_minStorage_31_0= RULE_INT ) ) otherlv_32= '..' ( (lv_maxStorage_33_0= RULE_INT ) )? )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:688:6: (otherlv_29= 'storage' otherlv_30= ':' ( (lv_minStorage_31_0= RULE_INT ) ) otherlv_32= '..' ( (lv_maxStorage_33_0= RULE_INT ) )? )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:688:8: otherlv_29= 'storage' otherlv_30= ':' ( (lv_minStorage_31_0= RULE_INT ) ) otherlv_32= '..' ( (lv_maxStorage_33_0= RULE_INT ) )?
            	            {
            	            otherlv_29=(Token)match(input,28,FOLLOW_28_in_ruleVMCS1245); 

            	                	newLeafNode(otherlv_29, grammarAccess.getVMCSAccess().getStorageKeyword_3_0_8_0());
            	                
            	            otherlv_30=(Token)match(input,18,FOLLOW_18_in_ruleVMCS1257); 

            	                	newLeafNode(otherlv_30, grammarAccess.getVMCSAccess().getColonKeyword_3_0_8_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:696:1: ( (lv_minStorage_31_0= RULE_INT ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:697:1: (lv_minStorage_31_0= RULE_INT )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:697:1: (lv_minStorage_31_0= RULE_INT )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:698:3: lv_minStorage_31_0= RULE_INT
            	            {
            	            lv_minStorage_31_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVMCS1274); 

            	            			newLeafNode(lv_minStorage_31_0, grammarAccess.getVMCSAccess().getMinStorageINTTerminalRuleCall_3_0_8_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"minStorage",
            	                    		lv_minStorage_31_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }

            	            otherlv_32=(Token)match(input,26,FOLLOW_26_in_ruleVMCS1291); 

            	                	newLeafNode(otherlv_32, grammarAccess.getVMCSAccess().getFullStopFullStopKeyword_3_0_8_3());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:718:1: ( (lv_maxStorage_33_0= RULE_INT ) )?
            	            int alt10=2;
            	            int LA10_0 = input.LA(1);

            	            if ( (LA10_0==RULE_INT) ) {
            	                alt10=1;
            	            }
            	            switch (alt10) {
            	                case 1 :
            	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:719:1: (lv_maxStorage_33_0= RULE_INT )
            	                    {
            	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:719:1: (lv_maxStorage_33_0= RULE_INT )
            	                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:720:3: lv_maxStorage_33_0= RULE_INT
            	                    {
            	                    lv_maxStorage_33_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVMCS1308); 

            	                    			newLeafNode(lv_maxStorage_33_0, grammarAccess.getVMCSAccess().getMaxStorageINTTerminalRuleCall_3_0_8_4_0()); 
            	                    		

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getVMCSRule());
            	                    	        }
            	                           		setWithLastConsumed(
            	                           			current, 
            	                           			"maxStorage",
            	                            		lv_maxStorage_33_0, 
            	                            		"INT");
            	                    	    

            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 10 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:737:6: (otherlv_34= 'os' otherlv_35= ':' ( (lv_os_36_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:737:6: (otherlv_34= 'os' otherlv_35= ':' ( (lv_os_36_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:737:8: otherlv_34= 'os' otherlv_35= ':' ( (lv_os_36_0= RULE_STRING ) )
            	            {
            	            otherlv_34=(Token)match(input,29,FOLLOW_29_in_ruleVMCS1334); 

            	                	newLeafNode(otherlv_34, grammarAccess.getVMCSAccess().getOsKeyword_3_0_9_0());
            	                
            	            otherlv_35=(Token)match(input,18,FOLLOW_18_in_ruleVMCS1346); 

            	                	newLeafNode(otherlv_35, grammarAccess.getVMCSAccess().getColonKeyword_3_0_9_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:745:1: ( (lv_os_36_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:746:1: (lv_os_36_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:746:1: (lv_os_36_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:747:3: lv_os_36_0= RULE_STRING
            	            {
            	            lv_os_36_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1363); 

            	            			newLeafNode(lv_os_36_0, grammarAccess.getVMCSAccess().getOsSTRINGTerminalRuleCall_3_0_9_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"os",
            	                    		lv_os_36_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 11 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:764:6: (otherlv_37= 'passwd' otherlv_38= ':' ( (lv_passwd_39_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:764:6: (otherlv_37= 'passwd' otherlv_38= ':' ( (lv_passwd_39_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:764:8: otherlv_37= 'passwd' otherlv_38= ':' ( (lv_passwd_39_0= RULE_STRING ) )
            	            {
            	            otherlv_37=(Token)match(input,30,FOLLOW_30_in_ruleVMCS1388); 

            	                	newLeafNode(otherlv_37, grammarAccess.getVMCSAccess().getPasswdKeyword_3_0_10_0());
            	                
            	            otherlv_38=(Token)match(input,18,FOLLOW_18_in_ruleVMCS1400); 

            	                	newLeafNode(otherlv_38, grammarAccess.getVMCSAccess().getColonKeyword_3_0_10_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:772:1: ( (lv_passwd_39_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:773:1: (lv_passwd_39_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:773:1: (lv_passwd_39_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:774:3: lv_passwd_39_0= RULE_STRING
            	            {
            	            lv_passwd_39_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1417); 

            	            			newLeafNode(lv_passwd_39_0, grammarAccess.getVMCSAccess().getPasswdSTRINGTerminalRuleCall_3_0_10_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"passwd",
            	                    		lv_passwd_39_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 12 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:791:6: (otherlv_40= 'privateKey' otherlv_41= ':' ( (lv_privateKey_42_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:791:6: (otherlv_40= 'privateKey' otherlv_41= ':' ( (lv_privateKey_42_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:791:8: otherlv_40= 'privateKey' otherlv_41= ':' ( (lv_privateKey_42_0= RULE_STRING ) )
            	            {
            	            otherlv_40=(Token)match(input,31,FOLLOW_31_in_ruleVMCS1442); 

            	                	newLeafNode(otherlv_40, grammarAccess.getVMCSAccess().getPrivateKeyKeyword_3_0_11_0());
            	                
            	            otherlv_41=(Token)match(input,18,FOLLOW_18_in_ruleVMCS1454); 

            	                	newLeafNode(otherlv_41, grammarAccess.getVMCSAccess().getColonKeyword_3_0_11_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:799:1: ( (lv_privateKey_42_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:800:1: (lv_privateKey_42_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:800:1: (lv_privateKey_42_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:801:3: lv_privateKey_42_0= RULE_STRING
            	            {
            	            lv_privateKey_42_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1471); 

            	            			newLeafNode(lv_privateKey_42_0, grammarAccess.getVMCSAccess().getPrivateKeySTRINGTerminalRuleCall_3_0_11_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"privateKey",
            	                    		lv_privateKey_42_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 13 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:818:6: (otherlv_43= 'region' otherlv_44= ':' ( (lv_Region_45_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:818:6: (otherlv_43= 'region' otherlv_44= ':' ( (lv_Region_45_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:818:8: otherlv_43= 'region' otherlv_44= ':' ( (lv_Region_45_0= RULE_STRING ) )
            	            {
            	            otherlv_43=(Token)match(input,32,FOLLOW_32_in_ruleVMCS1496); 

            	                	newLeafNode(otherlv_43, grammarAccess.getVMCSAccess().getRegionKeyword_3_0_12_0());
            	                
            	            otherlv_44=(Token)match(input,18,FOLLOW_18_in_ruleVMCS1508); 

            	                	newLeafNode(otherlv_44, grammarAccess.getVMCSAccess().getColonKeyword_3_0_12_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:826:1: ( (lv_Region_45_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:827:1: (lv_Region_45_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:827:1: (lv_Region_45_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:828:3: lv_Region_45_0= RULE_STRING
            	            {
            	            lv_Region_45_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1525); 

            	            			newLeafNode(lv_Region_45_0, grammarAccess.getVMCSAccess().getRegionSTRINGTerminalRuleCall_3_0_12_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"Region",
            	                    		lv_Region_45_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 14 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:845:6: (otherlv_46= 'securityGroup' otherlv_47= ':' ( (lv_securityGroup_48_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:845:6: (otherlv_46= 'securityGroup' otherlv_47= ':' ( (lv_securityGroup_48_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:845:8: otherlv_46= 'securityGroup' otherlv_47= ':' ( (lv_securityGroup_48_0= RULE_STRING ) )
            	            {
            	            otherlv_46=(Token)match(input,33,FOLLOW_33_in_ruleVMCS1550); 

            	                	newLeafNode(otherlv_46, grammarAccess.getVMCSAccess().getSecurityGroupKeyword_3_0_13_0());
            	                
            	            otherlv_47=(Token)match(input,18,FOLLOW_18_in_ruleVMCS1562); 

            	                	newLeafNode(otherlv_47, grammarAccess.getVMCSAccess().getColonKeyword_3_0_13_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:853:1: ( (lv_securityGroup_48_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:854:1: (lv_securityGroup_48_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:854:1: (lv_securityGroup_48_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:855:3: lv_securityGroup_48_0= RULE_STRING
            	            {
            	            lv_securityGroup_48_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1579); 

            	            			newLeafNode(lv_securityGroup_48_0, grammarAccess.getVMCSAccess().getSecurityGroupSTRINGTerminalRuleCall_3_0_13_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"securityGroup",
            	                    		lv_securityGroup_48_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 15 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:872:6: (otherlv_49= 'serviceType' otherlv_50= ':' ( (lv_serviceType_51_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:872:6: (otherlv_49= 'serviceType' otherlv_50= ':' ( (lv_serviceType_51_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:872:8: otherlv_49= 'serviceType' otherlv_50= ':' ( (lv_serviceType_51_0= RULE_STRING ) )
            	            {
            	            otherlv_49=(Token)match(input,34,FOLLOW_34_in_ruleVMCS1604); 

            	                	newLeafNode(otherlv_49, grammarAccess.getVMCSAccess().getServiceTypeKeyword_3_0_14_0());
            	                
            	            otherlv_50=(Token)match(input,18,FOLLOW_18_in_ruleVMCS1616); 

            	                	newLeafNode(otherlv_50, grammarAccess.getVMCSAccess().getColonKeyword_3_0_14_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:880:1: ( (lv_serviceType_51_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:881:1: (lv_serviceType_51_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:881:1: (lv_serviceType_51_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:882:3: lv_serviceType_51_0= RULE_STRING
            	            {
            	            lv_serviceType_51_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1633); 

            	            			newLeafNode(lv_serviceType_51_0, grammarAccess.getVMCSAccess().getServiceTypeSTRINGTerminalRuleCall_3_0_14_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"serviceType",
            	                    		lv_serviceType_51_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 16 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:899:6: (otherlv_52= 'sshKey' otherlv_53= ':' ( (lv_sshKey_54_0= RULE_STRING ) ) )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:899:6: (otherlv_52= 'sshKey' otherlv_53= ':' ( (lv_sshKey_54_0= RULE_STRING ) ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:899:8: otherlv_52= 'sshKey' otherlv_53= ':' ( (lv_sshKey_54_0= RULE_STRING ) )
            	            {
            	            otherlv_52=(Token)match(input,35,FOLLOW_35_in_ruleVMCS1658); 

            	                	newLeafNode(otherlv_52, grammarAccess.getVMCSAccess().getSshKeyKeyword_3_0_15_0());
            	                
            	            otherlv_53=(Token)match(input,18,FOLLOW_18_in_ruleVMCS1670); 

            	                	newLeafNode(otherlv_53, grammarAccess.getVMCSAccess().getColonKeyword_3_0_15_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:907:1: ( (lv_sshKey_54_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:908:1: (lv_sshKey_54_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:908:1: (lv_sshKey_54_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:909:3: lv_sshKey_54_0= RULE_STRING
            	            {
            	            lv_sshKey_54_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVMCS1687); 

            	            			newLeafNode(lv_sshKey_54_0, grammarAccess.getVMCSAccess().getSshKeySTRINGTerminalRuleCall_3_0_15_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getVMCSRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"sshKey",
            	                    		lv_sshKey_54_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:925:4: (otherlv_55= ',' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==36) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:925:6: otherlv_55= ','
            	            {
            	            otherlv_55=(Token)match(input,36,FOLLOW_36_in_ruleVMCS1707); 

            	                	newLeafNode(otherlv_55, grammarAccess.getVMCSAccess().getCommaKeyword_3_1());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:929:5: ( (lv_providedPorts_56_0= ruleProvidedPortCS ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==40) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==41) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:930:1: (lv_providedPorts_56_0= ruleProvidedPortCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:930:1: (lv_providedPorts_56_0= ruleProvidedPortCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:931:3: lv_providedPorts_56_0= ruleProvidedPortCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVMCSAccess().getProvidedPortsProvidedPortCSParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProvidedPortCS_in_ruleVMCS1732);
            	    lv_providedPorts_56_0=ruleProvidedPortCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVMCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providedPorts",
            	            		lv_providedPorts_56_0, 
            	            		"ProvidedPortCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:947:3: ( (lv_providedExecutionPlatforms_57_0= ruleProvidedExecutionPlatformCS ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==40) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:948:1: (lv_providedExecutionPlatforms_57_0= ruleProvidedExecutionPlatformCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:948:1: (lv_providedExecutionPlatforms_57_0= ruleProvidedExecutionPlatformCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:949:3: lv_providedExecutionPlatforms_57_0= ruleProvidedExecutionPlatformCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVMCSAccess().getProvidedExecutionPlatformsProvidedExecutionPlatformCSParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProvidedExecutionPlatformCS_in_ruleVMCS1754);
            	    lv_providedExecutionPlatforms_57_0=ruleProvidedExecutionPlatformCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVMCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providedExecutionPlatforms",
            	            		lv_providedExecutionPlatforms_57_0, 
            	            		"ProvidedExecutionPlatformCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:965:3: (otherlv_58= 'properties' otherlv_59= ':' ( (lv_properties_60_0= rulePropertyCS ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:965:5: otherlv_58= 'properties' otherlv_59= ':' ( (lv_properties_60_0= rulePropertyCS ) )*
                    {
                    otherlv_58=(Token)match(input,37,FOLLOW_37_in_ruleVMCS1768); 

                        	newLeafNode(otherlv_58, grammarAccess.getVMCSAccess().getPropertiesKeyword_6_0());
                        
                    otherlv_59=(Token)match(input,18,FOLLOW_18_in_ruleVMCS1780); 

                        	newLeafNode(otherlv_59, grammarAccess.getVMCSAccess().getColonKeyword_6_1());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:973:1: ( (lv_properties_60_0= rulePropertyCS ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==56) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:974:1: (lv_properties_60_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:974:1: (lv_properties_60_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:975:3: lv_properties_60_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVMCSAccess().getPropertiesPropertyCSParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleVMCS1801);
                    	    lv_properties_60_0=rulePropertyCS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVMCSRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_60_0, 
                    	            		"PropertyCS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_61=(Token)match(input,15,FOLLOW_15_in_ruleVMCS1816); 

                	newLeafNode(otherlv_61, grammarAccess.getVMCSAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1005:1: entryRuleExternalComponentCS returns [EObject current=null] : iv_ruleExternalComponentCS= ruleExternalComponentCS EOF ;
    public final EObject entryRuleExternalComponentCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalComponentCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1006:2: (iv_ruleExternalComponentCS= ruleExternalComponentCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1007:2: iv_ruleExternalComponentCS= ruleExternalComponentCS EOF
            {
             newCompositeNode(grammarAccess.getExternalComponentCSRule()); 
            pushFollow(FOLLOW_ruleExternalComponentCS_in_entryRuleExternalComponentCS1854);
            iv_ruleExternalComponentCS=ruleExternalComponentCS();

            state._fsp--;

             current =iv_ruleExternalComponentCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalComponentCS1864); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1014:1: ruleExternalComponentCS returns [EObject current=null] : (otherlv_0= 'external' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )? ( ( (lv_providedPorts_7_0= ruleProvidedPortCS ) ) | ( (lv_providedExecutionPlatforms_8_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_9= 'properties' otherlv_10= ':' ( (lv_properties_11_0= rulePropertyCS ) )* )? ( (lv_resources_12_0= ruleResourceCS ) )* otherlv_13= '}' ) ;
    public final EObject ruleExternalComponentCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_providedPorts_7_0 = null;

        EObject lv_providedExecutionPlatforms_8_0 = null;

        EObject lv_properties_11_0 = null;

        EObject lv_resources_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1017:28: ( (otherlv_0= 'external' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )? ( ( (lv_providedPorts_7_0= ruleProvidedPortCS ) ) | ( (lv_providedExecutionPlatforms_8_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_9= 'properties' otherlv_10= ':' ( (lv_properties_11_0= rulePropertyCS ) )* )? ( (lv_resources_12_0= ruleResourceCS ) )* otherlv_13= '}' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1018:1: (otherlv_0= 'external' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )? ( ( (lv_providedPorts_7_0= ruleProvidedPortCS ) ) | ( (lv_providedExecutionPlatforms_8_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_9= 'properties' otherlv_10= ':' ( (lv_properties_11_0= rulePropertyCS ) )* )? ( (lv_resources_12_0= ruleResourceCS ) )* otherlv_13= '}' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1018:1: (otherlv_0= 'external' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )? ( ( (lv_providedPorts_7_0= ruleProvidedPortCS ) ) | ( (lv_providedExecutionPlatforms_8_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_9= 'properties' otherlv_10= ':' ( (lv_properties_11_0= rulePropertyCS ) )* )? ( (lv_resources_12_0= ruleResourceCS ) )* otherlv_13= '}' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1018:3: otherlv_0= 'external' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )? ( ( (lv_providedPorts_7_0= ruleProvidedPortCS ) ) | ( (lv_providedExecutionPlatforms_8_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_9= 'properties' otherlv_10= ':' ( (lv_properties_11_0= rulePropertyCS ) )* )? ( (lv_resources_12_0= ruleResourceCS ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleExternalComponentCS1901); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalComponentCSAccess().getExternalKeyword_0());
                
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleExternalComponentCS1913); 

                	newLeafNode(otherlv_1, grammarAccess.getExternalComponentCSAccess().getComponentKeyword_1());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1026:1: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1027:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1027:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1028:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getExternalComponentCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleExternalComponentCS1934);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalComponentCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleExternalComponentCS1946); 

                	newLeafNode(otherlv_3, grammarAccess.getExternalComponentCSAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1048:1: (otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1048:3: otherlv_4= 'provider' otherlv_5= ':' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleExternalComponentCS1959); 

                        	newLeafNode(otherlv_4, grammarAccess.getExternalComponentCSAccess().getProviderKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleExternalComponentCS1971); 

                        	newLeafNode(otherlv_5, grammarAccess.getExternalComponentCSAccess().getColonKeyword_4_1());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1056:1: ( (otherlv_6= RULE_ID ) )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1057:1: (otherlv_6= RULE_ID )
                    {
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1057:1: (otherlv_6= RULE_ID )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1058:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getExternalComponentCSRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalComponentCS1991); 

                    		newLeafNode(otherlv_6, grammarAccess.getExternalComponentCSAccess().getProviderProviderCrossReference_4_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1069:4: ( ( (lv_providedPorts_7_0= ruleProvidedPortCS ) ) | ( (lv_providedExecutionPlatforms_8_0= ruleProvidedExecutionPlatformCS ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==41) ) {
                        alt19=1;
                    }
                    else if ( (LA19_2==47) ) {
                        alt19=2;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1069:5: ( (lv_providedPorts_7_0= ruleProvidedPortCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1069:5: ( (lv_providedPorts_7_0= ruleProvidedPortCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1070:1: (lv_providedPorts_7_0= ruleProvidedPortCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1070:1: (lv_providedPorts_7_0= ruleProvidedPortCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1071:3: lv_providedPorts_7_0= ruleProvidedPortCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExternalComponentCSAccess().getProvidedPortsProvidedPortCSParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProvidedPortCS_in_ruleExternalComponentCS2015);
            	    lv_providedPorts_7_0=ruleProvidedPortCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExternalComponentCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providedPorts",
            	            		lv_providedPorts_7_0, 
            	            		"ProvidedPortCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1088:6: ( (lv_providedExecutionPlatforms_8_0= ruleProvidedExecutionPlatformCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1088:6: ( (lv_providedExecutionPlatforms_8_0= ruleProvidedExecutionPlatformCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1089:1: (lv_providedExecutionPlatforms_8_0= ruleProvidedExecutionPlatformCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1089:1: (lv_providedExecutionPlatforms_8_0= ruleProvidedExecutionPlatformCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1090:3: lv_providedExecutionPlatforms_8_0= ruleProvidedExecutionPlatformCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExternalComponentCSAccess().getProvidedExecutionPlatformsProvidedExecutionPlatformCSParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProvidedExecutionPlatformCS_in_ruleExternalComponentCS2042);
            	    lv_providedExecutionPlatforms_8_0=ruleProvidedExecutionPlatformCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExternalComponentCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providedExecutionPlatforms",
            	            		lv_providedExecutionPlatforms_8_0, 
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

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1106:4: (otherlv_9= 'properties' otherlv_10= ':' ( (lv_properties_11_0= rulePropertyCS ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1106:6: otherlv_9= 'properties' otherlv_10= ':' ( (lv_properties_11_0= rulePropertyCS ) )*
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleExternalComponentCS2057); 

                        	newLeafNode(otherlv_9, grammarAccess.getExternalComponentCSAccess().getPropertiesKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleExternalComponentCS2069); 

                        	newLeafNode(otherlv_10, grammarAccess.getExternalComponentCSAccess().getColonKeyword_6_1());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1114:1: ( (lv_properties_11_0= rulePropertyCS ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==56) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1115:1: (lv_properties_11_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1115:1: (lv_properties_11_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1116:3: lv_properties_11_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExternalComponentCSAccess().getPropertiesPropertyCSParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleExternalComponentCS2090);
                    	    lv_properties_11_0=rulePropertyCS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExternalComponentCSRule());
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
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1132:5: ( (lv_resources_12_0= ruleResourceCS ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==58) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1133:1: (lv_resources_12_0= ruleResourceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1133:1: (lv_resources_12_0= ruleResourceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1134:3: lv_resources_12_0= ruleResourceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExternalComponentCSAccess().getResourcesResourceCSParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceCS_in_ruleExternalComponentCS2114);
            	    lv_resources_12_0=ruleResourceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExternalComponentCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_12_0, 
            	            		"ResourceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleExternalComponentCS2127); 

                	newLeafNode(otherlv_13, grammarAccess.getExternalComponentCSAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1162:1: entryRuleProvidedPortCS returns [EObject current=null] : iv_ruleProvidedPortCS= ruleProvidedPortCS EOF ;
    public final EObject entryRuleProvidedPortCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedPortCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1163:2: (iv_ruleProvidedPortCS= ruleProvidedPortCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1164:2: iv_ruleProvidedPortCS= ruleProvidedPortCS EOF
            {
             newCompositeNode(grammarAccess.getProvidedPortCSRule()); 
            pushFollow(FOLLOW_ruleProvidedPortCS_in_entryRuleProvidedPortCS2163);
            iv_ruleProvidedPortCS=ruleProvidedPortCS();

            state._fsp--;

             current =iv_ruleProvidedPortCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedPortCS2173); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1171:1: ruleProvidedPortCS returns [EObject current=null] : (otherlv_0= 'provided' otherlv_1= 'communication' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) ) (otherlv_8= ',' )? )* ( (lv_properties_9_0= rulePropertyCS ) )* )? ) ;
    public final EObject ruleProvidedPortCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_isLocal_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_portNumber_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1174:28: ( (otherlv_0= 'provided' otherlv_1= 'communication' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) ) (otherlv_8= ',' )? )* ( (lv_properties_9_0= rulePropertyCS ) )* )? ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1175:1: (otherlv_0= 'provided' otherlv_1= 'communication' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) ) (otherlv_8= ',' )? )* ( (lv_properties_9_0= rulePropertyCS ) )* )? )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1175:1: (otherlv_0= 'provided' otherlv_1= 'communication' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) ) (otherlv_8= ',' )? )* ( (lv_properties_9_0= rulePropertyCS ) )* )? )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1175:3: otherlv_0= 'provided' otherlv_1= 'communication' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) ) (otherlv_8= ',' )? )* ( (lv_properties_9_0= rulePropertyCS ) )* )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleProvidedPortCS2210); 

                	newLeafNode(otherlv_0, grammarAccess.getProvidedPortCSAccess().getProvidedKeyword_0());
                
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleProvidedPortCS2222); 

                	newLeafNode(otherlv_1, grammarAccess.getProvidedPortCSAccess().getCommunicationKeyword_1());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1183:1: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1184:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1184:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1185:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getProvidedPortCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleProvidedPortCS2243);
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

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1201:2: (otherlv_3= ':' ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) ) (otherlv_8= ',' )? )* ( (lv_properties_9_0= rulePropertyCS ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1201:4: otherlv_3= ':' ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) ) (otherlv_8= ',' )? )* ( (lv_properties_9_0= rulePropertyCS ) )*
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleProvidedPortCS2256); 

                        	newLeafNode(otherlv_3, grammarAccess.getProvidedPortCSAccess().getColonKeyword_3_0());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1205:1: ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) ) (otherlv_8= ',' )? )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=42 && LA25_0<=43)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1205:2: ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) ) (otherlv_8= ',' )?
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1205:2: ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) )
                    	    int alt23=2;
                    	    int LA23_0 = input.LA(1);

                    	    if ( (LA23_0==42) ) {
                    	        alt23=1;
                    	    }
                    	    else if ( (LA23_0==43) ) {
                    	        alt23=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 23, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt23) {
                    	        case 1 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1205:3: ( (lv_isLocal_4_0= 'local' ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1205:3: ( (lv_isLocal_4_0= 'local' ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1206:1: (lv_isLocal_4_0= 'local' )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1206:1: (lv_isLocal_4_0= 'local' )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1207:3: lv_isLocal_4_0= 'local'
                    	            {
                    	            lv_isLocal_4_0=(Token)match(input,42,FOLLOW_42_in_ruleProvidedPortCS2276); 

                    	                    newLeafNode(lv_isLocal_4_0, grammarAccess.getProvidedPortCSAccess().getIsLocalLocalKeyword_3_1_0_0_0());
                    	                

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getProvidedPortCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(current, "isLocal", true, "local");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1221:6: (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1221:6: (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1221:8: otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) )
                    	            {
                    	            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleProvidedPortCS2308); 

                    	                	newLeafNode(otherlv_5, grammarAccess.getProvidedPortCSAccess().getPortKeyword_3_1_0_1_0());
                    	                
                    	            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleProvidedPortCS2320); 

                    	                	newLeafNode(otherlv_6, grammarAccess.getProvidedPortCSAccess().getColonKeyword_3_1_0_1_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1229:1: ( (lv_portNumber_7_0= RULE_INT ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1230:1: (lv_portNumber_7_0= RULE_INT )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1230:1: (lv_portNumber_7_0= RULE_INT )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1231:3: lv_portNumber_7_0= RULE_INT
                    	            {
                    	            lv_portNumber_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProvidedPortCS2337); 

                    	            			newLeafNode(lv_portNumber_7_0, grammarAccess.getProvidedPortCSAccess().getPortNumberINTTerminalRuleCall_3_1_0_1_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getProvidedPortCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"portNumber",
                    	                    		lv_portNumber_7_0, 
                    	                    		"INT");
                    	            	    

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1247:4: (otherlv_8= ',' )?
                    	    int alt24=2;
                    	    int LA24_0 = input.LA(1);

                    	    if ( (LA24_0==36) ) {
                    	        alt24=1;
                    	    }
                    	    switch (alt24) {
                    	        case 1 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1247:6: otherlv_8= ','
                    	            {
                    	            otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleProvidedPortCS2357); 

                    	                	newLeafNode(otherlv_8, grammarAccess.getProvidedPortCSAccess().getCommaKeyword_3_1_1());
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1251:5: ( (lv_properties_9_0= rulePropertyCS ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==56) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1252:1: (lv_properties_9_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1252:1: (lv_properties_9_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1253:3: lv_properties_9_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProvidedPortCSAccess().getPropertiesPropertyCSParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleProvidedPortCS2382);
                    	    lv_properties_9_0=rulePropertyCS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProvidedPortCSRule());
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
                    	    break loop26;
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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1277:1: entryRuleInternalComponentCS returns [EObject current=null] : iv_ruleInternalComponentCS= ruleInternalComponentCS EOF ;
    public final EObject entryRuleInternalComponentCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalComponentCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1278:2: (iv_ruleInternalComponentCS= ruleInternalComponentCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1279:2: iv_ruleInternalComponentCS= ruleInternalComponentCS EOF
            {
             newCompositeNode(grammarAccess.getInternalComponentCSRule()); 
            pushFollow(FOLLOW_ruleInternalComponentCS_in_entryRuleInternalComponentCS2421);
            iv_ruleInternalComponentCS=ruleInternalComponentCS();

            state._fsp--;

             current =iv_ruleInternalComponentCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalComponentCS2431); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1286:1: ruleInternalComponentCS returns [EObject current=null] : (otherlv_0= 'internal' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( ( (lv_providedPorts_4_0= ruleProvidedPortCS ) ) | ( (lv_requiredPorts_5_0= ruleRequiredPortCS ) ) | ( (lv_requiredExecutionPlatform_6_0= ruleRequiredExecutionPlatformCS ) ) | ( (lv_providedExecutionPlatforms_7_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_8= 'properties' otherlv_9= ':' ( (lv_properties_10_0= rulePropertyCS ) )* )? ( (lv_resources_11_0= ruleResourceCS ) )* otherlv_12= '}' ) ;
    public final EObject ruleInternalComponentCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_providedPorts_4_0 = null;

        EObject lv_requiredPorts_5_0 = null;

        EObject lv_requiredExecutionPlatform_6_0 = null;

        EObject lv_providedExecutionPlatforms_7_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_resources_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1289:28: ( (otherlv_0= 'internal' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( ( (lv_providedPorts_4_0= ruleProvidedPortCS ) ) | ( (lv_requiredPorts_5_0= ruleRequiredPortCS ) ) | ( (lv_requiredExecutionPlatform_6_0= ruleRequiredExecutionPlatformCS ) ) | ( (lv_providedExecutionPlatforms_7_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_8= 'properties' otherlv_9= ':' ( (lv_properties_10_0= rulePropertyCS ) )* )? ( (lv_resources_11_0= ruleResourceCS ) )* otherlv_12= '}' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1290:1: (otherlv_0= 'internal' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( ( (lv_providedPorts_4_0= ruleProvidedPortCS ) ) | ( (lv_requiredPorts_5_0= ruleRequiredPortCS ) ) | ( (lv_requiredExecutionPlatform_6_0= ruleRequiredExecutionPlatformCS ) ) | ( (lv_providedExecutionPlatforms_7_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_8= 'properties' otherlv_9= ':' ( (lv_properties_10_0= rulePropertyCS ) )* )? ( (lv_resources_11_0= ruleResourceCS ) )* otherlv_12= '}' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1290:1: (otherlv_0= 'internal' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( ( (lv_providedPorts_4_0= ruleProvidedPortCS ) ) | ( (lv_requiredPorts_5_0= ruleRequiredPortCS ) ) | ( (lv_requiredExecutionPlatform_6_0= ruleRequiredExecutionPlatformCS ) ) | ( (lv_providedExecutionPlatforms_7_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_8= 'properties' otherlv_9= ':' ( (lv_properties_10_0= rulePropertyCS ) )* )? ( (lv_resources_11_0= ruleResourceCS ) )* otherlv_12= '}' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1290:3: otherlv_0= 'internal' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( ( (lv_providedPorts_4_0= ruleProvidedPortCS ) ) | ( (lv_requiredPorts_5_0= ruleRequiredPortCS ) ) | ( (lv_requiredExecutionPlatform_6_0= ruleRequiredExecutionPlatformCS ) ) | ( (lv_providedExecutionPlatforms_7_0= ruleProvidedExecutionPlatformCS ) ) )* (otherlv_8= 'properties' otherlv_9= ':' ( (lv_properties_10_0= rulePropertyCS ) )* )? ( (lv_resources_11_0= ruleResourceCS ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleInternalComponentCS2468); 

                	newLeafNode(otherlv_0, grammarAccess.getInternalComponentCSAccess().getInternalKeyword_0());
                
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleInternalComponentCS2480); 

                	newLeafNode(otherlv_1, grammarAccess.getInternalComponentCSAccess().getComponentKeyword_1());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1298:1: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1299:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1299:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1300:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleInternalComponentCS2501);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInternalComponentCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleInternalComponentCS2513); 

                	newLeafNode(otherlv_3, grammarAccess.getInternalComponentCSAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1320:1: ( ( (lv_providedPorts_4_0= ruleProvidedPortCS ) ) | ( (lv_requiredPorts_5_0= ruleRequiredPortCS ) ) | ( (lv_requiredExecutionPlatform_6_0= ruleRequiredExecutionPlatformCS ) ) | ( (lv_providedExecutionPlatforms_7_0= ruleProvidedExecutionPlatformCS ) ) )*
            loop28:
            do {
                int alt28=5;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==40) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==41) ) {
                        alt28=1;
                    }
                    else if ( (LA28_2==47) ) {
                        alt28=4;
                    }


                }
                else if ( (LA28_0==45) ) {
                    int LA28_3 = input.LA(2);

                    if ( (LA28_3==47) ) {
                        alt28=3;
                    }
                    else if ( (LA28_3==41) ) {
                        alt28=2;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1320:2: ( (lv_providedPorts_4_0= ruleProvidedPortCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1320:2: ( (lv_providedPorts_4_0= ruleProvidedPortCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1321:1: (lv_providedPorts_4_0= ruleProvidedPortCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1321:1: (lv_providedPorts_4_0= ruleProvidedPortCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1322:3: lv_providedPorts_4_0= ruleProvidedPortCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getProvidedPortsProvidedPortCSParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProvidedPortCS_in_ruleInternalComponentCS2535);
            	    lv_providedPorts_4_0=ruleProvidedPortCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInternalComponentCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providedPorts",
            	            		lv_providedPorts_4_0, 
            	            		"ProvidedPortCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1339:6: ( (lv_requiredPorts_5_0= ruleRequiredPortCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1339:6: ( (lv_requiredPorts_5_0= ruleRequiredPortCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1340:1: (lv_requiredPorts_5_0= ruleRequiredPortCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1340:1: (lv_requiredPorts_5_0= ruleRequiredPortCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1341:3: lv_requiredPorts_5_0= ruleRequiredPortCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getRequiredPortsRequiredPortCSParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequiredPortCS_in_ruleInternalComponentCS2562);
            	    lv_requiredPorts_5_0=ruleRequiredPortCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInternalComponentCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"requiredPorts",
            	            		lv_requiredPorts_5_0, 
            	            		"RequiredPortCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1358:6: ( (lv_requiredExecutionPlatform_6_0= ruleRequiredExecutionPlatformCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1358:6: ( (lv_requiredExecutionPlatform_6_0= ruleRequiredExecutionPlatformCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1359:1: (lv_requiredExecutionPlatform_6_0= ruleRequiredExecutionPlatformCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1359:1: (lv_requiredExecutionPlatform_6_0= ruleRequiredExecutionPlatformCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1360:3: lv_requiredExecutionPlatform_6_0= ruleRequiredExecutionPlatformCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getRequiredExecutionPlatformRequiredExecutionPlatformCSParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequiredExecutionPlatformCS_in_ruleInternalComponentCS2589);
            	    lv_requiredExecutionPlatform_6_0=ruleRequiredExecutionPlatformCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInternalComponentCSRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"requiredExecutionPlatform",
            	            		lv_requiredExecutionPlatform_6_0, 
            	            		"RequiredExecutionPlatformCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1377:6: ( (lv_providedExecutionPlatforms_7_0= ruleProvidedExecutionPlatformCS ) )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1377:6: ( (lv_providedExecutionPlatforms_7_0= ruleProvidedExecutionPlatformCS ) )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1378:1: (lv_providedExecutionPlatforms_7_0= ruleProvidedExecutionPlatformCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1378:1: (lv_providedExecutionPlatforms_7_0= ruleProvidedExecutionPlatformCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1379:3: lv_providedExecutionPlatforms_7_0= ruleProvidedExecutionPlatformCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getProvidedExecutionPlatformsProvidedExecutionPlatformCSParserRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProvidedExecutionPlatformCS_in_ruleInternalComponentCS2616);
            	    lv_providedExecutionPlatforms_7_0=ruleProvidedExecutionPlatformCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInternalComponentCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providedExecutionPlatforms",
            	            		lv_providedExecutionPlatforms_7_0, 
            	            		"ProvidedExecutionPlatformCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1395:4: (otherlv_8= 'properties' otherlv_9= ':' ( (lv_properties_10_0= rulePropertyCS ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1395:6: otherlv_8= 'properties' otherlv_9= ':' ( (lv_properties_10_0= rulePropertyCS ) )*
                    {
                    otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleInternalComponentCS2631); 

                        	newLeafNode(otherlv_8, grammarAccess.getInternalComponentCSAccess().getPropertiesKeyword_5_0());
                        
                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleInternalComponentCS2643); 

                        	newLeafNode(otherlv_9, grammarAccess.getInternalComponentCSAccess().getColonKeyword_5_1());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1403:1: ( (lv_properties_10_0= rulePropertyCS ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==56) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1404:1: (lv_properties_10_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1404:1: (lv_properties_10_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1405:3: lv_properties_10_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getPropertiesPropertyCSParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleInternalComponentCS2664);
                    	    lv_properties_10_0=rulePropertyCS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInternalComponentCSRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_10_0, 
                    	            		"PropertyCS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1421:5: ( (lv_resources_11_0= ruleResourceCS ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==58) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1422:1: (lv_resources_11_0= ruleResourceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1422:1: (lv_resources_11_0= ruleResourceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1423:3: lv_resources_11_0= ruleResourceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInternalComponentCSAccess().getResourcesResourceCSParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceCS_in_ruleInternalComponentCS2688);
            	    lv_resources_11_0=ruleResourceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInternalComponentCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_11_0, 
            	            		"ResourceCS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleInternalComponentCS2701); 

                	newLeafNode(otherlv_12, grammarAccess.getInternalComponentCSAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1451:1: entryRuleRequiredPortCS returns [EObject current=null] : iv_ruleRequiredPortCS= ruleRequiredPortCS EOF ;
    public final EObject entryRuleRequiredPortCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredPortCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1452:2: (iv_ruleRequiredPortCS= ruleRequiredPortCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1453:2: iv_ruleRequiredPortCS= ruleRequiredPortCS EOF
            {
             newCompositeNode(grammarAccess.getRequiredPortCSRule()); 
            pushFollow(FOLLOW_ruleRequiredPortCS_in_entryRuleRequiredPortCS2737);
            iv_ruleRequiredPortCS=ruleRequiredPortCS();

            state._fsp--;

             current =iv_ruleRequiredPortCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredPortCS2747); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1460:1: ruleRequiredPortCS returns [EObject current=null] : (otherlv_0= 'required' otherlv_1= 'communication' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) | ( (lv_isMandatory_8_0= 'mandatory' ) ) ) (otherlv_9= ',' )? )* ( (lv_properties_10_0= rulePropertyCS ) )* )? ) ;
    public final EObject ruleRequiredPortCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_isLocal_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_portNumber_7_0=null;
        Token lv_isMandatory_8_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1463:28: ( (otherlv_0= 'required' otherlv_1= 'communication' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) | ( (lv_isMandatory_8_0= 'mandatory' ) ) ) (otherlv_9= ',' )? )* ( (lv_properties_10_0= rulePropertyCS ) )* )? ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1464:1: (otherlv_0= 'required' otherlv_1= 'communication' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) | ( (lv_isMandatory_8_0= 'mandatory' ) ) ) (otherlv_9= ',' )? )* ( (lv_properties_10_0= rulePropertyCS ) )* )? )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1464:1: (otherlv_0= 'required' otherlv_1= 'communication' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) | ( (lv_isMandatory_8_0= 'mandatory' ) ) ) (otherlv_9= ',' )? )* ( (lv_properties_10_0= rulePropertyCS ) )* )? )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1464:3: otherlv_0= 'required' otherlv_1= 'communication' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) | ( (lv_isMandatory_8_0= 'mandatory' ) ) ) (otherlv_9= ',' )? )* ( (lv_properties_10_0= rulePropertyCS ) )* )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleRequiredPortCS2784); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiredPortCSAccess().getRequiredKeyword_0());
                
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleRequiredPortCS2796); 

                	newLeafNode(otherlv_1, grammarAccess.getRequiredPortCSAccess().getCommunicationKeyword_1());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1472:1: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1473:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1473:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1474:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getRequiredPortCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleRequiredPortCS2817);
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

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1490:2: (otherlv_3= ':' ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) | ( (lv_isMandatory_8_0= 'mandatory' ) ) ) (otherlv_9= ',' )? )* ( (lv_properties_10_0= rulePropertyCS ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==18) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1490:4: otherlv_3= ':' ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) | ( (lv_isMandatory_8_0= 'mandatory' ) ) ) (otherlv_9= ',' )? )* ( (lv_properties_10_0= rulePropertyCS ) )*
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleRequiredPortCS2830); 

                        	newLeafNode(otherlv_3, grammarAccess.getRequiredPortCSAccess().getColonKeyword_3_0());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1494:1: ( ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) | ( (lv_isMandatory_8_0= 'mandatory' ) ) ) (otherlv_9= ',' )? )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0>=42 && LA34_0<=43)||LA34_0==46) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1494:2: ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) | ( (lv_isMandatory_8_0= 'mandatory' ) ) ) (otherlv_9= ',' )?
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1494:2: ( ( (lv_isLocal_4_0= 'local' ) ) | (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) ) | ( (lv_isMandatory_8_0= 'mandatory' ) ) )
                    	    int alt32=3;
                    	    switch ( input.LA(1) ) {
                    	    case 42:
                    	        {
                    	        alt32=1;
                    	        }
                    	        break;
                    	    case 43:
                    	        {
                    	        alt32=2;
                    	        }
                    	        break;
                    	    case 46:
                    	        {
                    	        alt32=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 32, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt32) {
                    	        case 1 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1494:3: ( (lv_isLocal_4_0= 'local' ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1494:3: ( (lv_isLocal_4_0= 'local' ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1495:1: (lv_isLocal_4_0= 'local' )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1495:1: (lv_isLocal_4_0= 'local' )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1496:3: lv_isLocal_4_0= 'local'
                    	            {
                    	            lv_isLocal_4_0=(Token)match(input,42,FOLLOW_42_in_ruleRequiredPortCS2850); 

                    	                    newLeafNode(lv_isLocal_4_0, grammarAccess.getRequiredPortCSAccess().getIsLocalLocalKeyword_3_1_0_0_0());
                    	                

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getRequiredPortCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(current, "isLocal", true, "local");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1510:6: (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1510:6: (otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1510:8: otherlv_5= 'port' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) )
                    	            {
                    	            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleRequiredPortCS2882); 

                    	                	newLeafNode(otherlv_5, grammarAccess.getRequiredPortCSAccess().getPortKeyword_3_1_0_1_0());
                    	                
                    	            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleRequiredPortCS2894); 

                    	                	newLeafNode(otherlv_6, grammarAccess.getRequiredPortCSAccess().getColonKeyword_3_1_0_1_1());
                    	                
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1518:1: ( (lv_portNumber_7_0= RULE_INT ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1519:1: (lv_portNumber_7_0= RULE_INT )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1519:1: (lv_portNumber_7_0= RULE_INT )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1520:3: lv_portNumber_7_0= RULE_INT
                    	            {
                    	            lv_portNumber_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRequiredPortCS2911); 

                    	            			newLeafNode(lv_portNumber_7_0, grammarAccess.getRequiredPortCSAccess().getPortNumberINTTerminalRuleCall_3_1_0_1_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getRequiredPortCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"portNumber",
                    	                    		lv_portNumber_7_0, 
                    	                    		"INT");
                    	            	    

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1537:6: ( (lv_isMandatory_8_0= 'mandatory' ) )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1537:6: ( (lv_isMandatory_8_0= 'mandatory' ) )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1538:1: (lv_isMandatory_8_0= 'mandatory' )
                    	            {
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1538:1: (lv_isMandatory_8_0= 'mandatory' )
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1539:3: lv_isMandatory_8_0= 'mandatory'
                    	            {
                    	            lv_isMandatory_8_0=(Token)match(input,46,FOLLOW_46_in_ruleRequiredPortCS2941); 

                    	                    newLeafNode(lv_isMandatory_8_0, grammarAccess.getRequiredPortCSAccess().getIsMandatoryMandatoryKeyword_3_1_0_2_0());
                    	                

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getRequiredPortCSRule());
                    	            	        }
                    	                   		setWithLastConsumed(current, "isMandatory", true, "mandatory");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1552:3: (otherlv_9= ',' )?
                    	    int alt33=2;
                    	    int LA33_0 = input.LA(1);

                    	    if ( (LA33_0==36) ) {
                    	        alt33=1;
                    	    }
                    	    switch (alt33) {
                    	        case 1 :
                    	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1552:5: otherlv_9= ','
                    	            {
                    	            otherlv_9=(Token)match(input,36,FOLLOW_36_in_ruleRequiredPortCS2968); 

                    	                	newLeafNode(otherlv_9, grammarAccess.getRequiredPortCSAccess().getCommaKeyword_3_1_1());
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1556:5: ( (lv_properties_10_0= rulePropertyCS ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==56) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1557:1: (lv_properties_10_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1557:1: (lv_properties_10_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1558:3: lv_properties_10_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequiredPortCSAccess().getPropertiesPropertyCSParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleRequiredPortCS2993);
                    	    lv_properties_10_0=rulePropertyCS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRequiredPortCSRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_10_0, 
                    	            		"PropertyCS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1582:1: entryRuleRequiredExecutionPlatformCS returns [EObject current=null] : iv_ruleRequiredExecutionPlatformCS= ruleRequiredExecutionPlatformCS EOF ;
    public final EObject entryRuleRequiredExecutionPlatformCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredExecutionPlatformCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1583:2: (iv_ruleRequiredExecutionPlatformCS= ruleRequiredExecutionPlatformCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1584:2: iv_ruleRequiredExecutionPlatformCS= ruleRequiredExecutionPlatformCS EOF
            {
             newCompositeNode(grammarAccess.getRequiredExecutionPlatformCSRule()); 
            pushFollow(FOLLOW_ruleRequiredExecutionPlatformCS_in_entryRuleRequiredExecutionPlatformCS3032);
            iv_ruleRequiredExecutionPlatformCS=ruleRequiredExecutionPlatformCS();

            state._fsp--;

             current =iv_ruleRequiredExecutionPlatformCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredExecutionPlatformCS3042); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1591:1: ruleRequiredExecutionPlatformCS returns [EObject current=null] : (otherlv_0= 'required' otherlv_1= 'host' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= 'demands' otherlv_5= ':' ( (lv_demands_6_0= rulePropertyCS ) )* )? otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? ) ;
    public final EObject ruleRequiredExecutionPlatformCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_demands_6_0 = null;

        EObject lv_properties_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1594:28: ( (otherlv_0= 'required' otherlv_1= 'host' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= 'demands' otherlv_5= ':' ( (lv_demands_6_0= rulePropertyCS ) )* )? otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1595:1: (otherlv_0= 'required' otherlv_1= 'host' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= 'demands' otherlv_5= ':' ( (lv_demands_6_0= rulePropertyCS ) )* )? otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1595:1: (otherlv_0= 'required' otherlv_1= 'host' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= 'demands' otherlv_5= ':' ( (lv_demands_6_0= rulePropertyCS ) )* )? otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1595:3: otherlv_0= 'required' otherlv_1= 'host' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= 'demands' otherlv_5= ':' ( (lv_demands_6_0= rulePropertyCS ) )* )? otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleRequiredExecutionPlatformCS3079); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiredExecutionPlatformCSAccess().getRequiredKeyword_0());
                
            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleRequiredExecutionPlatformCS3091); 

                	newLeafNode(otherlv_1, grammarAccess.getRequiredExecutionPlatformCSAccess().getHostKeyword_1());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1603:1: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1604:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1604:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1605:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getRequiredExecutionPlatformCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleRequiredExecutionPlatformCS3112);
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

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1621:2: (otherlv_3= ':' (otherlv_4= 'demands' otherlv_5= ':' ( (lv_demands_6_0= rulePropertyCS ) )* )? otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==18) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1621:4: otherlv_3= ':' (otherlv_4= 'demands' otherlv_5= ':' ( (lv_demands_6_0= rulePropertyCS ) )* )? otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )*
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleRequiredExecutionPlatformCS3125); 

                        	newLeafNode(otherlv_3, grammarAccess.getRequiredExecutionPlatformCSAccess().getColonKeyword_3_0());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1625:1: (otherlv_4= 'demands' otherlv_5= ':' ( (lv_demands_6_0= rulePropertyCS ) )* )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==48) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1625:3: otherlv_4= 'demands' otherlv_5= ':' ( (lv_demands_6_0= rulePropertyCS ) )*
                            {
                            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleRequiredExecutionPlatformCS3138); 

                                	newLeafNode(otherlv_4, grammarAccess.getRequiredExecutionPlatformCSAccess().getDemandsKeyword_3_1_0());
                                
                            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleRequiredExecutionPlatformCS3150); 

                                	newLeafNode(otherlv_5, grammarAccess.getRequiredExecutionPlatformCSAccess().getColonKeyword_3_1_1());
                                
                            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1633:1: ( (lv_demands_6_0= rulePropertyCS ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==56) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1634:1: (lv_demands_6_0= rulePropertyCS )
                            	    {
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1634:1: (lv_demands_6_0= rulePropertyCS )
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1635:3: lv_demands_6_0= rulePropertyCS
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getRequiredExecutionPlatformCSAccess().getDemandsPropertyCSParserRuleCall_3_1_2_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_rulePropertyCS_in_ruleRequiredExecutionPlatformCS3171);
                            	    lv_demands_6_0=rulePropertyCS();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getRequiredExecutionPlatformCSRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"demands",
                            	            		lv_demands_6_0, 
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

                    otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleRequiredExecutionPlatformCS3186); 

                        	newLeafNode(otherlv_7, grammarAccess.getRequiredExecutionPlatformCSAccess().getPropertiesKeyword_3_2());
                        
                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleRequiredExecutionPlatformCS3198); 

                        	newLeafNode(otherlv_8, grammarAccess.getRequiredExecutionPlatformCSAccess().getColonKeyword_3_3());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1659:1: ( (lv_properties_9_0= rulePropertyCS ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==56) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1660:1: (lv_properties_9_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1660:1: (lv_properties_9_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1661:3: lv_properties_9_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequiredExecutionPlatformCSAccess().getPropertiesPropertyCSParserRuleCall_3_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleRequiredExecutionPlatformCS3219);
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
                    	    break loop39;
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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1685:1: entryRuleProvidedExecutionPlatformCS returns [EObject current=null] : iv_ruleProvidedExecutionPlatformCS= ruleProvidedExecutionPlatformCS EOF ;
    public final EObject entryRuleProvidedExecutionPlatformCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedExecutionPlatformCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1686:2: (iv_ruleProvidedExecutionPlatformCS= ruleProvidedExecutionPlatformCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1687:2: iv_ruleProvidedExecutionPlatformCS= ruleProvidedExecutionPlatformCS EOF
            {
             newCompositeNode(grammarAccess.getProvidedExecutionPlatformCSRule()); 
            pushFollow(FOLLOW_ruleProvidedExecutionPlatformCS_in_entryRuleProvidedExecutionPlatformCS3258);
            iv_ruleProvidedExecutionPlatformCS=ruleProvidedExecutionPlatformCS();

            state._fsp--;

             current =iv_ruleProvidedExecutionPlatformCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedExecutionPlatformCS3268); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1694:1: ruleProvidedExecutionPlatformCS returns [EObject current=null] : (otherlv_0= 'provided' otherlv_1= 'host' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= 'offers' otherlv_5= ':' ( (lv_offers_6_0= rulePropertyCS ) )* )? otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? ) ;
    public final EObject ruleProvidedExecutionPlatformCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_offers_6_0 = null;

        EObject lv_properties_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1697:28: ( (otherlv_0= 'provided' otherlv_1= 'host' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= 'offers' otherlv_5= ':' ( (lv_offers_6_0= rulePropertyCS ) )* )? otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1698:1: (otherlv_0= 'provided' otherlv_1= 'host' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= 'offers' otherlv_5= ':' ( (lv_offers_6_0= rulePropertyCS ) )* )? otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1698:1: (otherlv_0= 'provided' otherlv_1= 'host' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= 'offers' otherlv_5= ':' ( (lv_offers_6_0= rulePropertyCS ) )* )? otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1698:3: otherlv_0= 'provided' otherlv_1= 'host' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' (otherlv_4= 'offers' otherlv_5= ':' ( (lv_offers_6_0= rulePropertyCS ) )* )? otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleProvidedExecutionPlatformCS3305); 

                	newLeafNode(otherlv_0, grammarAccess.getProvidedExecutionPlatformCSAccess().getProvidedKeyword_0());
                
            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleProvidedExecutionPlatformCS3317); 

                	newLeafNode(otherlv_1, grammarAccess.getProvidedExecutionPlatformCSAccess().getHostKeyword_1());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1706:1: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1707:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1707:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1708:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getProvidedExecutionPlatformCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleProvidedExecutionPlatformCS3338);
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

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1724:2: (otherlv_3= ':' (otherlv_4= 'offers' otherlv_5= ':' ( (lv_offers_6_0= rulePropertyCS ) )* )? otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==18) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1724:4: otherlv_3= ':' (otherlv_4= 'offers' otherlv_5= ':' ( (lv_offers_6_0= rulePropertyCS ) )* )? otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )*
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleProvidedExecutionPlatformCS3351); 

                        	newLeafNode(otherlv_3, grammarAccess.getProvidedExecutionPlatformCSAccess().getColonKeyword_3_0());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1728:1: (otherlv_4= 'offers' otherlv_5= ':' ( (lv_offers_6_0= rulePropertyCS ) )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==49) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1728:3: otherlv_4= 'offers' otherlv_5= ':' ( (lv_offers_6_0= rulePropertyCS ) )*
                            {
                            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleProvidedExecutionPlatformCS3364); 

                                	newLeafNode(otherlv_4, grammarAccess.getProvidedExecutionPlatformCSAccess().getOffersKeyword_3_1_0());
                                
                            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleProvidedExecutionPlatformCS3376); 

                                	newLeafNode(otherlv_5, grammarAccess.getProvidedExecutionPlatformCSAccess().getColonKeyword_3_1_1());
                                
                            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1736:1: ( (lv_offers_6_0= rulePropertyCS ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==56) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1737:1: (lv_offers_6_0= rulePropertyCS )
                            	    {
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1737:1: (lv_offers_6_0= rulePropertyCS )
                            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1738:3: lv_offers_6_0= rulePropertyCS
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getProvidedExecutionPlatformCSAccess().getOffersPropertyCSParserRuleCall_3_1_2_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_rulePropertyCS_in_ruleProvidedExecutionPlatformCS3397);
                            	    lv_offers_6_0=rulePropertyCS();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getProvidedExecutionPlatformCSRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"offers",
                            	            		lv_offers_6_0, 
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

                    otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleProvidedExecutionPlatformCS3412); 

                        	newLeafNode(otherlv_7, grammarAccess.getProvidedExecutionPlatformCSAccess().getPropertiesKeyword_3_2());
                        
                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleProvidedExecutionPlatformCS3424); 

                        	newLeafNode(otherlv_8, grammarAccess.getProvidedExecutionPlatformCSAccess().getColonKeyword_3_3());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1762:1: ( (lv_properties_9_0= rulePropertyCS ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==56) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1763:1: (lv_properties_9_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1763:1: (lv_properties_9_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1764:3: lv_properties_9_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProvidedExecutionPlatformCSAccess().getPropertiesPropertyCSParserRuleCall_3_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleProvidedExecutionPlatformCS3445);
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
                    	    break loop43;
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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1790:1: entryRuleRelationshipCS returns [EObject current=null] : iv_ruleRelationshipCS= ruleRelationshipCS EOF ;
    public final EObject entryRuleRelationshipCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1791:2: (iv_ruleRelationshipCS= ruleRelationshipCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1792:2: iv_ruleRelationshipCS= ruleRelationshipCS EOF
            {
             newCompositeNode(grammarAccess.getRelationshipCSRule()); 
            pushFollow(FOLLOW_ruleRelationshipCS_in_entryRuleRelationshipCS3486);
            iv_ruleRelationshipCS=ruleRelationshipCS();

            state._fsp--;

             current =iv_ruleRelationshipCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationshipCS3496); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1799:1: ruleRelationshipCS returns [EObject current=null] : (otherlv_0= 'communication' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleFqn ) ) otherlv_5= 'to' ( ( ruleFqn ) ) (otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? ( (lv_resources_10_0= ruleResourceCS ) )* otherlv_11= '}' ) ;
    public final EObject ruleRelationshipCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_properties_9_0 = null;

        EObject lv_resources_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1802:28: ( (otherlv_0= 'communication' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleFqn ) ) otherlv_5= 'to' ( ( ruleFqn ) ) (otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? ( (lv_resources_10_0= ruleResourceCS ) )* otherlv_11= '}' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1803:1: (otherlv_0= 'communication' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleFqn ) ) otherlv_5= 'to' ( ( ruleFqn ) ) (otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? ( (lv_resources_10_0= ruleResourceCS ) )* otherlv_11= '}' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1803:1: (otherlv_0= 'communication' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleFqn ) ) otherlv_5= 'to' ( ( ruleFqn ) ) (otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? ( (lv_resources_10_0= ruleResourceCS ) )* otherlv_11= '}' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1803:3: otherlv_0= 'communication' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleFqn ) ) otherlv_5= 'to' ( ( ruleFqn ) ) (otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )? ( (lv_resources_10_0= ruleResourceCS ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleRelationshipCS3533); 

                	newLeafNode(otherlv_0, grammarAccess.getRelationshipCSAccess().getCommunicationKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1807:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1808:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1808:1: (lv_name_1_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1809:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipCSAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleRelationshipCS3554);
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleRelationshipCS3566); 

                	newLeafNode(otherlv_2, grammarAccess.getRelationshipCSAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleRelationshipCS3578); 

                	newLeafNode(otherlv_3, grammarAccess.getRelationshipCSAccess().getFromKeyword_3());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1833:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1834:1: ( ruleFqn )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1834:1: ( ruleFqn )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1835:3: ruleFqn
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipCSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipCSAccess().getRequiredPortRequiredPortCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFqn_in_ruleRelationshipCS3601);
            ruleFqn();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleRelationshipCS3613); 

                	newLeafNode(otherlv_5, grammarAccess.getRelationshipCSAccess().getToKeyword_5());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1852:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1853:1: ( ruleFqn )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1853:1: ( ruleFqn )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1854:3: ruleFqn
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipCSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipCSAccess().getProvidedPortProvidedPortCrossReference_6_0()); 
            	    
            pushFollow(FOLLOW_ruleFqn_in_ruleRelationshipCS3636);
            ruleFqn();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1867:2: (otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==37) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1867:4: otherlv_7= 'properties' otherlv_8= ':' ( (lv_properties_9_0= rulePropertyCS ) )*
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleRelationshipCS3649); 

                        	newLeafNode(otherlv_7, grammarAccess.getRelationshipCSAccess().getPropertiesKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleRelationshipCS3661); 

                        	newLeafNode(otherlv_8, grammarAccess.getRelationshipCSAccess().getColonKeyword_7_1());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1875:1: ( (lv_properties_9_0= rulePropertyCS ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==56) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1876:1: (lv_properties_9_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1876:1: (lv_properties_9_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1877:3: lv_properties_9_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRelationshipCSAccess().getPropertiesPropertyCSParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleRelationshipCS3682);
                    	    lv_properties_9_0=rulePropertyCS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRelationshipCSRule());
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

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1893:5: ( (lv_resources_10_0= ruleResourceCS ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==58) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1894:1: (lv_resources_10_0= ruleResourceCS )
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1894:1: (lv_resources_10_0= ruleResourceCS )
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1895:3: lv_resources_10_0= ruleResourceCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelationshipCSAccess().getResourcesResourceCSParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceCS_in_ruleRelationshipCS3706);
            	    lv_resources_10_0=ruleResourceCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelationshipCSRule());
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
            	    break loop47;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleRelationshipCS3719); 

                	newLeafNode(otherlv_11, grammarAccess.getRelationshipCSAccess().getRightCurlyBracketKeyword_9());
                

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1923:1: entryRuleExternalComponentInstanceCS returns [EObject current=null] : iv_ruleExternalComponentInstanceCS= ruleExternalComponentInstanceCS EOF ;
    public final EObject entryRuleExternalComponentInstanceCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalComponentInstanceCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1924:2: (iv_ruleExternalComponentInstanceCS= ruleExternalComponentInstanceCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1925:2: iv_ruleExternalComponentInstanceCS= ruleExternalComponentInstanceCS EOF
            {
             newCompositeNode(grammarAccess.getExternalComponentInstanceCSRule()); 
            pushFollow(FOLLOW_ruleExternalComponentInstanceCS_in_entryRuleExternalComponentInstanceCS3755);
            iv_ruleExternalComponentInstanceCS=ruleExternalComponentInstanceCS();

            state._fsp--;

             current =iv_ruleExternalComponentInstanceCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalComponentInstanceCS3765); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1932:1: ruleExternalComponentInstanceCS returns [EObject current=null] : (otherlv_0= 'external' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= 'typed' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleExternalComponentInstanceCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1935:28: ( (otherlv_0= 'external' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= 'typed' ( (otherlv_4= RULE_ID ) ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1936:1: (otherlv_0= 'external' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= 'typed' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1936:1: (otherlv_0= 'external' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= 'typed' ( (otherlv_4= RULE_ID ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1936:3: otherlv_0= 'external' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= 'typed' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleExternalComponentInstanceCS3802); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalComponentInstanceCSAccess().getExternalKeyword_0());
                
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleExternalComponentInstanceCS3814); 

                	newLeafNode(otherlv_1, grammarAccess.getExternalComponentInstanceCSAccess().getComponentKeyword_1());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1944:1: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1945:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1945:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1946:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getExternalComponentInstanceCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleExternalComponentInstanceCS3835);
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

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleExternalComponentInstanceCS3847); 

                	newLeafNode(otherlv_3, grammarAccess.getExternalComponentInstanceCSAccess().getTypedKeyword_3());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1966:1: ( (otherlv_4= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1967:1: (otherlv_4= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1967:1: (otherlv_4= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1968:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalComponentInstanceCSRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalComponentInstanceCS3867); 

            		newLeafNode(otherlv_4, grammarAccess.getExternalComponentInstanceCSAccess().getTypeExternalComponentCrossReference_4_0()); 
            	

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1987:1: entryRuleInternalComponentInstanceCS returns [EObject current=null] : iv_ruleInternalComponentInstanceCS= ruleInternalComponentInstanceCS EOF ;
    public final EObject entryRuleInternalComponentInstanceCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalComponentInstanceCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1988:2: (iv_ruleInternalComponentInstanceCS= ruleInternalComponentInstanceCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1989:2: iv_ruleInternalComponentInstanceCS= ruleInternalComponentInstanceCS EOF
            {
             newCompositeNode(grammarAccess.getInternalComponentInstanceCSRule()); 
            pushFollow(FOLLOW_ruleInternalComponentInstanceCS_in_entryRuleInternalComponentInstanceCS3903);
            iv_ruleInternalComponentInstanceCS=ruleInternalComponentInstanceCS();

            state._fsp--;

             current =iv_ruleInternalComponentInstanceCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalComponentInstanceCS3913); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1996:1: ruleInternalComponentInstanceCS returns [EObject current=null] : (otherlv_0= 'internal' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= 'typed' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleInternalComponentInstanceCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:1999:28: ( (otherlv_0= 'internal' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= 'typed' ( (otherlv_4= RULE_ID ) ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2000:1: (otherlv_0= 'internal' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= 'typed' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2000:1: (otherlv_0= 'internal' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= 'typed' ( (otherlv_4= RULE_ID ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2000:3: otherlv_0= 'internal' otherlv_1= 'component' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= 'typed' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleInternalComponentInstanceCS3950); 

                	newLeafNode(otherlv_0, grammarAccess.getInternalComponentInstanceCSAccess().getInternalKeyword_0());
                
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleInternalComponentInstanceCS3962); 

                	newLeafNode(otherlv_1, grammarAccess.getInternalComponentInstanceCSAccess().getComponentKeyword_1());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2008:1: ( (lv_name_2_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2009:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2009:1: (lv_name_2_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2010:3: lv_name_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getInternalComponentInstanceCSAccess().getNameValidIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleInternalComponentInstanceCS3983);
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

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleInternalComponentInstanceCS3995); 

                	newLeafNode(otherlv_3, grammarAccess.getInternalComponentInstanceCSAccess().getTypedKeyword_3());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2030:1: ( (otherlv_4= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2031:1: (otherlv_4= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2031:1: (otherlv_4= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2032:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInternalComponentInstanceCSRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInternalComponentInstanceCS4015); 

            		newLeafNode(otherlv_4, grammarAccess.getInternalComponentInstanceCSAccess().getTypeInternalComponentCrossReference_4_0()); 
            	

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2051:1: entryRuleVMInstanceCS returns [EObject current=null] : iv_ruleVMInstanceCS= ruleVMInstanceCS EOF ;
    public final EObject entryRuleVMInstanceCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMInstanceCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2052:2: (iv_ruleVMInstanceCS= ruleVMInstanceCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2053:2: iv_ruleVMInstanceCS= ruleVMInstanceCS EOF
            {
             newCompositeNode(grammarAccess.getVMInstanceCSRule()); 
            pushFollow(FOLLOW_ruleVMInstanceCS_in_entryRuleVMInstanceCS4051);
            iv_ruleVMInstanceCS=ruleVMInstanceCS();

            state._fsp--;

             current =iv_ruleVMInstanceCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVMInstanceCS4061); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2060:1: ruleVMInstanceCS returns [EObject current=null] : (otherlv_0= 'vm' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'typed' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleVMInstanceCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2063:28: ( (otherlv_0= 'vm' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'typed' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2064:1: (otherlv_0= 'vm' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'typed' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2064:1: (otherlv_0= 'vm' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'typed' ( (otherlv_3= RULE_ID ) ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2064:3: otherlv_0= 'vm' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'typed' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleVMInstanceCS4098); 

                	newLeafNode(otherlv_0, grammarAccess.getVMInstanceCSAccess().getVmKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2068:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2069:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2069:1: (lv_name_1_0= ruleValidID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2070:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getVMInstanceCSAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleVMInstanceCS4119);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVMInstanceCSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleVMInstanceCS4131); 

                	newLeafNode(otherlv_2, grammarAccess.getVMInstanceCSAccess().getTypedKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2090:1: ( (otherlv_3= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2091:1: (otherlv_3= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2091:1: (otherlv_3= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2092:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVMInstanceCSRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVMInstanceCS4151); 

            		newLeafNode(otherlv_3, grammarAccess.getVMInstanceCSAccess().getTypeVMCrossReference_3_0()); 
            	

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2111:1: entryRuleRelationshipInstanceCS returns [EObject current=null] : iv_ruleRelationshipInstanceCS= ruleRelationshipInstanceCS EOF ;
    public final EObject entryRuleRelationshipInstanceCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipInstanceCS = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2112:2: (iv_ruleRelationshipInstanceCS= ruleRelationshipInstanceCS EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2113:2: iv_ruleRelationshipInstanceCS= ruleRelationshipInstanceCS EOF
            {
             newCompositeNode(grammarAccess.getRelationshipInstanceCSRule()); 
            pushFollow(FOLLOW_ruleRelationshipInstanceCS_in_entryRuleRelationshipInstanceCS4187);
            iv_ruleRelationshipInstanceCS=ruleRelationshipInstanceCS();

            state._fsp--;

             current =iv_ruleRelationshipInstanceCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationshipInstanceCS4197); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2120:1: ruleRelationshipInstanceCS returns [EObject current=null] : (otherlv_0= 'connect' ( ( ruleFqn ) ) otherlv_2= 'to' ( ( ruleFqn ) ) otherlv_4= 'typed' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'named' ( (lv_name_7_0= ruleValidID ) ) )? ) ;
    public final EObject ruleRelationshipInstanceCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2123:28: ( (otherlv_0= 'connect' ( ( ruleFqn ) ) otherlv_2= 'to' ( ( ruleFqn ) ) otherlv_4= 'typed' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'named' ( (lv_name_7_0= ruleValidID ) ) )? ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2124:1: (otherlv_0= 'connect' ( ( ruleFqn ) ) otherlv_2= 'to' ( ( ruleFqn ) ) otherlv_4= 'typed' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'named' ( (lv_name_7_0= ruleValidID ) ) )? )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2124:1: (otherlv_0= 'connect' ( ( ruleFqn ) ) otherlv_2= 'to' ( ( ruleFqn ) ) otherlv_4= 'typed' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'named' ( (lv_name_7_0= ruleValidID ) ) )? )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2124:3: otherlv_0= 'connect' ( ( ruleFqn ) ) otherlv_2= 'to' ( ( ruleFqn ) ) otherlv_4= 'typed' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'named' ( (lv_name_7_0= ruleValidID ) ) )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleRelationshipInstanceCS4234); 

                	newLeafNode(otherlv_0, grammarAccess.getRelationshipInstanceCSAccess().getConnectKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2128:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2129:1: ( ruleFqn )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2129:1: ( ruleFqn )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2130:3: ruleFqn
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipInstanceCSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipInstanceCSAccess().getRequiredPortInstanceRequiredPortInstanceCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFqn_in_ruleRelationshipInstanceCS4257);
            ruleFqn();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleRelationshipInstanceCS4269); 

                	newLeafNode(otherlv_2, grammarAccess.getRelationshipInstanceCSAccess().getToKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2147:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2148:1: ( ruleFqn )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2148:1: ( ruleFqn )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2149:3: ruleFqn
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipInstanceCSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipInstanceCSAccess().getProvidedPortInstanceProvidedPortInstanceCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFqn_in_ruleRelationshipInstanceCS4292);
            ruleFqn();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleRelationshipInstanceCS4304); 

                	newLeafNode(otherlv_4, grammarAccess.getRelationshipInstanceCSAccess().getTypedKeyword_4());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2166:1: ( (otherlv_5= RULE_ID ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2167:1: (otherlv_5= RULE_ID )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2167:1: (otherlv_5= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2168:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipInstanceCSRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationshipInstanceCS4324); 

            		newLeafNode(otherlv_5, grammarAccess.getRelationshipInstanceCSAccess().getTypeRelationshipCrossReference_5_0()); 
            	

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2179:2: (otherlv_6= 'named' ( (lv_name_7_0= ruleValidID ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2179:4: otherlv_6= 'named' ( (lv_name_7_0= ruleValidID ) )
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleRelationshipInstanceCS4337); 

                        	newLeafNode(otherlv_6, grammarAccess.getRelationshipInstanceCSAccess().getNamedKeyword_6_0());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2183:1: ( (lv_name_7_0= ruleValidID ) )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2184:1: (lv_name_7_0= ruleValidID )
                    {
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2184:1: (lv_name_7_0= ruleValidID )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2185:3: lv_name_7_0= ruleValidID
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationshipInstanceCSAccess().getNameValidIDParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValidID_in_ruleRelationshipInstanceCS4358);
                    lv_name_7_0=ruleValidID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelationshipInstanceCSRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_7_0, 
                            		"ValidID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
            pushFollow(FOLLOW_ruleExecuteInstanceCS_in_entryRuleExecuteInstanceCS4396);
            iv_ruleExecuteInstanceCS=ruleExecuteInstanceCS();

            state._fsp--;

             current =iv_ruleExecuteInstanceCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecuteInstanceCS4406); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2218:1: ruleExecuteInstanceCS returns [EObject current=null] : (otherlv_0= 'host' ( ( ruleFqn ) ) otherlv_2= 'on' ( ( ruleFqn ) ) (otherlv_4= 'named' ( (lv_name_5_0= ruleValidID ) ) )? ) ;
    public final EObject ruleExecuteInstanceCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2221:28: ( (otherlv_0= 'host' ( ( ruleFqn ) ) otherlv_2= 'on' ( ( ruleFqn ) ) (otherlv_4= 'named' ( (lv_name_5_0= ruleValidID ) ) )? ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2222:1: (otherlv_0= 'host' ( ( ruleFqn ) ) otherlv_2= 'on' ( ( ruleFqn ) ) (otherlv_4= 'named' ( (lv_name_5_0= ruleValidID ) ) )? )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2222:1: (otherlv_0= 'host' ( ( ruleFqn ) ) otherlv_2= 'on' ( ( ruleFqn ) ) (otherlv_4= 'named' ( (lv_name_5_0= ruleValidID ) ) )? )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2222:3: otherlv_0= 'host' ( ( ruleFqn ) ) otherlv_2= 'on' ( ( ruleFqn ) ) (otherlv_4= 'named' ( (lv_name_5_0= ruleValidID ) ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleExecuteInstanceCS4443); 

                	newLeafNode(otherlv_0, grammarAccess.getExecuteInstanceCSAccess().getHostKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2226:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2227:1: ( ruleFqn )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2227:1: ( ruleFqn )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2228:3: ruleFqn
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExecuteInstanceCSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getExecuteInstanceCSAccess().getRequiredExecutionPlatformInstanceRequiredExecutionPlatformInstanceCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFqn_in_ruleExecuteInstanceCS4466);
            ruleFqn();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleExecuteInstanceCS4478); 

                	newLeafNode(otherlv_2, grammarAccess.getExecuteInstanceCSAccess().getOnKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2245:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2246:1: ( ruleFqn )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2246:1: ( ruleFqn )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2247:3: ruleFqn
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExecuteInstanceCSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getExecuteInstanceCSAccess().getProvidedExecutionPlatformInstanceProvidedExecutionPlatformInstanceCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFqn_in_ruleExecuteInstanceCS4501);
            ruleFqn();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2260:2: (otherlv_4= 'named' ( (lv_name_5_0= ruleValidID ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==54) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2260:4: otherlv_4= 'named' ( (lv_name_5_0= ruleValidID ) )
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleExecuteInstanceCS4514); 

                        	newLeafNode(otherlv_4, grammarAccess.getExecuteInstanceCSAccess().getNamedKeyword_4_0());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2264:1: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2265:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2265:1: (lv_name_5_0= ruleValidID )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2266:3: lv_name_5_0= ruleValidID
                    {
                     
                    	        newCompositeNode(grammarAccess.getExecuteInstanceCSAccess().getNameValidIDParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValidID_in_ruleExecuteInstanceCS4535);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExecuteInstanceCSRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_5_0, 
                            		"ValidID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
            pushFollow(FOLLOW_rulePropertyCS_in_entryRulePropertyCS4573);
            iv_rulePropertyCS=rulePropertyCS();

            state._fsp--;

             current =iv_rulePropertyCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyCS4583); 

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
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_rulePropertyCS4620); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyCSAccess().getLeftParenthesisKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2307:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2308:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2308:1: (lv_name_1_0= RULE_STRING )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2309:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyCS4637); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulePropertyCS4654); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyCSAccess().getColonKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2329:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2330:1: (lv_value_3_0= RULE_STRING )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2330:1: (lv_value_3_0= RULE_STRING )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2331:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyCS4671); 

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

            otherlv_4=(Token)match(input,57,FOLLOW_57_in_rulePropertyCS4688); 

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
            pushFollow(FOLLOW_ruleResourceCS_in_entryRuleResourceCS4724);
            iv_ruleResourceCS=ruleResourceCS();

            state._fsp--;

             current =iv_ruleResourceCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceCS4734); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2368:1: ruleResourceCS returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= ruleValidID ) )? otherlv_2= '{' ( ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) ) (otherlv_23= ',' )? )* (otherlv_24= 'properties' otherlv_25= ':' ( (lv_properties_26_0= rulePropertyCS ) )* )? otherlv_27= '}' ) ;
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
        Token otherlv_25=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_properties_26_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2371:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= ruleValidID ) )? otherlv_2= '{' ( ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) ) (otherlv_23= ',' )? )* (otherlv_24= 'properties' otherlv_25= ':' ( (lv_properties_26_0= rulePropertyCS ) )* )? otherlv_27= '}' ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2372:1: (otherlv_0= 'resource' ( (lv_name_1_0= ruleValidID ) )? otherlv_2= '{' ( ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) ) (otherlv_23= ',' )? )* (otherlv_24= 'properties' otherlv_25= ':' ( (lv_properties_26_0= rulePropertyCS ) )* )? otherlv_27= '}' )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2372:1: (otherlv_0= 'resource' ( (lv_name_1_0= ruleValidID ) )? otherlv_2= '{' ( ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) ) (otherlv_23= ',' )? )* (otherlv_24= 'properties' otherlv_25= ':' ( (lv_properties_26_0= rulePropertyCS ) )* )? otherlv_27= '}' )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2372:3: otherlv_0= 'resource' ( (lv_name_1_0= ruleValidID ) )? otherlv_2= '{' ( ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) ) (otherlv_23= ',' )? )* (otherlv_24= 'properties' otherlv_25= ':' ( (lv_properties_26_0= rulePropertyCS ) )* )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleResourceCS4771); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceCSAccess().getResourceKeyword_0());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2376:1: ( (lv_name_1_0= ruleValidID ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2377:1: (lv_name_1_0= ruleValidID )
                    {
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2377:1: (lv_name_1_0= ruleValidID )
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2378:3: lv_name_1_0= ruleValidID
                    {
                     
                    	        newCompositeNode(grammarAccess.getResourceCSAccess().getNameValidIDParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValidID_in_ruleResourceCS4792);
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
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleResourceCS4805); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceCSAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2398:1: ( ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) ) (otherlv_23= ',' )? )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=59 && LA53_0<=66)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2398:2: ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) ) (otherlv_23= ',' )?
            	    {
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2398:2: ( (otherlv_3= 'download' otherlv_4= ':' ( (lv_downloadCommand_5_0= RULE_STRING ) ) ) | (otherlv_6= 'upload' otherlv_7= ':' ( (lv_uploadCommand_8_0= RULE_STRING ) ) ) | (otherlv_9= 'install' otherlv_10= ':' ( (lv_installCommand_11_0= RULE_STRING ) ) ) | (otherlv_12= 'configure' otherlv_13= ':' ( (lv_configureCommand_14_0= RULE_STRING ) ) ) | (otherlv_15= 'start' otherlv_16= ':' ( (lv_startCommand_17_0= RULE_STRING ) ) ) | (otherlv_18= 'stop' otherlv_19= ':' ( (lv_stopCommand_20_0= RULE_STRING ) ) ) | ( (lv_requireCredentials_21_0= 'requireCredentials' ) ) | ( (lv_executeLocally_22_0= 'executeLocally' ) ) )
            	    int alt51=8;
            	    switch ( input.LA(1) ) {
            	    case 59:
            	        {
            	        alt51=1;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt51=2;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt51=3;
            	        }
            	        break;
            	    case 62:
            	        {
            	        alt51=4;
            	        }
            	        break;
            	    case 63:
            	        {
            	        alt51=5;
            	        }
            	        break;
            	    case 64:
            	        {
            	        alt51=6;
            	        }
            	        break;
            	    case 65:
            	        {
            	        alt51=7;
            	        }
            	        break;
            	    case 66:
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
            	            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleResourceCS4820); 

            	                	newLeafNode(otherlv_3, grammarAccess.getResourceCSAccess().getDownloadKeyword_3_0_0_0());
            	                
            	            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleResourceCS4832); 

            	                	newLeafNode(otherlv_4, grammarAccess.getResourceCSAccess().getColonKeyword_3_0_0_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2406:1: ( (lv_downloadCommand_5_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2407:1: (lv_downloadCommand_5_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2407:1: (lv_downloadCommand_5_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2408:3: lv_downloadCommand_5_0= RULE_STRING
            	            {
            	            lv_downloadCommand_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceCS4849); 

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
            	            otherlv_6=(Token)match(input,60,FOLLOW_60_in_ruleResourceCS4874); 

            	                	newLeafNode(otherlv_6, grammarAccess.getResourceCSAccess().getUploadKeyword_3_0_1_0());
            	                
            	            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleResourceCS4886); 

            	                	newLeafNode(otherlv_7, grammarAccess.getResourceCSAccess().getColonKeyword_3_0_1_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2433:1: ( (lv_uploadCommand_8_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2434:1: (lv_uploadCommand_8_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2434:1: (lv_uploadCommand_8_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2435:3: lv_uploadCommand_8_0= RULE_STRING
            	            {
            	            lv_uploadCommand_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceCS4903); 

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
            	            otherlv_9=(Token)match(input,61,FOLLOW_61_in_ruleResourceCS4928); 

            	                	newLeafNode(otherlv_9, grammarAccess.getResourceCSAccess().getInstallKeyword_3_0_2_0());
            	                
            	            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleResourceCS4940); 

            	                	newLeafNode(otherlv_10, grammarAccess.getResourceCSAccess().getColonKeyword_3_0_2_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2460:1: ( (lv_installCommand_11_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2461:1: (lv_installCommand_11_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2461:1: (lv_installCommand_11_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2462:3: lv_installCommand_11_0= RULE_STRING
            	            {
            	            lv_installCommand_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceCS4957); 

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
            	            otherlv_12=(Token)match(input,62,FOLLOW_62_in_ruleResourceCS4982); 

            	                	newLeafNode(otherlv_12, grammarAccess.getResourceCSAccess().getConfigureKeyword_3_0_3_0());
            	                
            	            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleResourceCS4994); 

            	                	newLeafNode(otherlv_13, grammarAccess.getResourceCSAccess().getColonKeyword_3_0_3_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2487:1: ( (lv_configureCommand_14_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2488:1: (lv_configureCommand_14_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2488:1: (lv_configureCommand_14_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2489:3: lv_configureCommand_14_0= RULE_STRING
            	            {
            	            lv_configureCommand_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceCS5011); 

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
            	            otherlv_15=(Token)match(input,63,FOLLOW_63_in_ruleResourceCS5036); 

            	                	newLeafNode(otherlv_15, grammarAccess.getResourceCSAccess().getStartKeyword_3_0_4_0());
            	                
            	            otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleResourceCS5048); 

            	                	newLeafNode(otherlv_16, grammarAccess.getResourceCSAccess().getColonKeyword_3_0_4_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2514:1: ( (lv_startCommand_17_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2515:1: (lv_startCommand_17_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2515:1: (lv_startCommand_17_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2516:3: lv_startCommand_17_0= RULE_STRING
            	            {
            	            lv_startCommand_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceCS5065); 

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
            	            otherlv_18=(Token)match(input,64,FOLLOW_64_in_ruleResourceCS5090); 

            	                	newLeafNode(otherlv_18, grammarAccess.getResourceCSAccess().getStopKeyword_3_0_5_0());
            	                
            	            otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleResourceCS5102); 

            	                	newLeafNode(otherlv_19, grammarAccess.getResourceCSAccess().getColonKeyword_3_0_5_1());
            	                
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2541:1: ( (lv_stopCommand_20_0= RULE_STRING ) )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2542:1: (lv_stopCommand_20_0= RULE_STRING )
            	            {
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2542:1: (lv_stopCommand_20_0= RULE_STRING )
            	            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2543:3: lv_stopCommand_20_0= RULE_STRING
            	            {
            	            lv_stopCommand_20_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceCS5119); 

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
            	            lv_requireCredentials_21_0=(Token)match(input,65,FOLLOW_65_in_ruleResourceCS5149); 

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
            	            lv_executeLocally_22_0=(Token)match(input,66,FOLLOW_66_in_ruleResourceCS5186); 

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
            	            otherlv_23=(Token)match(input,36,FOLLOW_36_in_ruleResourceCS5213); 

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

            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2595:5: (otherlv_24= 'properties' otherlv_25= ':' ( (lv_properties_26_0= rulePropertyCS ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==37) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2595:7: otherlv_24= 'properties' otherlv_25= ':' ( (lv_properties_26_0= rulePropertyCS ) )*
                    {
                    otherlv_24=(Token)match(input,37,FOLLOW_37_in_ruleResourceCS5230); 

                        	newLeafNode(otherlv_24, grammarAccess.getResourceCSAccess().getPropertiesKeyword_4_0());
                        
                    otherlv_25=(Token)match(input,18,FOLLOW_18_in_ruleResourceCS5242); 

                        	newLeafNode(otherlv_25, grammarAccess.getResourceCSAccess().getColonKeyword_4_1());
                        
                    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2603:1: ( (lv_properties_26_0= rulePropertyCS ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==56) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2604:1: (lv_properties_26_0= rulePropertyCS )
                    	    {
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2604:1: (lv_properties_26_0= rulePropertyCS )
                    	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2605:3: lv_properties_26_0= rulePropertyCS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getResourceCSAccess().getPropertiesPropertyCSParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyCS_in_ruleResourceCS5263);
                    	    lv_properties_26_0=rulePropertyCS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getResourceCSRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_26_0, 
                    	            		"PropertyCS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleResourceCS5278); 

                	newLeafNode(otherlv_27, grammarAccess.getResourceCSAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2633:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2634:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2635:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID5315);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID5326); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2642:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2645:28: (this_ID_0= RULE_ID )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2646:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID5365); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2661:1: entryRuleFqn returns [String current=null] : iv_ruleFqn= ruleFqn EOF ;
    public final String entryRuleFqn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFqn = null;


        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2662:2: (iv_ruleFqn= ruleFqn EOF )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2663:2: iv_ruleFqn= ruleFqn EOF
            {
             newCompositeNode(grammarAccess.getFqnRule()); 
            pushFollow(FOLLOW_ruleFqn_in_entryRuleFqn5410);
            iv_ruleFqn=ruleFqn();

            state._fsp--;

             current =iv_ruleFqn.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqn5421); 

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
    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2670:1: ruleFqn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleFqn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2673:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2674:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2674:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2675:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
             
                    newCompositeNode(grammarAccess.getFqnAccess().getValidIDParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleValidID_in_ruleFqn5468);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            		current.merge(this_ValidID_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2685:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==67) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.cloudml.dsl/src-gen/org/cloudml/dsl/parser/antlr/internal/InternalCloudML.g:2686:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,67,FOLLOW_67_in_ruleFqn5487); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFqnAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFqnAccess().getValidIDParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleValidID_in_ruleFqn5509);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    		current.merge(this_ValidID_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop56;
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
    public static final BitSet FOLLOW_11_in_ruleCloudMLRoot122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCloudMLRoot134 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleCloudMLRoot155 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ruleProviderCS_in_ruleCloudMLRoot176 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleCloudMLRoot189 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCloudMLRoot201 = new BitSet(new long[]{0x0000124000088000L});
    public static final BitSet FOLLOW_ruleVMCS_in_ruleCloudMLRoot223 = new BitSet(new long[]{0x0000124000088000L});
    public static final BitSet FOLLOW_ruleInternalComponentCS_in_ruleCloudMLRoot250 = new BitSet(new long[]{0x0000124000088000L});
    public static final BitSet FOLLOW_ruleExternalComponentCS_in_ruleCloudMLRoot277 = new BitSet(new long[]{0x0000124000088000L});
    public static final BitSet FOLLOW_ruleRelationshipCS_in_ruleCloudMLRoot300 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_15_in_ruleCloudMLRoot313 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCloudMLRoot325 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCloudMLRoot337 = new BitSet(new long[]{0x0020904000088000L});
    public static final BitSet FOLLOW_ruleInternalComponentInstanceCS_in_ruleCloudMLRoot359 = new BitSet(new long[]{0x0020904000088000L});
    public static final BitSet FOLLOW_ruleExternalComponentInstanceCS_in_ruleCloudMLRoot386 = new BitSet(new long[]{0x0020904000088000L});
    public static final BitSet FOLLOW_ruleVMInstanceCS_in_ruleCloudMLRoot413 = new BitSet(new long[]{0x0020904000088000L});
    public static final BitSet FOLLOW_ruleRelationshipInstanceCS_in_ruleCloudMLRoot436 = new BitSet(new long[]{0x0020800000008000L});
    public static final BitSet FOLLOW_ruleExecuteInstanceCS_in_ruleCloudMLRoot458 = new BitSet(new long[]{0x0000800000008000L});
    public static final BitSet FOLLOW_15_in_ruleCloudMLRoot471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderCS_in_entryRuleProviderCS507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProviderCS517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleProviderCS554 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleProviderCS575 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProviderCS587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProviderCS604 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleProviderCS630 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleVMCS_in_entryRuleVMCS667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVMCS677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVMCS714 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleVMCS735 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVMCS747 = new BitSet(new long[]{0x0000012FFBF28000L});
    public static final BitSet FOLLOW_17_in_ruleVMCS762 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS774 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVMCS794 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_20_in_ruleVMCS814 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS843 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_21_in_ruleVMCS868 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS897 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_22_in_ruleVMCS927 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_23_in_ruleVMCS959 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS988 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_24_in_ruleVMCS1013 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS1025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1042 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_25_in_ruleVMCS1067 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS1079 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVMCS1096 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleVMCS1113 = new BitSet(new long[]{0x0000013FFBF28040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVMCS1130 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_27_in_ruleVMCS1156 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS1168 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVMCS1185 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleVMCS1202 = new BitSet(new long[]{0x0000013FFBF28040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVMCS1219 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_28_in_ruleVMCS1245 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS1257 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVMCS1274 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleVMCS1291 = new BitSet(new long[]{0x0000013FFBF28040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVMCS1308 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_29_in_ruleVMCS1334 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS1346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1363 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_30_in_ruleVMCS1388 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS1400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1417 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_31_in_ruleVMCS1442 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS1454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1471 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_32_in_ruleVMCS1496 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS1508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1525 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_33_in_ruleVMCS1550 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS1562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1579 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_34_in_ruleVMCS1604 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS1616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1633 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_35_in_ruleVMCS1658 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS1670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVMCS1687 = new BitSet(new long[]{0x0000013FFBF28000L});
    public static final BitSet FOLLOW_36_in_ruleVMCS1707 = new BitSet(new long[]{0x0000012FFBF28000L});
    public static final BitSet FOLLOW_ruleProvidedPortCS_in_ruleVMCS1732 = new BitSet(new long[]{0x0000012000008000L});
    public static final BitSet FOLLOW_ruleProvidedExecutionPlatformCS_in_ruleVMCS1754 = new BitSet(new long[]{0x0000012000008000L});
    public static final BitSet FOLLOW_37_in_ruleVMCS1768 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVMCS1780 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleVMCS1801 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVMCS1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalComponentCS_in_entryRuleExternalComponentCS1854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalComponentCS1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleExternalComponentCS1901 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleExternalComponentCS1913 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleExternalComponentCS1934 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExternalComponentCS1946 = new BitSet(new long[]{0x0400012000028000L});
    public static final BitSet FOLLOW_17_in_ruleExternalComponentCS1959 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleExternalComponentCS1971 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalComponentCS1991 = new BitSet(new long[]{0x0400012000008000L});
    public static final BitSet FOLLOW_ruleProvidedPortCS_in_ruleExternalComponentCS2015 = new BitSet(new long[]{0x0400012000008000L});
    public static final BitSet FOLLOW_ruleProvidedExecutionPlatformCS_in_ruleExternalComponentCS2042 = new BitSet(new long[]{0x0400012000008000L});
    public static final BitSet FOLLOW_37_in_ruleExternalComponentCS2057 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleExternalComponentCS2069 = new BitSet(new long[]{0x0500000000008000L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleExternalComponentCS2090 = new BitSet(new long[]{0x0500000000008000L});
    public static final BitSet FOLLOW_ruleResourceCS_in_ruleExternalComponentCS2114 = new BitSet(new long[]{0x0400000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExternalComponentCS2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedPortCS_in_entryRuleProvidedPortCS2163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedPortCS2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleProvidedPortCS2210 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleProvidedPortCS2222 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleProvidedPortCS2243 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleProvidedPortCS2256 = new BitSet(new long[]{0x01000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleProvidedPortCS2276 = new BitSet(new long[]{0x01000C1000000002L});
    public static final BitSet FOLLOW_43_in_ruleProvidedPortCS2308 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProvidedPortCS2320 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProvidedPortCS2337 = new BitSet(new long[]{0x01000C1000000002L});
    public static final BitSet FOLLOW_36_in_ruleProvidedPortCS2357 = new BitSet(new long[]{0x01000C0000000002L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleProvidedPortCS2382 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleInternalComponentCS_in_entryRuleInternalComponentCS2421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalComponentCS2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleInternalComponentCS2468 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleInternalComponentCS2480 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleInternalComponentCS2501 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInternalComponentCS2513 = new BitSet(new long[]{0x0400212000008000L});
    public static final BitSet FOLLOW_ruleProvidedPortCS_in_ruleInternalComponentCS2535 = new BitSet(new long[]{0x0400212000008000L});
    public static final BitSet FOLLOW_ruleRequiredPortCS_in_ruleInternalComponentCS2562 = new BitSet(new long[]{0x0400212000008000L});
    public static final BitSet FOLLOW_ruleRequiredExecutionPlatformCS_in_ruleInternalComponentCS2589 = new BitSet(new long[]{0x0400212000008000L});
    public static final BitSet FOLLOW_ruleProvidedExecutionPlatformCS_in_ruleInternalComponentCS2616 = new BitSet(new long[]{0x0400212000008000L});
    public static final BitSet FOLLOW_37_in_ruleInternalComponentCS2631 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInternalComponentCS2643 = new BitSet(new long[]{0x0500000000008000L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleInternalComponentCS2664 = new BitSet(new long[]{0x0500000000008000L});
    public static final BitSet FOLLOW_ruleResourceCS_in_ruleInternalComponentCS2688 = new BitSet(new long[]{0x0400000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInternalComponentCS2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredPortCS_in_entryRuleRequiredPortCS2737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredPortCS2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRequiredPortCS2784 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleRequiredPortCS2796 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleRequiredPortCS2817 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleRequiredPortCS2830 = new BitSet(new long[]{0x01004C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleRequiredPortCS2850 = new BitSet(new long[]{0x01004C1000000002L});
    public static final BitSet FOLLOW_43_in_ruleRequiredPortCS2882 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRequiredPortCS2894 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRequiredPortCS2911 = new BitSet(new long[]{0x01004C1000000002L});
    public static final BitSet FOLLOW_46_in_ruleRequiredPortCS2941 = new BitSet(new long[]{0x01004C1000000002L});
    public static final BitSet FOLLOW_36_in_ruleRequiredPortCS2968 = new BitSet(new long[]{0x01004C0000000002L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleRequiredPortCS2993 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleRequiredExecutionPlatformCS_in_entryRuleRequiredExecutionPlatformCS3032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredExecutionPlatformCS3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRequiredExecutionPlatformCS3079 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRequiredExecutionPlatformCS3091 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleRequiredExecutionPlatformCS3112 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleRequiredExecutionPlatformCS3125 = new BitSet(new long[]{0x0001002000000000L});
    public static final BitSet FOLLOW_48_in_ruleRequiredExecutionPlatformCS3138 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRequiredExecutionPlatformCS3150 = new BitSet(new long[]{0x0100002000000000L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleRequiredExecutionPlatformCS3171 = new BitSet(new long[]{0x0100002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRequiredExecutionPlatformCS3186 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRequiredExecutionPlatformCS3198 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleRequiredExecutionPlatformCS3219 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleProvidedExecutionPlatformCS_in_entryRuleProvidedExecutionPlatformCS3258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedExecutionPlatformCS3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleProvidedExecutionPlatformCS3305 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleProvidedExecutionPlatformCS3317 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleProvidedExecutionPlatformCS3338 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleProvidedExecutionPlatformCS3351 = new BitSet(new long[]{0x0002002000000000L});
    public static final BitSet FOLLOW_49_in_ruleProvidedExecutionPlatformCS3364 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProvidedExecutionPlatformCS3376 = new BitSet(new long[]{0x0100002000000000L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleProvidedExecutionPlatformCS3397 = new BitSet(new long[]{0x0100002000000000L});
    public static final BitSet FOLLOW_37_in_ruleProvidedExecutionPlatformCS3412 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProvidedExecutionPlatformCS3424 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleProvidedExecutionPlatformCS3445 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipCS_in_entryRuleRelationshipCS3486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipCS3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRelationshipCS3533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleRelationshipCS3554 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRelationshipCS3566 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleRelationshipCS3578 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleRelationshipCS3601 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleRelationshipCS3613 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleRelationshipCS3636 = new BitSet(new long[]{0x0400002000008000L});
    public static final BitSet FOLLOW_37_in_ruleRelationshipCS3649 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRelationshipCS3661 = new BitSet(new long[]{0x0500000000008000L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleRelationshipCS3682 = new BitSet(new long[]{0x0500000000008000L});
    public static final BitSet FOLLOW_ruleResourceCS_in_ruleRelationshipCS3706 = new BitSet(new long[]{0x0400000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRelationshipCS3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalComponentInstanceCS_in_entryRuleExternalComponentInstanceCS3755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalComponentInstanceCS3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleExternalComponentInstanceCS3802 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleExternalComponentInstanceCS3814 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleExternalComponentInstanceCS3835 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleExternalComponentInstanceCS3847 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalComponentInstanceCS3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalComponentInstanceCS_in_entryRuleInternalComponentInstanceCS3903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalComponentInstanceCS3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleInternalComponentInstanceCS3950 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleInternalComponentInstanceCS3962 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleInternalComponentInstanceCS3983 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleInternalComponentInstanceCS3995 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInternalComponentInstanceCS4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVMInstanceCS_in_entryRuleVMInstanceCS4051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVMInstanceCS4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVMInstanceCS4098 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleVMInstanceCS4119 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleVMInstanceCS4131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVMInstanceCS4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipInstanceCS_in_entryRuleRelationshipInstanceCS4187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipInstanceCS4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleRelationshipInstanceCS4234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleRelationshipInstanceCS4257 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleRelationshipInstanceCS4269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleRelationshipInstanceCS4292 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleRelationshipInstanceCS4304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationshipInstanceCS4324 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleRelationshipInstanceCS4337 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleRelationshipInstanceCS4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteInstanceCS_in_entryRuleExecuteInstanceCS4396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecuteInstanceCS4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleExecuteInstanceCS4443 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleExecuteInstanceCS4466 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleExecuteInstanceCS4478 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFqn_in_ruleExecuteInstanceCS4501 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleExecuteInstanceCS4514 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleExecuteInstanceCS4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyCS_in_entryRulePropertyCS4573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyCS4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePropertyCS4620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyCS4637 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePropertyCS4654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyCS4671 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePropertyCS4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceCS_in_entryRuleResourceCS4724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceCS4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleResourceCS4771 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleResourceCS4792 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleResourceCS4805 = new BitSet(new long[]{0xF800002000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_59_in_ruleResourceCS4820 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResourceCS4832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceCS4849 = new BitSet(new long[]{0xF800003000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_60_in_ruleResourceCS4874 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResourceCS4886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceCS4903 = new BitSet(new long[]{0xF800003000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_61_in_ruleResourceCS4928 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResourceCS4940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceCS4957 = new BitSet(new long[]{0xF800003000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_62_in_ruleResourceCS4982 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResourceCS4994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceCS5011 = new BitSet(new long[]{0xF800003000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_63_in_ruleResourceCS5036 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResourceCS5048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceCS5065 = new BitSet(new long[]{0xF800003000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_64_in_ruleResourceCS5090 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResourceCS5102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceCS5119 = new BitSet(new long[]{0xF800003000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_65_in_ruleResourceCS5149 = new BitSet(new long[]{0xF800003000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_66_in_ruleResourceCS5186 = new BitSet(new long[]{0xF800003000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_36_in_ruleResourceCS5213 = new BitSet(new long[]{0xF800002000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_37_in_ruleResourceCS5230 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResourceCS5242 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_rulePropertyCS_in_ruleResourceCS5263 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_15_in_ruleResourceCS5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID5315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqn_in_entryRuleFqn5410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqn5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFqn5468 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleFqn5487 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFqn5509 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});

}