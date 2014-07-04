package org.cloudml.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.cloudml.dsl.services.CloudMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCloudMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'components'", "'{'", "'}'", "'instances'", "'provider'", "':'", "'vm'", "'external'", "'provided'", "'internal'", "'required'", "'execution'", "'=>'", "'.'", "'local'", "'mandatory'"
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
    public String getGrammarFileName() { return "../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g"; }


     
     	private CloudMLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CloudMLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleCloudMLRoot"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:60:1: entryRuleCloudMLRoot : ruleCloudMLRoot EOF ;
    public final void entryRuleCloudMLRoot() throws RecognitionException {
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:61:1: ( ruleCloudMLRoot EOF )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:62:1: ruleCloudMLRoot EOF
            {
             before(grammarAccess.getCloudMLRootRule()); 
            pushFollow(FOLLOW_ruleCloudMLRoot_in_entryRuleCloudMLRoot61);
            ruleCloudMLRoot();

            state._fsp--;

             after(grammarAccess.getCloudMLRootRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCloudMLRoot68); 

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
    // $ANTLR end "entryRuleCloudMLRoot"


    // $ANTLR start "ruleCloudMLRoot"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:69:1: ruleCloudMLRoot : ( ( rule__CloudMLRoot__Group__0 ) ) ;
    public final void ruleCloudMLRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:73:2: ( ( ( rule__CloudMLRoot__Group__0 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:74:1: ( ( rule__CloudMLRoot__Group__0 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:74:1: ( ( rule__CloudMLRoot__Group__0 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:75:1: ( rule__CloudMLRoot__Group__0 )
            {
             before(grammarAccess.getCloudMLRootAccess().getGroup()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:76:1: ( rule__CloudMLRoot__Group__0 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:76:2: rule__CloudMLRoot__Group__0
            {
            pushFollow(FOLLOW_rule__CloudMLRoot__Group__0_in_ruleCloudMLRoot94);
            rule__CloudMLRoot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCloudMLRootAccess().getGroup()); 

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
    // $ANTLR end "ruleCloudMLRoot"


    // $ANTLR start "entryRuleProviderCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:88:1: entryRuleProviderCS : ruleProviderCS EOF ;
    public final void entryRuleProviderCS() throws RecognitionException {
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:89:1: ( ruleProviderCS EOF )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:90:1: ruleProviderCS EOF
            {
             before(grammarAccess.getProviderCSRule()); 
            pushFollow(FOLLOW_ruleProviderCS_in_entryRuleProviderCS121);
            ruleProviderCS();

            state._fsp--;

             after(grammarAccess.getProviderCSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProviderCS128); 

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
    // $ANTLR end "entryRuleProviderCS"


    // $ANTLR start "ruleProviderCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:97:1: ruleProviderCS : ( ( rule__ProviderCS__Group__0 ) ) ;
    public final void ruleProviderCS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:101:2: ( ( ( rule__ProviderCS__Group__0 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:102:1: ( ( rule__ProviderCS__Group__0 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:102:1: ( ( rule__ProviderCS__Group__0 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:103:1: ( rule__ProviderCS__Group__0 )
            {
             before(grammarAccess.getProviderCSAccess().getGroup()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:104:1: ( rule__ProviderCS__Group__0 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:104:2: rule__ProviderCS__Group__0
            {
            pushFollow(FOLLOW_rule__ProviderCS__Group__0_in_ruleProviderCS154);
            rule__ProviderCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProviderCSAccess().getGroup()); 

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
    // $ANTLR end "ruleProviderCS"


    // $ANTLR start "entryRuleVMCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:116:1: entryRuleVMCS : ruleVMCS EOF ;
    public final void entryRuleVMCS() throws RecognitionException {
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:117:1: ( ruleVMCS EOF )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:118:1: ruleVMCS EOF
            {
             before(grammarAccess.getVMCSRule()); 
            pushFollow(FOLLOW_ruleVMCS_in_entryRuleVMCS181);
            ruleVMCS();

            state._fsp--;

             after(grammarAccess.getVMCSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVMCS188); 

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
    // $ANTLR end "entryRuleVMCS"


    // $ANTLR start "ruleVMCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:125:1: ruleVMCS : ( ( rule__VMCS__Group__0 ) ) ;
    public final void ruleVMCS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:129:2: ( ( ( rule__VMCS__Group__0 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:130:1: ( ( rule__VMCS__Group__0 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:130:1: ( ( rule__VMCS__Group__0 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:131:1: ( rule__VMCS__Group__0 )
            {
             before(grammarAccess.getVMCSAccess().getGroup()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:132:1: ( rule__VMCS__Group__0 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:132:2: rule__VMCS__Group__0
            {
            pushFollow(FOLLOW_rule__VMCS__Group__0_in_ruleVMCS214);
            rule__VMCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVMCSAccess().getGroup()); 

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
    // $ANTLR end "ruleVMCS"


    // $ANTLR start "entryRuleVMPortCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:144:1: entryRuleVMPortCS : ruleVMPortCS EOF ;
    public final void entryRuleVMPortCS() throws RecognitionException {
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:145:1: ( ruleVMPortCS EOF )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:146:1: ruleVMPortCS EOF
            {
             before(grammarAccess.getVMPortCSRule()); 
            pushFollow(FOLLOW_ruleVMPortCS_in_entryRuleVMPortCS241);
            ruleVMPortCS();

            state._fsp--;

             after(grammarAccess.getVMPortCSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVMPortCS248); 

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
    // $ANTLR end "entryRuleVMPortCS"


    // $ANTLR start "ruleVMPortCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:153:1: ruleVMPortCS : ( ( rule__VMPortCS__NameAssignment ) ) ;
    public final void ruleVMPortCS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:157:2: ( ( ( rule__VMPortCS__NameAssignment ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:158:1: ( ( rule__VMPortCS__NameAssignment ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:158:1: ( ( rule__VMPortCS__NameAssignment ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:159:1: ( rule__VMPortCS__NameAssignment )
            {
             before(grammarAccess.getVMPortCSAccess().getNameAssignment()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:160:1: ( rule__VMPortCS__NameAssignment )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:160:2: rule__VMPortCS__NameAssignment
            {
            pushFollow(FOLLOW_rule__VMPortCS__NameAssignment_in_ruleVMPortCS274);
            rule__VMPortCS__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVMPortCSAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleVMPortCS"


    // $ANTLR start "entryRuleExternalComponentCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:172:1: entryRuleExternalComponentCS : ruleExternalComponentCS EOF ;
    public final void entryRuleExternalComponentCS() throws RecognitionException {
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:173:1: ( ruleExternalComponentCS EOF )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:174:1: ruleExternalComponentCS EOF
            {
             before(grammarAccess.getExternalComponentCSRule()); 
            pushFollow(FOLLOW_ruleExternalComponentCS_in_entryRuleExternalComponentCS301);
            ruleExternalComponentCS();

            state._fsp--;

             after(grammarAccess.getExternalComponentCSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalComponentCS308); 

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
    // $ANTLR end "entryRuleExternalComponentCS"


    // $ANTLR start "ruleExternalComponentCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:181:1: ruleExternalComponentCS : ( ( rule__ExternalComponentCS__Group__0 ) ) ;
    public final void ruleExternalComponentCS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:185:2: ( ( ( rule__ExternalComponentCS__Group__0 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:186:1: ( ( rule__ExternalComponentCS__Group__0 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:186:1: ( ( rule__ExternalComponentCS__Group__0 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:187:1: ( rule__ExternalComponentCS__Group__0 )
            {
             before(grammarAccess.getExternalComponentCSAccess().getGroup()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:188:1: ( rule__ExternalComponentCS__Group__0 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:188:2: rule__ExternalComponentCS__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalComponentCS__Group__0_in_ruleExternalComponentCS334);
            rule__ExternalComponentCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalComponentCSAccess().getGroup()); 

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
    // $ANTLR end "ruleExternalComponentCS"


    // $ANTLR start "entryRuleProvidedPortCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:200:1: entryRuleProvidedPortCS : ruleProvidedPortCS EOF ;
    public final void entryRuleProvidedPortCS() throws RecognitionException {
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:201:1: ( ruleProvidedPortCS EOF )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:202:1: ruleProvidedPortCS EOF
            {
             before(grammarAccess.getProvidedPortCSRule()); 
            pushFollow(FOLLOW_ruleProvidedPortCS_in_entryRuleProvidedPortCS361);
            ruleProvidedPortCS();

            state._fsp--;

             after(grammarAccess.getProvidedPortCSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedPortCS368); 

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
    // $ANTLR end "entryRuleProvidedPortCS"


    // $ANTLR start "ruleProvidedPortCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:209:1: ruleProvidedPortCS : ( ( rule__ProvidedPortCS__Group__0 ) ) ;
    public final void ruleProvidedPortCS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:213:2: ( ( ( rule__ProvidedPortCS__Group__0 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:214:1: ( ( rule__ProvidedPortCS__Group__0 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:214:1: ( ( rule__ProvidedPortCS__Group__0 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:215:1: ( rule__ProvidedPortCS__Group__0 )
            {
             before(grammarAccess.getProvidedPortCSAccess().getGroup()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:216:1: ( rule__ProvidedPortCS__Group__0 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:216:2: rule__ProvidedPortCS__Group__0
            {
            pushFollow(FOLLOW_rule__ProvidedPortCS__Group__0_in_ruleProvidedPortCS394);
            rule__ProvidedPortCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProvidedPortCSAccess().getGroup()); 

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
    // $ANTLR end "ruleProvidedPortCS"


    // $ANTLR start "entryRuleInternalComponentCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:228:1: entryRuleInternalComponentCS : ruleInternalComponentCS EOF ;
    public final void entryRuleInternalComponentCS() throws RecognitionException {
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:229:1: ( ruleInternalComponentCS EOF )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:230:1: ruleInternalComponentCS EOF
            {
             before(grammarAccess.getInternalComponentCSRule()); 
            pushFollow(FOLLOW_ruleInternalComponentCS_in_entryRuleInternalComponentCS421);
            ruleInternalComponentCS();

            state._fsp--;

             after(grammarAccess.getInternalComponentCSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalComponentCS428); 

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
    // $ANTLR end "entryRuleInternalComponentCS"


    // $ANTLR start "ruleInternalComponentCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:237:1: ruleInternalComponentCS : ( ( rule__InternalComponentCS__Group__0 ) ) ;
    public final void ruleInternalComponentCS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:241:2: ( ( ( rule__InternalComponentCS__Group__0 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:242:1: ( ( rule__InternalComponentCS__Group__0 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:242:1: ( ( rule__InternalComponentCS__Group__0 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:243:1: ( rule__InternalComponentCS__Group__0 )
            {
             before(grammarAccess.getInternalComponentCSAccess().getGroup()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:244:1: ( rule__InternalComponentCS__Group__0 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:244:2: rule__InternalComponentCS__Group__0
            {
            pushFollow(FOLLOW_rule__InternalComponentCS__Group__0_in_ruleInternalComponentCS454);
            rule__InternalComponentCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternalComponentCSAccess().getGroup()); 

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
    // $ANTLR end "ruleInternalComponentCS"


    // $ANTLR start "entryRuleRequiredPortCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:256:1: entryRuleRequiredPortCS : ruleRequiredPortCS EOF ;
    public final void entryRuleRequiredPortCS() throws RecognitionException {
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:257:1: ( ruleRequiredPortCS EOF )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:258:1: ruleRequiredPortCS EOF
            {
             before(grammarAccess.getRequiredPortCSRule()); 
            pushFollow(FOLLOW_ruleRequiredPortCS_in_entryRuleRequiredPortCS481);
            ruleRequiredPortCS();

            state._fsp--;

             after(grammarAccess.getRequiredPortCSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredPortCS488); 

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
    // $ANTLR end "entryRuleRequiredPortCS"


    // $ANTLR start "ruleRequiredPortCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:265:1: ruleRequiredPortCS : ( ( rule__RequiredPortCS__Group__0 ) ) ;
    public final void ruleRequiredPortCS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:269:2: ( ( ( rule__RequiredPortCS__Group__0 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:270:1: ( ( rule__RequiredPortCS__Group__0 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:270:1: ( ( rule__RequiredPortCS__Group__0 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:271:1: ( rule__RequiredPortCS__Group__0 )
            {
             before(grammarAccess.getRequiredPortCSAccess().getGroup()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:272:1: ( rule__RequiredPortCS__Group__0 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:272:2: rule__RequiredPortCS__Group__0
            {
            pushFollow(FOLLOW_rule__RequiredPortCS__Group__0_in_ruleRequiredPortCS514);
            rule__RequiredPortCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredPortCSAccess().getGroup()); 

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
    // $ANTLR end "ruleRequiredPortCS"


    // $ANTLR start "entryRuleRequiredExecutionPlatformCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:284:1: entryRuleRequiredExecutionPlatformCS : ruleRequiredExecutionPlatformCS EOF ;
    public final void entryRuleRequiredExecutionPlatformCS() throws RecognitionException {
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:285:1: ( ruleRequiredExecutionPlatformCS EOF )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:286:1: ruleRequiredExecutionPlatformCS EOF
            {
             before(grammarAccess.getRequiredExecutionPlatformCSRule()); 
            pushFollow(FOLLOW_ruleRequiredExecutionPlatformCS_in_entryRuleRequiredExecutionPlatformCS541);
            ruleRequiredExecutionPlatformCS();

            state._fsp--;

             after(grammarAccess.getRequiredExecutionPlatformCSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredExecutionPlatformCS548); 

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
    // $ANTLR end "entryRuleRequiredExecutionPlatformCS"


    // $ANTLR start "ruleRequiredExecutionPlatformCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:293:1: ruleRequiredExecutionPlatformCS : ( ( rule__RequiredExecutionPlatformCS__Group__0 ) ) ;
    public final void ruleRequiredExecutionPlatformCS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:297:2: ( ( ( rule__RequiredExecutionPlatformCS__Group__0 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:298:1: ( ( rule__RequiredExecutionPlatformCS__Group__0 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:298:1: ( ( rule__RequiredExecutionPlatformCS__Group__0 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:299:1: ( rule__RequiredExecutionPlatformCS__Group__0 )
            {
             before(grammarAccess.getRequiredExecutionPlatformCSAccess().getGroup()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:300:1: ( rule__RequiredExecutionPlatformCS__Group__0 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:300:2: rule__RequiredExecutionPlatformCS__Group__0
            {
            pushFollow(FOLLOW_rule__RequiredExecutionPlatformCS__Group__0_in_ruleRequiredExecutionPlatformCS574);
            rule__RequiredExecutionPlatformCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredExecutionPlatformCSAccess().getGroup()); 

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
    // $ANTLR end "ruleRequiredExecutionPlatformCS"


    // $ANTLR start "entryRuleRelationshipCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:312:1: entryRuleRelationshipCS : ruleRelationshipCS EOF ;
    public final void entryRuleRelationshipCS() throws RecognitionException {
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:313:1: ( ruleRelationshipCS EOF )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:314:1: ruleRelationshipCS EOF
            {
             before(grammarAccess.getRelationshipCSRule()); 
            pushFollow(FOLLOW_ruleRelationshipCS_in_entryRuleRelationshipCS601);
            ruleRelationshipCS();

            state._fsp--;

             after(grammarAccess.getRelationshipCSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationshipCS608); 

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
    // $ANTLR end "entryRuleRelationshipCS"


    // $ANTLR start "ruleRelationshipCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:321:1: ruleRelationshipCS : ( ( rule__RelationshipCS__Group__0 ) ) ;
    public final void ruleRelationshipCS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:325:2: ( ( ( rule__RelationshipCS__Group__0 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:326:1: ( ( rule__RelationshipCS__Group__0 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:326:1: ( ( rule__RelationshipCS__Group__0 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:327:1: ( rule__RelationshipCS__Group__0 )
            {
             before(grammarAccess.getRelationshipCSAccess().getGroup()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:328:1: ( rule__RelationshipCS__Group__0 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:328:2: rule__RelationshipCS__Group__0
            {
            pushFollow(FOLLOW_rule__RelationshipCS__Group__0_in_ruleRelationshipCS634);
            rule__RelationshipCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipCSAccess().getGroup()); 

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
    // $ANTLR end "ruleRelationshipCS"


    // $ANTLR start "entryRuleExternalComponentInstanceCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:340:1: entryRuleExternalComponentInstanceCS : ruleExternalComponentInstanceCS EOF ;
    public final void entryRuleExternalComponentInstanceCS() throws RecognitionException {
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:341:1: ( ruleExternalComponentInstanceCS EOF )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:342:1: ruleExternalComponentInstanceCS EOF
            {
             before(grammarAccess.getExternalComponentInstanceCSRule()); 
            pushFollow(FOLLOW_ruleExternalComponentInstanceCS_in_entryRuleExternalComponentInstanceCS661);
            ruleExternalComponentInstanceCS();

            state._fsp--;

             after(grammarAccess.getExternalComponentInstanceCSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalComponentInstanceCS668); 

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
    // $ANTLR end "entryRuleExternalComponentInstanceCS"


    // $ANTLR start "ruleExternalComponentInstanceCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:349:1: ruleExternalComponentInstanceCS : ( ( rule__ExternalComponentInstanceCS__Group__0 ) ) ;
    public final void ruleExternalComponentInstanceCS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:353:2: ( ( ( rule__ExternalComponentInstanceCS__Group__0 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:354:1: ( ( rule__ExternalComponentInstanceCS__Group__0 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:354:1: ( ( rule__ExternalComponentInstanceCS__Group__0 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:355:1: ( rule__ExternalComponentInstanceCS__Group__0 )
            {
             before(grammarAccess.getExternalComponentInstanceCSAccess().getGroup()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:356:1: ( rule__ExternalComponentInstanceCS__Group__0 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:356:2: rule__ExternalComponentInstanceCS__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalComponentInstanceCS__Group__0_in_ruleExternalComponentInstanceCS694);
            rule__ExternalComponentInstanceCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalComponentInstanceCSAccess().getGroup()); 

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
    // $ANTLR end "ruleExternalComponentInstanceCS"


    // $ANTLR start "entryRuleInternalComponentInstanceCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:368:1: entryRuleInternalComponentInstanceCS : ruleInternalComponentInstanceCS EOF ;
    public final void entryRuleInternalComponentInstanceCS() throws RecognitionException {
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:369:1: ( ruleInternalComponentInstanceCS EOF )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:370:1: ruleInternalComponentInstanceCS EOF
            {
             before(grammarAccess.getInternalComponentInstanceCSRule()); 
            pushFollow(FOLLOW_ruleInternalComponentInstanceCS_in_entryRuleInternalComponentInstanceCS721);
            ruleInternalComponentInstanceCS();

            state._fsp--;

             after(grammarAccess.getInternalComponentInstanceCSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalComponentInstanceCS728); 

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
    // $ANTLR end "entryRuleInternalComponentInstanceCS"


    // $ANTLR start "ruleInternalComponentInstanceCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:377:1: ruleInternalComponentInstanceCS : ( ( rule__InternalComponentInstanceCS__Group__0 ) ) ;
    public final void ruleInternalComponentInstanceCS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:381:2: ( ( ( rule__InternalComponentInstanceCS__Group__0 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:382:1: ( ( rule__InternalComponentInstanceCS__Group__0 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:382:1: ( ( rule__InternalComponentInstanceCS__Group__0 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:383:1: ( rule__InternalComponentInstanceCS__Group__0 )
            {
             before(grammarAccess.getInternalComponentInstanceCSAccess().getGroup()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:384:1: ( rule__InternalComponentInstanceCS__Group__0 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:384:2: rule__InternalComponentInstanceCS__Group__0
            {
            pushFollow(FOLLOW_rule__InternalComponentInstanceCS__Group__0_in_ruleInternalComponentInstanceCS754);
            rule__InternalComponentInstanceCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternalComponentInstanceCSAccess().getGroup()); 

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
    // $ANTLR end "ruleInternalComponentInstanceCS"


    // $ANTLR start "entryRuleRelationshipInstanceCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:396:1: entryRuleRelationshipInstanceCS : ruleRelationshipInstanceCS EOF ;
    public final void entryRuleRelationshipInstanceCS() throws RecognitionException {
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:397:1: ( ruleRelationshipInstanceCS EOF )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:398:1: ruleRelationshipInstanceCS EOF
            {
             before(grammarAccess.getRelationshipInstanceCSRule()); 
            pushFollow(FOLLOW_ruleRelationshipInstanceCS_in_entryRuleRelationshipInstanceCS781);
            ruleRelationshipInstanceCS();

            state._fsp--;

             after(grammarAccess.getRelationshipInstanceCSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationshipInstanceCS788); 

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
    // $ANTLR end "entryRuleRelationshipInstanceCS"


    // $ANTLR start "ruleRelationshipInstanceCS"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:405:1: ruleRelationshipInstanceCS : ( ( rule__RelationshipInstanceCS__Group__0 ) ) ;
    public final void ruleRelationshipInstanceCS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:409:2: ( ( ( rule__RelationshipInstanceCS__Group__0 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:410:1: ( ( rule__RelationshipInstanceCS__Group__0 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:410:1: ( ( rule__RelationshipInstanceCS__Group__0 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:411:1: ( rule__RelationshipInstanceCS__Group__0 )
            {
             before(grammarAccess.getRelationshipInstanceCSAccess().getGroup()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:412:1: ( rule__RelationshipInstanceCS__Group__0 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:412:2: rule__RelationshipInstanceCS__Group__0
            {
            pushFollow(FOLLOW_rule__RelationshipInstanceCS__Group__0_in_ruleRelationshipInstanceCS814);
            rule__RelationshipInstanceCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipInstanceCSAccess().getGroup()); 

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
    // $ANTLR end "ruleRelationshipInstanceCS"


    // $ANTLR start "entryRuleFqn"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:424:1: entryRuleFqn : ruleFqn EOF ;
    public final void entryRuleFqn() throws RecognitionException {
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:425:1: ( ruleFqn EOF )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:426:1: ruleFqn EOF
            {
             before(grammarAccess.getFqnRule()); 
            pushFollow(FOLLOW_ruleFqn_in_entryRuleFqn841);
            ruleFqn();

            state._fsp--;

             after(grammarAccess.getFqnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqn848); 

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
    // $ANTLR end "entryRuleFqn"


    // $ANTLR start "ruleFqn"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:433:1: ruleFqn : ( ( rule__Fqn__Group__0 ) ) ;
    public final void ruleFqn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:437:2: ( ( ( rule__Fqn__Group__0 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:438:1: ( ( rule__Fqn__Group__0 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:438:1: ( ( rule__Fqn__Group__0 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:439:1: ( rule__Fqn__Group__0 )
            {
             before(grammarAccess.getFqnAccess().getGroup()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:440:1: ( rule__Fqn__Group__0 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:440:2: rule__Fqn__Group__0
            {
            pushFollow(FOLLOW_rule__Fqn__Group__0_in_ruleFqn874);
            rule__Fqn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFqnAccess().getGroup()); 

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
    // $ANTLR end "ruleFqn"


    // $ANTLR start "rule__CloudMLRoot__Alternatives_5"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:452:1: rule__CloudMLRoot__Alternatives_5 : ( ( ( rule__CloudMLRoot__VmsAssignment_5_0 ) ) | ( ( rule__CloudMLRoot__InternalComponentsAssignment_5_1 ) ) | ( ( rule__CloudMLRoot__ExternalComponentsAssignment_5_2 ) ) );
    public final void rule__CloudMLRoot__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:456:1: ( ( ( rule__CloudMLRoot__VmsAssignment_5_0 ) ) | ( ( rule__CloudMLRoot__InternalComponentsAssignment_5_1 ) ) | ( ( rule__CloudMLRoot__ExternalComponentsAssignment_5_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:457:1: ( ( rule__CloudMLRoot__VmsAssignment_5_0 ) )
                    {
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:457:1: ( ( rule__CloudMLRoot__VmsAssignment_5_0 ) )
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:458:1: ( rule__CloudMLRoot__VmsAssignment_5_0 )
                    {
                     before(grammarAccess.getCloudMLRootAccess().getVmsAssignment_5_0()); 
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:459:1: ( rule__CloudMLRoot__VmsAssignment_5_0 )
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:459:2: rule__CloudMLRoot__VmsAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__CloudMLRoot__VmsAssignment_5_0_in_rule__CloudMLRoot__Alternatives_5910);
                    rule__CloudMLRoot__VmsAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCloudMLRootAccess().getVmsAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:463:6: ( ( rule__CloudMLRoot__InternalComponentsAssignment_5_1 ) )
                    {
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:463:6: ( ( rule__CloudMLRoot__InternalComponentsAssignment_5_1 ) )
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:464:1: ( rule__CloudMLRoot__InternalComponentsAssignment_5_1 )
                    {
                     before(grammarAccess.getCloudMLRootAccess().getInternalComponentsAssignment_5_1()); 
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:465:1: ( rule__CloudMLRoot__InternalComponentsAssignment_5_1 )
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:465:2: rule__CloudMLRoot__InternalComponentsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__CloudMLRoot__InternalComponentsAssignment_5_1_in_rule__CloudMLRoot__Alternatives_5928);
                    rule__CloudMLRoot__InternalComponentsAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCloudMLRootAccess().getInternalComponentsAssignment_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:469:6: ( ( rule__CloudMLRoot__ExternalComponentsAssignment_5_2 ) )
                    {
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:469:6: ( ( rule__CloudMLRoot__ExternalComponentsAssignment_5_2 ) )
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:470:1: ( rule__CloudMLRoot__ExternalComponentsAssignment_5_2 )
                    {
                     before(grammarAccess.getCloudMLRootAccess().getExternalComponentsAssignment_5_2()); 
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:471:1: ( rule__CloudMLRoot__ExternalComponentsAssignment_5_2 )
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:471:2: rule__CloudMLRoot__ExternalComponentsAssignment_5_2
                    {
                    pushFollow(FOLLOW_rule__CloudMLRoot__ExternalComponentsAssignment_5_2_in_rule__CloudMLRoot__Alternatives_5946);
                    rule__CloudMLRoot__ExternalComponentsAssignment_5_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCloudMLRootAccess().getExternalComponentsAssignment_5_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__CloudMLRoot__Alternatives_5"


    // $ANTLR start "rule__CloudMLRoot__Alternatives_10"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:480:1: rule__CloudMLRoot__Alternatives_10 : ( ( ( rule__CloudMLRoot__ComponentInstancesAssignment_10_0 ) ) | ( ( rule__CloudMLRoot__ComponentInstancesAssignment_10_1 ) ) );
    public final void rule__CloudMLRoot__Alternatives_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:484:1: ( ( ( rule__CloudMLRoot__ComponentInstancesAssignment_10_0 ) ) | ( ( rule__CloudMLRoot__ComponentInstancesAssignment_10_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:485:1: ( ( rule__CloudMLRoot__ComponentInstancesAssignment_10_0 ) )
                    {
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:485:1: ( ( rule__CloudMLRoot__ComponentInstancesAssignment_10_0 ) )
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:486:1: ( rule__CloudMLRoot__ComponentInstancesAssignment_10_0 )
                    {
                     before(grammarAccess.getCloudMLRootAccess().getComponentInstancesAssignment_10_0()); 
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:487:1: ( rule__CloudMLRoot__ComponentInstancesAssignment_10_0 )
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:487:2: rule__CloudMLRoot__ComponentInstancesAssignment_10_0
                    {
                    pushFollow(FOLLOW_rule__CloudMLRoot__ComponentInstancesAssignment_10_0_in_rule__CloudMLRoot__Alternatives_10979);
                    rule__CloudMLRoot__ComponentInstancesAssignment_10_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCloudMLRootAccess().getComponentInstancesAssignment_10_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:491:6: ( ( rule__CloudMLRoot__ComponentInstancesAssignment_10_1 ) )
                    {
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:491:6: ( ( rule__CloudMLRoot__ComponentInstancesAssignment_10_1 ) )
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:492:1: ( rule__CloudMLRoot__ComponentInstancesAssignment_10_1 )
                    {
                     before(grammarAccess.getCloudMLRootAccess().getComponentInstancesAssignment_10_1()); 
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:493:1: ( rule__CloudMLRoot__ComponentInstancesAssignment_10_1 )
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:493:2: rule__CloudMLRoot__ComponentInstancesAssignment_10_1
                    {
                    pushFollow(FOLLOW_rule__CloudMLRoot__ComponentInstancesAssignment_10_1_in_rule__CloudMLRoot__Alternatives_10997);
                    rule__CloudMLRoot__ComponentInstancesAssignment_10_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCloudMLRootAccess().getComponentInstancesAssignment_10_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__CloudMLRoot__Alternatives_10"


    // $ANTLR start "rule__CloudMLRoot__Group__0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:504:1: rule__CloudMLRoot__Group__0 : rule__CloudMLRoot__Group__0__Impl rule__CloudMLRoot__Group__1 ;
    public final void rule__CloudMLRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:508:1: ( rule__CloudMLRoot__Group__0__Impl rule__CloudMLRoot__Group__1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:509:2: rule__CloudMLRoot__Group__0__Impl rule__CloudMLRoot__Group__1
            {
            pushFollow(FOLLOW_rule__CloudMLRoot__Group__0__Impl_in_rule__CloudMLRoot__Group__01028);
            rule__CloudMLRoot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CloudMLRoot__Group__1_in_rule__CloudMLRoot__Group__01031);
            rule__CloudMLRoot__Group__1();

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
    // $ANTLR end "rule__CloudMLRoot__Group__0"


    // $ANTLR start "rule__CloudMLRoot__Group__0__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:516:1: rule__CloudMLRoot__Group__0__Impl : ( 'model' ) ;
    public final void rule__CloudMLRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:520:1: ( ( 'model' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:521:1: ( 'model' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:521:1: ( 'model' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:522:1: 'model'
            {
             before(grammarAccess.getCloudMLRootAccess().getModelKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__CloudMLRoot__Group__0__Impl1059); 
             after(grammarAccess.getCloudMLRootAccess().getModelKeyword_0()); 

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
    // $ANTLR end "rule__CloudMLRoot__Group__0__Impl"


    // $ANTLR start "rule__CloudMLRoot__Group__1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:535:1: rule__CloudMLRoot__Group__1 : rule__CloudMLRoot__Group__1__Impl rule__CloudMLRoot__Group__2 ;
    public final void rule__CloudMLRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:539:1: ( rule__CloudMLRoot__Group__1__Impl rule__CloudMLRoot__Group__2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:540:2: rule__CloudMLRoot__Group__1__Impl rule__CloudMLRoot__Group__2
            {
            pushFollow(FOLLOW_rule__CloudMLRoot__Group__1__Impl_in_rule__CloudMLRoot__Group__11090);
            rule__CloudMLRoot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CloudMLRoot__Group__2_in_rule__CloudMLRoot__Group__11093);
            rule__CloudMLRoot__Group__2();

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
    // $ANTLR end "rule__CloudMLRoot__Group__1"


    // $ANTLR start "rule__CloudMLRoot__Group__1__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:547:1: rule__CloudMLRoot__Group__1__Impl : ( ( rule__CloudMLRoot__NameAssignment_1 ) ) ;
    public final void rule__CloudMLRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:551:1: ( ( ( rule__CloudMLRoot__NameAssignment_1 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:552:1: ( ( rule__CloudMLRoot__NameAssignment_1 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:552:1: ( ( rule__CloudMLRoot__NameAssignment_1 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:553:1: ( rule__CloudMLRoot__NameAssignment_1 )
            {
             before(grammarAccess.getCloudMLRootAccess().getNameAssignment_1()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:554:1: ( rule__CloudMLRoot__NameAssignment_1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:554:2: rule__CloudMLRoot__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CloudMLRoot__NameAssignment_1_in_rule__CloudMLRoot__Group__1__Impl1120);
            rule__CloudMLRoot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCloudMLRootAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CloudMLRoot__Group__1__Impl"


    // $ANTLR start "rule__CloudMLRoot__Group__2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:564:1: rule__CloudMLRoot__Group__2 : rule__CloudMLRoot__Group__2__Impl rule__CloudMLRoot__Group__3 ;
    public final void rule__CloudMLRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:568:1: ( rule__CloudMLRoot__Group__2__Impl rule__CloudMLRoot__Group__3 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:569:2: rule__CloudMLRoot__Group__2__Impl rule__CloudMLRoot__Group__3
            {
            pushFollow(FOLLOW_rule__CloudMLRoot__Group__2__Impl_in_rule__CloudMLRoot__Group__21150);
            rule__CloudMLRoot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CloudMLRoot__Group__3_in_rule__CloudMLRoot__Group__21153);
            rule__CloudMLRoot__Group__3();

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
    // $ANTLR end "rule__CloudMLRoot__Group__2"


    // $ANTLR start "rule__CloudMLRoot__Group__2__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:576:1: rule__CloudMLRoot__Group__2__Impl : ( ( rule__CloudMLRoot__ProvidersAssignment_2 )* ) ;
    public final void rule__CloudMLRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:580:1: ( ( ( rule__CloudMLRoot__ProvidersAssignment_2 )* ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:581:1: ( ( rule__CloudMLRoot__ProvidersAssignment_2 )* )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:581:1: ( ( rule__CloudMLRoot__ProvidersAssignment_2 )* )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:582:1: ( rule__CloudMLRoot__ProvidersAssignment_2 )*
            {
             before(grammarAccess.getCloudMLRootAccess().getProvidersAssignment_2()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:583:1: ( rule__CloudMLRoot__ProvidersAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:583:2: rule__CloudMLRoot__ProvidersAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__CloudMLRoot__ProvidersAssignment_2_in_rule__CloudMLRoot__Group__2__Impl1180);
            	    rule__CloudMLRoot__ProvidersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCloudMLRootAccess().getProvidersAssignment_2()); 

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
    // $ANTLR end "rule__CloudMLRoot__Group__2__Impl"


    // $ANTLR start "rule__CloudMLRoot__Group__3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:593:1: rule__CloudMLRoot__Group__3 : rule__CloudMLRoot__Group__3__Impl rule__CloudMLRoot__Group__4 ;
    public final void rule__CloudMLRoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:597:1: ( rule__CloudMLRoot__Group__3__Impl rule__CloudMLRoot__Group__4 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:598:2: rule__CloudMLRoot__Group__3__Impl rule__CloudMLRoot__Group__4
            {
            pushFollow(FOLLOW_rule__CloudMLRoot__Group__3__Impl_in_rule__CloudMLRoot__Group__31211);
            rule__CloudMLRoot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CloudMLRoot__Group__4_in_rule__CloudMLRoot__Group__31214);
            rule__CloudMLRoot__Group__4();

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
    // $ANTLR end "rule__CloudMLRoot__Group__3"


    // $ANTLR start "rule__CloudMLRoot__Group__3__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:605:1: rule__CloudMLRoot__Group__3__Impl : ( 'components' ) ;
    public final void rule__CloudMLRoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:609:1: ( ( 'components' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:610:1: ( 'components' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:610:1: ( 'components' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:611:1: 'components'
            {
             before(grammarAccess.getCloudMLRootAccess().getComponentsKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__CloudMLRoot__Group__3__Impl1242); 
             after(grammarAccess.getCloudMLRootAccess().getComponentsKeyword_3()); 

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
    // $ANTLR end "rule__CloudMLRoot__Group__3__Impl"


    // $ANTLR start "rule__CloudMLRoot__Group__4"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:624:1: rule__CloudMLRoot__Group__4 : rule__CloudMLRoot__Group__4__Impl rule__CloudMLRoot__Group__5 ;
    public final void rule__CloudMLRoot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:628:1: ( rule__CloudMLRoot__Group__4__Impl rule__CloudMLRoot__Group__5 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:629:2: rule__CloudMLRoot__Group__4__Impl rule__CloudMLRoot__Group__5
            {
            pushFollow(FOLLOW_rule__CloudMLRoot__Group__4__Impl_in_rule__CloudMLRoot__Group__41273);
            rule__CloudMLRoot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CloudMLRoot__Group__5_in_rule__CloudMLRoot__Group__41276);
            rule__CloudMLRoot__Group__5();

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
    // $ANTLR end "rule__CloudMLRoot__Group__4"


    // $ANTLR start "rule__CloudMLRoot__Group__4__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:636:1: rule__CloudMLRoot__Group__4__Impl : ( '{' ) ;
    public final void rule__CloudMLRoot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:640:1: ( ( '{' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:641:1: ( '{' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:641:1: ( '{' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:642:1: '{'
            {
             before(grammarAccess.getCloudMLRootAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__CloudMLRoot__Group__4__Impl1304); 
             after(grammarAccess.getCloudMLRootAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__CloudMLRoot__Group__4__Impl"


    // $ANTLR start "rule__CloudMLRoot__Group__5"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:655:1: rule__CloudMLRoot__Group__5 : rule__CloudMLRoot__Group__5__Impl rule__CloudMLRoot__Group__6 ;
    public final void rule__CloudMLRoot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:659:1: ( rule__CloudMLRoot__Group__5__Impl rule__CloudMLRoot__Group__6 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:660:2: rule__CloudMLRoot__Group__5__Impl rule__CloudMLRoot__Group__6
            {
            pushFollow(FOLLOW_rule__CloudMLRoot__Group__5__Impl_in_rule__CloudMLRoot__Group__51335);
            rule__CloudMLRoot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CloudMLRoot__Group__6_in_rule__CloudMLRoot__Group__51338);
            rule__CloudMLRoot__Group__6();

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
    // $ANTLR end "rule__CloudMLRoot__Group__5"


    // $ANTLR start "rule__CloudMLRoot__Group__5__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:667:1: rule__CloudMLRoot__Group__5__Impl : ( ( rule__CloudMLRoot__Alternatives_5 )* ) ;
    public final void rule__CloudMLRoot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:671:1: ( ( ( rule__CloudMLRoot__Alternatives_5 )* ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:672:1: ( ( rule__CloudMLRoot__Alternatives_5 )* )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:672:1: ( ( rule__CloudMLRoot__Alternatives_5 )* )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:673:1: ( rule__CloudMLRoot__Alternatives_5 )*
            {
             before(grammarAccess.getCloudMLRootAccess().getAlternatives_5()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:674:1: ( rule__CloudMLRoot__Alternatives_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=18 && LA4_0<=19)||LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:674:2: rule__CloudMLRoot__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__CloudMLRoot__Alternatives_5_in_rule__CloudMLRoot__Group__5__Impl1365);
            	    rule__CloudMLRoot__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCloudMLRootAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__CloudMLRoot__Group__5__Impl"


    // $ANTLR start "rule__CloudMLRoot__Group__6"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:684:1: rule__CloudMLRoot__Group__6 : rule__CloudMLRoot__Group__6__Impl rule__CloudMLRoot__Group__7 ;
    public final void rule__CloudMLRoot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:688:1: ( rule__CloudMLRoot__Group__6__Impl rule__CloudMLRoot__Group__7 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:689:2: rule__CloudMLRoot__Group__6__Impl rule__CloudMLRoot__Group__7
            {
            pushFollow(FOLLOW_rule__CloudMLRoot__Group__6__Impl_in_rule__CloudMLRoot__Group__61396);
            rule__CloudMLRoot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CloudMLRoot__Group__7_in_rule__CloudMLRoot__Group__61399);
            rule__CloudMLRoot__Group__7();

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
    // $ANTLR end "rule__CloudMLRoot__Group__6"


    // $ANTLR start "rule__CloudMLRoot__Group__6__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:696:1: rule__CloudMLRoot__Group__6__Impl : ( ( rule__CloudMLRoot__RelationshipsAssignment_6 )* ) ;
    public final void rule__CloudMLRoot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:700:1: ( ( ( rule__CloudMLRoot__RelationshipsAssignment_6 )* ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:701:1: ( ( rule__CloudMLRoot__RelationshipsAssignment_6 )* )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:701:1: ( ( rule__CloudMLRoot__RelationshipsAssignment_6 )* )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:702:1: ( rule__CloudMLRoot__RelationshipsAssignment_6 )*
            {
             before(grammarAccess.getCloudMLRootAccess().getRelationshipsAssignment_6()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:703:1: ( rule__CloudMLRoot__RelationshipsAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:703:2: rule__CloudMLRoot__RelationshipsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__CloudMLRoot__RelationshipsAssignment_6_in_rule__CloudMLRoot__Group__6__Impl1426);
            	    rule__CloudMLRoot__RelationshipsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCloudMLRootAccess().getRelationshipsAssignment_6()); 

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
    // $ANTLR end "rule__CloudMLRoot__Group__6__Impl"


    // $ANTLR start "rule__CloudMLRoot__Group__7"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:713:1: rule__CloudMLRoot__Group__7 : rule__CloudMLRoot__Group__7__Impl rule__CloudMLRoot__Group__8 ;
    public final void rule__CloudMLRoot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:717:1: ( rule__CloudMLRoot__Group__7__Impl rule__CloudMLRoot__Group__8 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:718:2: rule__CloudMLRoot__Group__7__Impl rule__CloudMLRoot__Group__8
            {
            pushFollow(FOLLOW_rule__CloudMLRoot__Group__7__Impl_in_rule__CloudMLRoot__Group__71457);
            rule__CloudMLRoot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CloudMLRoot__Group__8_in_rule__CloudMLRoot__Group__71460);
            rule__CloudMLRoot__Group__8();

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
    // $ANTLR end "rule__CloudMLRoot__Group__7"


    // $ANTLR start "rule__CloudMLRoot__Group__7__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:725:1: rule__CloudMLRoot__Group__7__Impl : ( '}' ) ;
    public final void rule__CloudMLRoot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:729:1: ( ( '}' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:730:1: ( '}' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:730:1: ( '}' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:731:1: '}'
            {
             before(grammarAccess.getCloudMLRootAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__CloudMLRoot__Group__7__Impl1488); 
             after(grammarAccess.getCloudMLRootAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__CloudMLRoot__Group__7__Impl"


    // $ANTLR start "rule__CloudMLRoot__Group__8"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:744:1: rule__CloudMLRoot__Group__8 : rule__CloudMLRoot__Group__8__Impl rule__CloudMLRoot__Group__9 ;
    public final void rule__CloudMLRoot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:748:1: ( rule__CloudMLRoot__Group__8__Impl rule__CloudMLRoot__Group__9 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:749:2: rule__CloudMLRoot__Group__8__Impl rule__CloudMLRoot__Group__9
            {
            pushFollow(FOLLOW_rule__CloudMLRoot__Group__8__Impl_in_rule__CloudMLRoot__Group__81519);
            rule__CloudMLRoot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CloudMLRoot__Group__9_in_rule__CloudMLRoot__Group__81522);
            rule__CloudMLRoot__Group__9();

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
    // $ANTLR end "rule__CloudMLRoot__Group__8"


    // $ANTLR start "rule__CloudMLRoot__Group__8__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:756:1: rule__CloudMLRoot__Group__8__Impl : ( 'instances' ) ;
    public final void rule__CloudMLRoot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:760:1: ( ( 'instances' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:761:1: ( 'instances' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:761:1: ( 'instances' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:762:1: 'instances'
            {
             before(grammarAccess.getCloudMLRootAccess().getInstancesKeyword_8()); 
            match(input,15,FOLLOW_15_in_rule__CloudMLRoot__Group__8__Impl1550); 
             after(grammarAccess.getCloudMLRootAccess().getInstancesKeyword_8()); 

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
    // $ANTLR end "rule__CloudMLRoot__Group__8__Impl"


    // $ANTLR start "rule__CloudMLRoot__Group__9"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:775:1: rule__CloudMLRoot__Group__9 : rule__CloudMLRoot__Group__9__Impl rule__CloudMLRoot__Group__10 ;
    public final void rule__CloudMLRoot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:779:1: ( rule__CloudMLRoot__Group__9__Impl rule__CloudMLRoot__Group__10 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:780:2: rule__CloudMLRoot__Group__9__Impl rule__CloudMLRoot__Group__10
            {
            pushFollow(FOLLOW_rule__CloudMLRoot__Group__9__Impl_in_rule__CloudMLRoot__Group__91581);
            rule__CloudMLRoot__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CloudMLRoot__Group__10_in_rule__CloudMLRoot__Group__91584);
            rule__CloudMLRoot__Group__10();

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
    // $ANTLR end "rule__CloudMLRoot__Group__9"


    // $ANTLR start "rule__CloudMLRoot__Group__9__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:787:1: rule__CloudMLRoot__Group__9__Impl : ( '{' ) ;
    public final void rule__CloudMLRoot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:791:1: ( ( '{' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:792:1: ( '{' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:792:1: ( '{' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:793:1: '{'
            {
             before(grammarAccess.getCloudMLRootAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_13_in_rule__CloudMLRoot__Group__9__Impl1612); 
             after(grammarAccess.getCloudMLRootAccess().getLeftCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__CloudMLRoot__Group__9__Impl"


    // $ANTLR start "rule__CloudMLRoot__Group__10"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:806:1: rule__CloudMLRoot__Group__10 : rule__CloudMLRoot__Group__10__Impl rule__CloudMLRoot__Group__11 ;
    public final void rule__CloudMLRoot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:810:1: ( rule__CloudMLRoot__Group__10__Impl rule__CloudMLRoot__Group__11 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:811:2: rule__CloudMLRoot__Group__10__Impl rule__CloudMLRoot__Group__11
            {
            pushFollow(FOLLOW_rule__CloudMLRoot__Group__10__Impl_in_rule__CloudMLRoot__Group__101643);
            rule__CloudMLRoot__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CloudMLRoot__Group__11_in_rule__CloudMLRoot__Group__101646);
            rule__CloudMLRoot__Group__11();

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
    // $ANTLR end "rule__CloudMLRoot__Group__10"


    // $ANTLR start "rule__CloudMLRoot__Group__10__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:818:1: rule__CloudMLRoot__Group__10__Impl : ( ( rule__CloudMLRoot__Alternatives_10 )* ) ;
    public final void rule__CloudMLRoot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:822:1: ( ( ( rule__CloudMLRoot__Alternatives_10 )* ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:823:1: ( ( rule__CloudMLRoot__Alternatives_10 )* )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:823:1: ( ( rule__CloudMLRoot__Alternatives_10 )* )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:824:1: ( rule__CloudMLRoot__Alternatives_10 )*
            {
             before(grammarAccess.getCloudMLRootAccess().getAlternatives_10()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:825:1: ( rule__CloudMLRoot__Alternatives_10 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19||LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:825:2: rule__CloudMLRoot__Alternatives_10
            	    {
            	    pushFollow(FOLLOW_rule__CloudMLRoot__Alternatives_10_in_rule__CloudMLRoot__Group__10__Impl1673);
            	    rule__CloudMLRoot__Alternatives_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getCloudMLRootAccess().getAlternatives_10()); 

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
    // $ANTLR end "rule__CloudMLRoot__Group__10__Impl"


    // $ANTLR start "rule__CloudMLRoot__Group__11"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:835:1: rule__CloudMLRoot__Group__11 : rule__CloudMLRoot__Group__11__Impl rule__CloudMLRoot__Group__12 ;
    public final void rule__CloudMLRoot__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:839:1: ( rule__CloudMLRoot__Group__11__Impl rule__CloudMLRoot__Group__12 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:840:2: rule__CloudMLRoot__Group__11__Impl rule__CloudMLRoot__Group__12
            {
            pushFollow(FOLLOW_rule__CloudMLRoot__Group__11__Impl_in_rule__CloudMLRoot__Group__111704);
            rule__CloudMLRoot__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CloudMLRoot__Group__12_in_rule__CloudMLRoot__Group__111707);
            rule__CloudMLRoot__Group__12();

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
    // $ANTLR end "rule__CloudMLRoot__Group__11"


    // $ANTLR start "rule__CloudMLRoot__Group__11__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:847:1: rule__CloudMLRoot__Group__11__Impl : ( ( rule__CloudMLRoot__RelationshipInstancesAssignment_11 )* ) ;
    public final void rule__CloudMLRoot__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:851:1: ( ( ( rule__CloudMLRoot__RelationshipInstancesAssignment_11 )* ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:852:1: ( ( rule__CloudMLRoot__RelationshipInstancesAssignment_11 )* )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:852:1: ( ( rule__CloudMLRoot__RelationshipInstancesAssignment_11 )* )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:853:1: ( rule__CloudMLRoot__RelationshipInstancesAssignment_11 )*
            {
             before(grammarAccess.getCloudMLRootAccess().getRelationshipInstancesAssignment_11()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:854:1: ( rule__CloudMLRoot__RelationshipInstancesAssignment_11 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:854:2: rule__CloudMLRoot__RelationshipInstancesAssignment_11
            	    {
            	    pushFollow(FOLLOW_rule__CloudMLRoot__RelationshipInstancesAssignment_11_in_rule__CloudMLRoot__Group__11__Impl1734);
            	    rule__CloudMLRoot__RelationshipInstancesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCloudMLRootAccess().getRelationshipInstancesAssignment_11()); 

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
    // $ANTLR end "rule__CloudMLRoot__Group__11__Impl"


    // $ANTLR start "rule__CloudMLRoot__Group__12"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:864:1: rule__CloudMLRoot__Group__12 : rule__CloudMLRoot__Group__12__Impl ;
    public final void rule__CloudMLRoot__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:868:1: ( rule__CloudMLRoot__Group__12__Impl )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:869:2: rule__CloudMLRoot__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__CloudMLRoot__Group__12__Impl_in_rule__CloudMLRoot__Group__121765);
            rule__CloudMLRoot__Group__12__Impl();

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
    // $ANTLR end "rule__CloudMLRoot__Group__12"


    // $ANTLR start "rule__CloudMLRoot__Group__12__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:875:1: rule__CloudMLRoot__Group__12__Impl : ( '}' ) ;
    public final void rule__CloudMLRoot__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:879:1: ( ( '}' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:880:1: ( '}' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:880:1: ( '}' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:881:1: '}'
            {
             before(grammarAccess.getCloudMLRootAccess().getRightCurlyBracketKeyword_12()); 
            match(input,14,FOLLOW_14_in_rule__CloudMLRoot__Group__12__Impl1793); 
             after(grammarAccess.getCloudMLRootAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__CloudMLRoot__Group__12__Impl"


    // $ANTLR start "rule__ProviderCS__Group__0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:920:1: rule__ProviderCS__Group__0 : rule__ProviderCS__Group__0__Impl rule__ProviderCS__Group__1 ;
    public final void rule__ProviderCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:924:1: ( rule__ProviderCS__Group__0__Impl rule__ProviderCS__Group__1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:925:2: rule__ProviderCS__Group__0__Impl rule__ProviderCS__Group__1
            {
            pushFollow(FOLLOW_rule__ProviderCS__Group__0__Impl_in_rule__ProviderCS__Group__01850);
            rule__ProviderCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProviderCS__Group__1_in_rule__ProviderCS__Group__01853);
            rule__ProviderCS__Group__1();

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
    // $ANTLR end "rule__ProviderCS__Group__0"


    // $ANTLR start "rule__ProviderCS__Group__0__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:932:1: rule__ProviderCS__Group__0__Impl : ( 'provider' ) ;
    public final void rule__ProviderCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:936:1: ( ( 'provider' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:937:1: ( 'provider' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:937:1: ( 'provider' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:938:1: 'provider'
            {
             before(grammarAccess.getProviderCSAccess().getProviderKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__ProviderCS__Group__0__Impl1881); 
             after(grammarAccess.getProviderCSAccess().getProviderKeyword_0()); 

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
    // $ANTLR end "rule__ProviderCS__Group__0__Impl"


    // $ANTLR start "rule__ProviderCS__Group__1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:951:1: rule__ProviderCS__Group__1 : rule__ProviderCS__Group__1__Impl rule__ProviderCS__Group__2 ;
    public final void rule__ProviderCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:955:1: ( rule__ProviderCS__Group__1__Impl rule__ProviderCS__Group__2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:956:2: rule__ProviderCS__Group__1__Impl rule__ProviderCS__Group__2
            {
            pushFollow(FOLLOW_rule__ProviderCS__Group__1__Impl_in_rule__ProviderCS__Group__11912);
            rule__ProviderCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProviderCS__Group__2_in_rule__ProviderCS__Group__11915);
            rule__ProviderCS__Group__2();

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
    // $ANTLR end "rule__ProviderCS__Group__1"


    // $ANTLR start "rule__ProviderCS__Group__1__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:963:1: rule__ProviderCS__Group__1__Impl : ( ( rule__ProviderCS__NameAssignment_1 ) ) ;
    public final void rule__ProviderCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:967:1: ( ( ( rule__ProviderCS__NameAssignment_1 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:968:1: ( ( rule__ProviderCS__NameAssignment_1 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:968:1: ( ( rule__ProviderCS__NameAssignment_1 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:969:1: ( rule__ProviderCS__NameAssignment_1 )
            {
             before(grammarAccess.getProviderCSAccess().getNameAssignment_1()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:970:1: ( rule__ProviderCS__NameAssignment_1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:970:2: rule__ProviderCS__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ProviderCS__NameAssignment_1_in_rule__ProviderCS__Group__1__Impl1942);
            rule__ProviderCS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProviderCSAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ProviderCS__Group__1__Impl"


    // $ANTLR start "rule__ProviderCS__Group__2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:980:1: rule__ProviderCS__Group__2 : rule__ProviderCS__Group__2__Impl rule__ProviderCS__Group__3 ;
    public final void rule__ProviderCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:984:1: ( rule__ProviderCS__Group__2__Impl rule__ProviderCS__Group__3 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:985:2: rule__ProviderCS__Group__2__Impl rule__ProviderCS__Group__3
            {
            pushFollow(FOLLOW_rule__ProviderCS__Group__2__Impl_in_rule__ProviderCS__Group__21972);
            rule__ProviderCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProviderCS__Group__3_in_rule__ProviderCS__Group__21975);
            rule__ProviderCS__Group__3();

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
    // $ANTLR end "rule__ProviderCS__Group__2"


    // $ANTLR start "rule__ProviderCS__Group__2__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:992:1: rule__ProviderCS__Group__2__Impl : ( ':' ) ;
    public final void rule__ProviderCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:996:1: ( ( ':' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:997:1: ( ':' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:997:1: ( ':' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:998:1: ':'
            {
             before(grammarAccess.getProviderCSAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__ProviderCS__Group__2__Impl2003); 
             after(grammarAccess.getProviderCSAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__ProviderCS__Group__2__Impl"


    // $ANTLR start "rule__ProviderCS__Group__3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1011:1: rule__ProviderCS__Group__3 : rule__ProviderCS__Group__3__Impl ;
    public final void rule__ProviderCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1015:1: ( rule__ProviderCS__Group__3__Impl )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1016:2: rule__ProviderCS__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ProviderCS__Group__3__Impl_in_rule__ProviderCS__Group__32034);
            rule__ProviderCS__Group__3__Impl();

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
    // $ANTLR end "rule__ProviderCS__Group__3"


    // $ANTLR start "rule__ProviderCS__Group__3__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1022:1: rule__ProviderCS__Group__3__Impl : ( ( rule__ProviderCS__CredentialsAssignment_3 ) ) ;
    public final void rule__ProviderCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1026:1: ( ( ( rule__ProviderCS__CredentialsAssignment_3 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1027:1: ( ( rule__ProviderCS__CredentialsAssignment_3 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1027:1: ( ( rule__ProviderCS__CredentialsAssignment_3 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1028:1: ( rule__ProviderCS__CredentialsAssignment_3 )
            {
             before(grammarAccess.getProviderCSAccess().getCredentialsAssignment_3()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1029:1: ( rule__ProviderCS__CredentialsAssignment_3 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1029:2: rule__ProviderCS__CredentialsAssignment_3
            {
            pushFollow(FOLLOW_rule__ProviderCS__CredentialsAssignment_3_in_rule__ProviderCS__Group__3__Impl2061);
            rule__ProviderCS__CredentialsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProviderCSAccess().getCredentialsAssignment_3()); 

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
    // $ANTLR end "rule__ProviderCS__Group__3__Impl"


    // $ANTLR start "rule__VMCS__Group__0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1047:1: rule__VMCS__Group__0 : rule__VMCS__Group__0__Impl rule__VMCS__Group__1 ;
    public final void rule__VMCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1051:1: ( rule__VMCS__Group__0__Impl rule__VMCS__Group__1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1052:2: rule__VMCS__Group__0__Impl rule__VMCS__Group__1
            {
            pushFollow(FOLLOW_rule__VMCS__Group__0__Impl_in_rule__VMCS__Group__02099);
            rule__VMCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VMCS__Group__1_in_rule__VMCS__Group__02102);
            rule__VMCS__Group__1();

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
    // $ANTLR end "rule__VMCS__Group__0"


    // $ANTLR start "rule__VMCS__Group__0__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1059:1: rule__VMCS__Group__0__Impl : ( 'vm' ) ;
    public final void rule__VMCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1063:1: ( ( 'vm' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1064:1: ( 'vm' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1064:1: ( 'vm' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1065:1: 'vm'
            {
             before(grammarAccess.getVMCSAccess().getVmKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__VMCS__Group__0__Impl2130); 
             after(grammarAccess.getVMCSAccess().getVmKeyword_0()); 

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
    // $ANTLR end "rule__VMCS__Group__0__Impl"


    // $ANTLR start "rule__VMCS__Group__1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1078:1: rule__VMCS__Group__1 : rule__VMCS__Group__1__Impl rule__VMCS__Group__2 ;
    public final void rule__VMCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1082:1: ( rule__VMCS__Group__1__Impl rule__VMCS__Group__2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1083:2: rule__VMCS__Group__1__Impl rule__VMCS__Group__2
            {
            pushFollow(FOLLOW_rule__VMCS__Group__1__Impl_in_rule__VMCS__Group__12161);
            rule__VMCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VMCS__Group__2_in_rule__VMCS__Group__12164);
            rule__VMCS__Group__2();

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
    // $ANTLR end "rule__VMCS__Group__1"


    // $ANTLR start "rule__VMCS__Group__1__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1090:1: rule__VMCS__Group__1__Impl : ( ( rule__VMCS__NameAssignment_1 ) ) ;
    public final void rule__VMCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1094:1: ( ( ( rule__VMCS__NameAssignment_1 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1095:1: ( ( rule__VMCS__NameAssignment_1 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1095:1: ( ( rule__VMCS__NameAssignment_1 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1096:1: ( rule__VMCS__NameAssignment_1 )
            {
             before(grammarAccess.getVMCSAccess().getNameAssignment_1()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1097:1: ( rule__VMCS__NameAssignment_1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1097:2: rule__VMCS__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VMCS__NameAssignment_1_in_rule__VMCS__Group__1__Impl2191);
            rule__VMCS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVMCSAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__VMCS__Group__1__Impl"


    // $ANTLR start "rule__VMCS__Group__2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1107:1: rule__VMCS__Group__2 : rule__VMCS__Group__2__Impl rule__VMCS__Group__3 ;
    public final void rule__VMCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1111:1: ( rule__VMCS__Group__2__Impl rule__VMCS__Group__3 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1112:2: rule__VMCS__Group__2__Impl rule__VMCS__Group__3
            {
            pushFollow(FOLLOW_rule__VMCS__Group__2__Impl_in_rule__VMCS__Group__22221);
            rule__VMCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VMCS__Group__3_in_rule__VMCS__Group__22224);
            rule__VMCS__Group__3();

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
    // $ANTLR end "rule__VMCS__Group__2"


    // $ANTLR start "rule__VMCS__Group__2__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1119:1: rule__VMCS__Group__2__Impl : ( '{' ) ;
    public final void rule__VMCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1123:1: ( ( '{' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1124:1: ( '{' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1124:1: ( '{' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1125:1: '{'
            {
             before(grammarAccess.getVMCSAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__VMCS__Group__2__Impl2252); 
             after(grammarAccess.getVMCSAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__VMCS__Group__2__Impl"


    // $ANTLR start "rule__VMCS__Group__3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1138:1: rule__VMCS__Group__3 : rule__VMCS__Group__3__Impl rule__VMCS__Group__4 ;
    public final void rule__VMCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1142:1: ( rule__VMCS__Group__3__Impl rule__VMCS__Group__4 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1143:2: rule__VMCS__Group__3__Impl rule__VMCS__Group__4
            {
            pushFollow(FOLLOW_rule__VMCS__Group__3__Impl_in_rule__VMCS__Group__32283);
            rule__VMCS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VMCS__Group__4_in_rule__VMCS__Group__32286);
            rule__VMCS__Group__4();

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
    // $ANTLR end "rule__VMCS__Group__3"


    // $ANTLR start "rule__VMCS__Group__3__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1150:1: rule__VMCS__Group__3__Impl : ( ( rule__VMCS__ProvidedAssignment_3 )* ) ;
    public final void rule__VMCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1154:1: ( ( ( rule__VMCS__ProvidedAssignment_3 )* ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1155:1: ( ( rule__VMCS__ProvidedAssignment_3 )* )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1155:1: ( ( rule__VMCS__ProvidedAssignment_3 )* )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1156:1: ( rule__VMCS__ProvidedAssignment_3 )*
            {
             before(grammarAccess.getVMCSAccess().getProvidedAssignment_3()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1157:1: ( rule__VMCS__ProvidedAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1157:2: rule__VMCS__ProvidedAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__VMCS__ProvidedAssignment_3_in_rule__VMCS__Group__3__Impl2313);
            	    rule__VMCS__ProvidedAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getVMCSAccess().getProvidedAssignment_3()); 

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
    // $ANTLR end "rule__VMCS__Group__3__Impl"


    // $ANTLR start "rule__VMCS__Group__4"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1167:1: rule__VMCS__Group__4 : rule__VMCS__Group__4__Impl ;
    public final void rule__VMCS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1171:1: ( rule__VMCS__Group__4__Impl )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1172:2: rule__VMCS__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VMCS__Group__4__Impl_in_rule__VMCS__Group__42344);
            rule__VMCS__Group__4__Impl();

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
    // $ANTLR end "rule__VMCS__Group__4"


    // $ANTLR start "rule__VMCS__Group__4__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1178:1: rule__VMCS__Group__4__Impl : ( '}' ) ;
    public final void rule__VMCS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1182:1: ( ( '}' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1183:1: ( '}' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1183:1: ( '}' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1184:1: '}'
            {
             before(grammarAccess.getVMCSAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__VMCS__Group__4__Impl2372); 
             after(grammarAccess.getVMCSAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__VMCS__Group__4__Impl"


    // $ANTLR start "rule__ExternalComponentCS__Group__0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1207:1: rule__ExternalComponentCS__Group__0 : rule__ExternalComponentCS__Group__0__Impl rule__ExternalComponentCS__Group__1 ;
    public final void rule__ExternalComponentCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1211:1: ( rule__ExternalComponentCS__Group__0__Impl rule__ExternalComponentCS__Group__1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1212:2: rule__ExternalComponentCS__Group__0__Impl rule__ExternalComponentCS__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalComponentCS__Group__0__Impl_in_rule__ExternalComponentCS__Group__02413);
            rule__ExternalComponentCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalComponentCS__Group__1_in_rule__ExternalComponentCS__Group__02416);
            rule__ExternalComponentCS__Group__1();

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
    // $ANTLR end "rule__ExternalComponentCS__Group__0"


    // $ANTLR start "rule__ExternalComponentCS__Group__0__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1219:1: rule__ExternalComponentCS__Group__0__Impl : ( 'external' ) ;
    public final void rule__ExternalComponentCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1223:1: ( ( 'external' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1224:1: ( 'external' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1224:1: ( 'external' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1225:1: 'external'
            {
             before(grammarAccess.getExternalComponentCSAccess().getExternalKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__ExternalComponentCS__Group__0__Impl2444); 
             after(grammarAccess.getExternalComponentCSAccess().getExternalKeyword_0()); 

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
    // $ANTLR end "rule__ExternalComponentCS__Group__0__Impl"


    // $ANTLR start "rule__ExternalComponentCS__Group__1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1238:1: rule__ExternalComponentCS__Group__1 : rule__ExternalComponentCS__Group__1__Impl rule__ExternalComponentCS__Group__2 ;
    public final void rule__ExternalComponentCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1242:1: ( rule__ExternalComponentCS__Group__1__Impl rule__ExternalComponentCS__Group__2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1243:2: rule__ExternalComponentCS__Group__1__Impl rule__ExternalComponentCS__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalComponentCS__Group__1__Impl_in_rule__ExternalComponentCS__Group__12475);
            rule__ExternalComponentCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalComponentCS__Group__2_in_rule__ExternalComponentCS__Group__12478);
            rule__ExternalComponentCS__Group__2();

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
    // $ANTLR end "rule__ExternalComponentCS__Group__1"


    // $ANTLR start "rule__ExternalComponentCS__Group__1__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1250:1: rule__ExternalComponentCS__Group__1__Impl : ( ( rule__ExternalComponentCS__NameAssignment_1 ) ) ;
    public final void rule__ExternalComponentCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1254:1: ( ( ( rule__ExternalComponentCS__NameAssignment_1 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1255:1: ( ( rule__ExternalComponentCS__NameAssignment_1 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1255:1: ( ( rule__ExternalComponentCS__NameAssignment_1 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1256:1: ( rule__ExternalComponentCS__NameAssignment_1 )
            {
             before(grammarAccess.getExternalComponentCSAccess().getNameAssignment_1()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1257:1: ( rule__ExternalComponentCS__NameAssignment_1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1257:2: rule__ExternalComponentCS__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalComponentCS__NameAssignment_1_in_rule__ExternalComponentCS__Group__1__Impl2505);
            rule__ExternalComponentCS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalComponentCSAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ExternalComponentCS__Group__1__Impl"


    // $ANTLR start "rule__ExternalComponentCS__Group__2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1267:1: rule__ExternalComponentCS__Group__2 : rule__ExternalComponentCS__Group__2__Impl rule__ExternalComponentCS__Group__3 ;
    public final void rule__ExternalComponentCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1271:1: ( rule__ExternalComponentCS__Group__2__Impl rule__ExternalComponentCS__Group__3 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1272:2: rule__ExternalComponentCS__Group__2__Impl rule__ExternalComponentCS__Group__3
            {
            pushFollow(FOLLOW_rule__ExternalComponentCS__Group__2__Impl_in_rule__ExternalComponentCS__Group__22535);
            rule__ExternalComponentCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalComponentCS__Group__3_in_rule__ExternalComponentCS__Group__22538);
            rule__ExternalComponentCS__Group__3();

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
    // $ANTLR end "rule__ExternalComponentCS__Group__2"


    // $ANTLR start "rule__ExternalComponentCS__Group__2__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1279:1: rule__ExternalComponentCS__Group__2__Impl : ( '{' ) ;
    public final void rule__ExternalComponentCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1283:1: ( ( '{' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1284:1: ( '{' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1284:1: ( '{' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1285:1: '{'
            {
             before(grammarAccess.getExternalComponentCSAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__ExternalComponentCS__Group__2__Impl2566); 
             after(grammarAccess.getExternalComponentCSAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ExternalComponentCS__Group__2__Impl"


    // $ANTLR start "rule__ExternalComponentCS__Group__3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1298:1: rule__ExternalComponentCS__Group__3 : rule__ExternalComponentCS__Group__3__Impl rule__ExternalComponentCS__Group__4 ;
    public final void rule__ExternalComponentCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1302:1: ( rule__ExternalComponentCS__Group__3__Impl rule__ExternalComponentCS__Group__4 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1303:2: rule__ExternalComponentCS__Group__3__Impl rule__ExternalComponentCS__Group__4
            {
            pushFollow(FOLLOW_rule__ExternalComponentCS__Group__3__Impl_in_rule__ExternalComponentCS__Group__32597);
            rule__ExternalComponentCS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalComponentCS__Group__4_in_rule__ExternalComponentCS__Group__32600);
            rule__ExternalComponentCS__Group__4();

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
    // $ANTLR end "rule__ExternalComponentCS__Group__3"


    // $ANTLR start "rule__ExternalComponentCS__Group__3__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1310:1: rule__ExternalComponentCS__Group__3__Impl : ( ( rule__ExternalComponentCS__ProvidedPortsAssignment_3 )* ) ;
    public final void rule__ExternalComponentCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1314:1: ( ( ( rule__ExternalComponentCS__ProvidedPortsAssignment_3 )* ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1315:1: ( ( rule__ExternalComponentCS__ProvidedPortsAssignment_3 )* )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1315:1: ( ( rule__ExternalComponentCS__ProvidedPortsAssignment_3 )* )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1316:1: ( rule__ExternalComponentCS__ProvidedPortsAssignment_3 )*
            {
             before(grammarAccess.getExternalComponentCSAccess().getProvidedPortsAssignment_3()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1317:1: ( rule__ExternalComponentCS__ProvidedPortsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1317:2: rule__ExternalComponentCS__ProvidedPortsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ExternalComponentCS__ProvidedPortsAssignment_3_in_rule__ExternalComponentCS__Group__3__Impl2627);
            	    rule__ExternalComponentCS__ProvidedPortsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getExternalComponentCSAccess().getProvidedPortsAssignment_3()); 

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
    // $ANTLR end "rule__ExternalComponentCS__Group__3__Impl"


    // $ANTLR start "rule__ExternalComponentCS__Group__4"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1327:1: rule__ExternalComponentCS__Group__4 : rule__ExternalComponentCS__Group__4__Impl ;
    public final void rule__ExternalComponentCS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1331:1: ( rule__ExternalComponentCS__Group__4__Impl )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1332:2: rule__ExternalComponentCS__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ExternalComponentCS__Group__4__Impl_in_rule__ExternalComponentCS__Group__42658);
            rule__ExternalComponentCS__Group__4__Impl();

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
    // $ANTLR end "rule__ExternalComponentCS__Group__4"


    // $ANTLR start "rule__ExternalComponentCS__Group__4__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1338:1: rule__ExternalComponentCS__Group__4__Impl : ( '}' ) ;
    public final void rule__ExternalComponentCS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1342:1: ( ( '}' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1343:1: ( '}' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1343:1: ( '}' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1344:1: '}'
            {
             before(grammarAccess.getExternalComponentCSAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__ExternalComponentCS__Group__4__Impl2686); 
             after(grammarAccess.getExternalComponentCSAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ExternalComponentCS__Group__4__Impl"


    // $ANTLR start "rule__ProvidedPortCS__Group__0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1367:1: rule__ProvidedPortCS__Group__0 : rule__ProvidedPortCS__Group__0__Impl rule__ProvidedPortCS__Group__1 ;
    public final void rule__ProvidedPortCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1371:1: ( rule__ProvidedPortCS__Group__0__Impl rule__ProvidedPortCS__Group__1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1372:2: rule__ProvidedPortCS__Group__0__Impl rule__ProvidedPortCS__Group__1
            {
            pushFollow(FOLLOW_rule__ProvidedPortCS__Group__0__Impl_in_rule__ProvidedPortCS__Group__02727);
            rule__ProvidedPortCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedPortCS__Group__1_in_rule__ProvidedPortCS__Group__02730);
            rule__ProvidedPortCS__Group__1();

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
    // $ANTLR end "rule__ProvidedPortCS__Group__0"


    // $ANTLR start "rule__ProvidedPortCS__Group__0__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1379:1: rule__ProvidedPortCS__Group__0__Impl : ( 'provided' ) ;
    public final void rule__ProvidedPortCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1383:1: ( ( 'provided' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1384:1: ( 'provided' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1384:1: ( 'provided' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1385:1: 'provided'
            {
             before(grammarAccess.getProvidedPortCSAccess().getProvidedKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ProvidedPortCS__Group__0__Impl2758); 
             after(grammarAccess.getProvidedPortCSAccess().getProvidedKeyword_0()); 

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
    // $ANTLR end "rule__ProvidedPortCS__Group__0__Impl"


    // $ANTLR start "rule__ProvidedPortCS__Group__1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1398:1: rule__ProvidedPortCS__Group__1 : rule__ProvidedPortCS__Group__1__Impl rule__ProvidedPortCS__Group__2 ;
    public final void rule__ProvidedPortCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1402:1: ( rule__ProvidedPortCS__Group__1__Impl rule__ProvidedPortCS__Group__2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1403:2: rule__ProvidedPortCS__Group__1__Impl rule__ProvidedPortCS__Group__2
            {
            pushFollow(FOLLOW_rule__ProvidedPortCS__Group__1__Impl_in_rule__ProvidedPortCS__Group__12789);
            rule__ProvidedPortCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedPortCS__Group__2_in_rule__ProvidedPortCS__Group__12792);
            rule__ProvidedPortCS__Group__2();

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
    // $ANTLR end "rule__ProvidedPortCS__Group__1"


    // $ANTLR start "rule__ProvidedPortCS__Group__1__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1410:1: rule__ProvidedPortCS__Group__1__Impl : ( ( rule__ProvidedPortCS__IsLocalAssignment_1 )? ) ;
    public final void rule__ProvidedPortCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1414:1: ( ( ( rule__ProvidedPortCS__IsLocalAssignment_1 )? ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1415:1: ( ( rule__ProvidedPortCS__IsLocalAssignment_1 )? )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1415:1: ( ( rule__ProvidedPortCS__IsLocalAssignment_1 )? )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1416:1: ( rule__ProvidedPortCS__IsLocalAssignment_1 )?
            {
             before(grammarAccess.getProvidedPortCSAccess().getIsLocalAssignment_1()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1417:1: ( rule__ProvidedPortCS__IsLocalAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1417:2: rule__ProvidedPortCS__IsLocalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ProvidedPortCS__IsLocalAssignment_1_in_rule__ProvidedPortCS__Group__1__Impl2819);
                    rule__ProvidedPortCS__IsLocalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProvidedPortCSAccess().getIsLocalAssignment_1()); 

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
    // $ANTLR end "rule__ProvidedPortCS__Group__1__Impl"


    // $ANTLR start "rule__ProvidedPortCS__Group__2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1427:1: rule__ProvidedPortCS__Group__2 : rule__ProvidedPortCS__Group__2__Impl rule__ProvidedPortCS__Group__3 ;
    public final void rule__ProvidedPortCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1431:1: ( rule__ProvidedPortCS__Group__2__Impl rule__ProvidedPortCS__Group__3 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1432:2: rule__ProvidedPortCS__Group__2__Impl rule__ProvidedPortCS__Group__3
            {
            pushFollow(FOLLOW_rule__ProvidedPortCS__Group__2__Impl_in_rule__ProvidedPortCS__Group__22850);
            rule__ProvidedPortCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedPortCS__Group__3_in_rule__ProvidedPortCS__Group__22853);
            rule__ProvidedPortCS__Group__3();

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
    // $ANTLR end "rule__ProvidedPortCS__Group__2"


    // $ANTLR start "rule__ProvidedPortCS__Group__2__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1439:1: rule__ProvidedPortCS__Group__2__Impl : ( ( rule__ProvidedPortCS__NameAssignment_2 ) ) ;
    public final void rule__ProvidedPortCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1443:1: ( ( ( rule__ProvidedPortCS__NameAssignment_2 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1444:1: ( ( rule__ProvidedPortCS__NameAssignment_2 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1444:1: ( ( rule__ProvidedPortCS__NameAssignment_2 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1445:1: ( rule__ProvidedPortCS__NameAssignment_2 )
            {
             before(grammarAccess.getProvidedPortCSAccess().getNameAssignment_2()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1446:1: ( rule__ProvidedPortCS__NameAssignment_2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1446:2: rule__ProvidedPortCS__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ProvidedPortCS__NameAssignment_2_in_rule__ProvidedPortCS__Group__2__Impl2880);
            rule__ProvidedPortCS__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProvidedPortCSAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ProvidedPortCS__Group__2__Impl"


    // $ANTLR start "rule__ProvidedPortCS__Group__3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1456:1: rule__ProvidedPortCS__Group__3 : rule__ProvidedPortCS__Group__3__Impl ;
    public final void rule__ProvidedPortCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1460:1: ( rule__ProvidedPortCS__Group__3__Impl )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1461:2: rule__ProvidedPortCS__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ProvidedPortCS__Group__3__Impl_in_rule__ProvidedPortCS__Group__32910);
            rule__ProvidedPortCS__Group__3__Impl();

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
    // $ANTLR end "rule__ProvidedPortCS__Group__3"


    // $ANTLR start "rule__ProvidedPortCS__Group__3__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1467:1: rule__ProvidedPortCS__Group__3__Impl : ( ( rule__ProvidedPortCS__ComponentAssignment_3 )? ) ;
    public final void rule__ProvidedPortCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1471:1: ( ( ( rule__ProvidedPortCS__ComponentAssignment_3 )? ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1472:1: ( ( rule__ProvidedPortCS__ComponentAssignment_3 )? )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1472:1: ( ( rule__ProvidedPortCS__ComponentAssignment_3 )? )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1473:1: ( rule__ProvidedPortCS__ComponentAssignment_3 )?
            {
             before(grammarAccess.getProvidedPortCSAccess().getComponentAssignment_3()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1474:1: ( rule__ProvidedPortCS__ComponentAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1474:2: rule__ProvidedPortCS__ComponentAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ProvidedPortCS__ComponentAssignment_3_in_rule__ProvidedPortCS__Group__3__Impl2937);
                    rule__ProvidedPortCS__ComponentAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProvidedPortCSAccess().getComponentAssignment_3()); 

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
    // $ANTLR end "rule__ProvidedPortCS__Group__3__Impl"


    // $ANTLR start "rule__InternalComponentCS__Group__0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1492:1: rule__InternalComponentCS__Group__0 : rule__InternalComponentCS__Group__0__Impl rule__InternalComponentCS__Group__1 ;
    public final void rule__InternalComponentCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1496:1: ( rule__InternalComponentCS__Group__0__Impl rule__InternalComponentCS__Group__1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1497:2: rule__InternalComponentCS__Group__0__Impl rule__InternalComponentCS__Group__1
            {
            pushFollow(FOLLOW_rule__InternalComponentCS__Group__0__Impl_in_rule__InternalComponentCS__Group__02976);
            rule__InternalComponentCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalComponentCS__Group__1_in_rule__InternalComponentCS__Group__02979);
            rule__InternalComponentCS__Group__1();

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
    // $ANTLR end "rule__InternalComponentCS__Group__0"


    // $ANTLR start "rule__InternalComponentCS__Group__0__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1504:1: rule__InternalComponentCS__Group__0__Impl : ( 'internal' ) ;
    public final void rule__InternalComponentCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1508:1: ( ( 'internal' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1509:1: ( 'internal' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1509:1: ( 'internal' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1510:1: 'internal'
            {
             before(grammarAccess.getInternalComponentCSAccess().getInternalKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__InternalComponentCS__Group__0__Impl3007); 
             after(grammarAccess.getInternalComponentCSAccess().getInternalKeyword_0()); 

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
    // $ANTLR end "rule__InternalComponentCS__Group__0__Impl"


    // $ANTLR start "rule__InternalComponentCS__Group__1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1523:1: rule__InternalComponentCS__Group__1 : rule__InternalComponentCS__Group__1__Impl rule__InternalComponentCS__Group__2 ;
    public final void rule__InternalComponentCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1527:1: ( rule__InternalComponentCS__Group__1__Impl rule__InternalComponentCS__Group__2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1528:2: rule__InternalComponentCS__Group__1__Impl rule__InternalComponentCS__Group__2
            {
            pushFollow(FOLLOW_rule__InternalComponentCS__Group__1__Impl_in_rule__InternalComponentCS__Group__13038);
            rule__InternalComponentCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalComponentCS__Group__2_in_rule__InternalComponentCS__Group__13041);
            rule__InternalComponentCS__Group__2();

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
    // $ANTLR end "rule__InternalComponentCS__Group__1"


    // $ANTLR start "rule__InternalComponentCS__Group__1__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1535:1: rule__InternalComponentCS__Group__1__Impl : ( ( rule__InternalComponentCS__NameAssignment_1 ) ) ;
    public final void rule__InternalComponentCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1539:1: ( ( ( rule__InternalComponentCS__NameAssignment_1 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1540:1: ( ( rule__InternalComponentCS__NameAssignment_1 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1540:1: ( ( rule__InternalComponentCS__NameAssignment_1 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1541:1: ( rule__InternalComponentCS__NameAssignment_1 )
            {
             before(grammarAccess.getInternalComponentCSAccess().getNameAssignment_1()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1542:1: ( rule__InternalComponentCS__NameAssignment_1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1542:2: rule__InternalComponentCS__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__InternalComponentCS__NameAssignment_1_in_rule__InternalComponentCS__Group__1__Impl3068);
            rule__InternalComponentCS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInternalComponentCSAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__InternalComponentCS__Group__1__Impl"


    // $ANTLR start "rule__InternalComponentCS__Group__2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1552:1: rule__InternalComponentCS__Group__2 : rule__InternalComponentCS__Group__2__Impl rule__InternalComponentCS__Group__3 ;
    public final void rule__InternalComponentCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1556:1: ( rule__InternalComponentCS__Group__2__Impl rule__InternalComponentCS__Group__3 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1557:2: rule__InternalComponentCS__Group__2__Impl rule__InternalComponentCS__Group__3
            {
            pushFollow(FOLLOW_rule__InternalComponentCS__Group__2__Impl_in_rule__InternalComponentCS__Group__23098);
            rule__InternalComponentCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalComponentCS__Group__3_in_rule__InternalComponentCS__Group__23101);
            rule__InternalComponentCS__Group__3();

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
    // $ANTLR end "rule__InternalComponentCS__Group__2"


    // $ANTLR start "rule__InternalComponentCS__Group__2__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1564:1: rule__InternalComponentCS__Group__2__Impl : ( '{' ) ;
    public final void rule__InternalComponentCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1568:1: ( ( '{' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1569:1: ( '{' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1569:1: ( '{' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1570:1: '{'
            {
             before(grammarAccess.getInternalComponentCSAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__InternalComponentCS__Group__2__Impl3129); 
             after(grammarAccess.getInternalComponentCSAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__InternalComponentCS__Group__2__Impl"


    // $ANTLR start "rule__InternalComponentCS__Group__3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1583:1: rule__InternalComponentCS__Group__3 : rule__InternalComponentCS__Group__3__Impl rule__InternalComponentCS__Group__4 ;
    public final void rule__InternalComponentCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1587:1: ( rule__InternalComponentCS__Group__3__Impl rule__InternalComponentCS__Group__4 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1588:2: rule__InternalComponentCS__Group__3__Impl rule__InternalComponentCS__Group__4
            {
            pushFollow(FOLLOW_rule__InternalComponentCS__Group__3__Impl_in_rule__InternalComponentCS__Group__33160);
            rule__InternalComponentCS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalComponentCS__Group__4_in_rule__InternalComponentCS__Group__33163);
            rule__InternalComponentCS__Group__4();

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
    // $ANTLR end "rule__InternalComponentCS__Group__3"


    // $ANTLR start "rule__InternalComponentCS__Group__3__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1595:1: rule__InternalComponentCS__Group__3__Impl : ( ( rule__InternalComponentCS__ProvidedPortsAssignment_3 )* ) ;
    public final void rule__InternalComponentCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1599:1: ( ( ( rule__InternalComponentCS__ProvidedPortsAssignment_3 )* ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1600:1: ( ( rule__InternalComponentCS__ProvidedPortsAssignment_3 )* )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1600:1: ( ( rule__InternalComponentCS__ProvidedPortsAssignment_3 )* )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1601:1: ( rule__InternalComponentCS__ProvidedPortsAssignment_3 )*
            {
             before(grammarAccess.getInternalComponentCSAccess().getProvidedPortsAssignment_3()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1602:1: ( rule__InternalComponentCS__ProvidedPortsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1602:2: rule__InternalComponentCS__ProvidedPortsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__InternalComponentCS__ProvidedPortsAssignment_3_in_rule__InternalComponentCS__Group__3__Impl3190);
            	    rule__InternalComponentCS__ProvidedPortsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getInternalComponentCSAccess().getProvidedPortsAssignment_3()); 

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
    // $ANTLR end "rule__InternalComponentCS__Group__3__Impl"


    // $ANTLR start "rule__InternalComponentCS__Group__4"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1612:1: rule__InternalComponentCS__Group__4 : rule__InternalComponentCS__Group__4__Impl rule__InternalComponentCS__Group__5 ;
    public final void rule__InternalComponentCS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1616:1: ( rule__InternalComponentCS__Group__4__Impl rule__InternalComponentCS__Group__5 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1617:2: rule__InternalComponentCS__Group__4__Impl rule__InternalComponentCS__Group__5
            {
            pushFollow(FOLLOW_rule__InternalComponentCS__Group__4__Impl_in_rule__InternalComponentCS__Group__43221);
            rule__InternalComponentCS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalComponentCS__Group__5_in_rule__InternalComponentCS__Group__43224);
            rule__InternalComponentCS__Group__5();

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
    // $ANTLR end "rule__InternalComponentCS__Group__4"


    // $ANTLR start "rule__InternalComponentCS__Group__4__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1624:1: rule__InternalComponentCS__Group__4__Impl : ( ( rule__InternalComponentCS__RequiredPortsAssignment_4 )* ) ;
    public final void rule__InternalComponentCS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1628:1: ( ( ( rule__InternalComponentCS__RequiredPortsAssignment_4 )* ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1629:1: ( ( rule__InternalComponentCS__RequiredPortsAssignment_4 )* )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1629:1: ( ( rule__InternalComponentCS__RequiredPortsAssignment_4 )* )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1630:1: ( rule__InternalComponentCS__RequiredPortsAssignment_4 )*
            {
             before(grammarAccess.getInternalComponentCSAccess().getRequiredPortsAssignment_4()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1631:1: ( rule__InternalComponentCS__RequiredPortsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1631:2: rule__InternalComponentCS__RequiredPortsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__InternalComponentCS__RequiredPortsAssignment_4_in_rule__InternalComponentCS__Group__4__Impl3251);
            	    rule__InternalComponentCS__RequiredPortsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getInternalComponentCSAccess().getRequiredPortsAssignment_4()); 

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
    // $ANTLR end "rule__InternalComponentCS__Group__4__Impl"


    // $ANTLR start "rule__InternalComponentCS__Group__5"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1641:1: rule__InternalComponentCS__Group__5 : rule__InternalComponentCS__Group__5__Impl rule__InternalComponentCS__Group__6 ;
    public final void rule__InternalComponentCS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1645:1: ( rule__InternalComponentCS__Group__5__Impl rule__InternalComponentCS__Group__6 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1646:2: rule__InternalComponentCS__Group__5__Impl rule__InternalComponentCS__Group__6
            {
            pushFollow(FOLLOW_rule__InternalComponentCS__Group__5__Impl_in_rule__InternalComponentCS__Group__53282);
            rule__InternalComponentCS__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalComponentCS__Group__6_in_rule__InternalComponentCS__Group__53285);
            rule__InternalComponentCS__Group__6();

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
    // $ANTLR end "rule__InternalComponentCS__Group__5"


    // $ANTLR start "rule__InternalComponentCS__Group__5__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1653:1: rule__InternalComponentCS__Group__5__Impl : ( ( rule__InternalComponentCS__RequiredExecutionPlatformAssignment_5 ) ) ;
    public final void rule__InternalComponentCS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1657:1: ( ( ( rule__InternalComponentCS__RequiredExecutionPlatformAssignment_5 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1658:1: ( ( rule__InternalComponentCS__RequiredExecutionPlatformAssignment_5 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1658:1: ( ( rule__InternalComponentCS__RequiredExecutionPlatformAssignment_5 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1659:1: ( rule__InternalComponentCS__RequiredExecutionPlatformAssignment_5 )
            {
             before(grammarAccess.getInternalComponentCSAccess().getRequiredExecutionPlatformAssignment_5()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1660:1: ( rule__InternalComponentCS__RequiredExecutionPlatformAssignment_5 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1660:2: rule__InternalComponentCS__RequiredExecutionPlatformAssignment_5
            {
            pushFollow(FOLLOW_rule__InternalComponentCS__RequiredExecutionPlatformAssignment_5_in_rule__InternalComponentCS__Group__5__Impl3312);
            rule__InternalComponentCS__RequiredExecutionPlatformAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInternalComponentCSAccess().getRequiredExecutionPlatformAssignment_5()); 

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
    // $ANTLR end "rule__InternalComponentCS__Group__5__Impl"


    // $ANTLR start "rule__InternalComponentCS__Group__6"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1670:1: rule__InternalComponentCS__Group__6 : rule__InternalComponentCS__Group__6__Impl ;
    public final void rule__InternalComponentCS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1674:1: ( rule__InternalComponentCS__Group__6__Impl )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1675:2: rule__InternalComponentCS__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__InternalComponentCS__Group__6__Impl_in_rule__InternalComponentCS__Group__63342);
            rule__InternalComponentCS__Group__6__Impl();

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
    // $ANTLR end "rule__InternalComponentCS__Group__6"


    // $ANTLR start "rule__InternalComponentCS__Group__6__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1681:1: rule__InternalComponentCS__Group__6__Impl : ( '}' ) ;
    public final void rule__InternalComponentCS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1685:1: ( ( '}' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1686:1: ( '}' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1686:1: ( '}' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1687:1: '}'
            {
             before(grammarAccess.getInternalComponentCSAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__InternalComponentCS__Group__6__Impl3370); 
             after(grammarAccess.getInternalComponentCSAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__InternalComponentCS__Group__6__Impl"


    // $ANTLR start "rule__RequiredPortCS__Group__0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1714:1: rule__RequiredPortCS__Group__0 : rule__RequiredPortCS__Group__0__Impl rule__RequiredPortCS__Group__1 ;
    public final void rule__RequiredPortCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1718:1: ( rule__RequiredPortCS__Group__0__Impl rule__RequiredPortCS__Group__1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1719:2: rule__RequiredPortCS__Group__0__Impl rule__RequiredPortCS__Group__1
            {
            pushFollow(FOLLOW_rule__RequiredPortCS__Group__0__Impl_in_rule__RequiredPortCS__Group__03415);
            rule__RequiredPortCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredPortCS__Group__1_in_rule__RequiredPortCS__Group__03418);
            rule__RequiredPortCS__Group__1();

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
    // $ANTLR end "rule__RequiredPortCS__Group__0"


    // $ANTLR start "rule__RequiredPortCS__Group__0__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1726:1: rule__RequiredPortCS__Group__0__Impl : ( 'required' ) ;
    public final void rule__RequiredPortCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1730:1: ( ( 'required' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1731:1: ( 'required' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1731:1: ( 'required' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1732:1: 'required'
            {
             before(grammarAccess.getRequiredPortCSAccess().getRequiredKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__RequiredPortCS__Group__0__Impl3446); 
             after(grammarAccess.getRequiredPortCSAccess().getRequiredKeyword_0()); 

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
    // $ANTLR end "rule__RequiredPortCS__Group__0__Impl"


    // $ANTLR start "rule__RequiredPortCS__Group__1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1745:1: rule__RequiredPortCS__Group__1 : rule__RequiredPortCS__Group__1__Impl rule__RequiredPortCS__Group__2 ;
    public final void rule__RequiredPortCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1749:1: ( rule__RequiredPortCS__Group__1__Impl rule__RequiredPortCS__Group__2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1750:2: rule__RequiredPortCS__Group__1__Impl rule__RequiredPortCS__Group__2
            {
            pushFollow(FOLLOW_rule__RequiredPortCS__Group__1__Impl_in_rule__RequiredPortCS__Group__13477);
            rule__RequiredPortCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredPortCS__Group__2_in_rule__RequiredPortCS__Group__13480);
            rule__RequiredPortCS__Group__2();

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
    // $ANTLR end "rule__RequiredPortCS__Group__1"


    // $ANTLR start "rule__RequiredPortCS__Group__1__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1757:1: rule__RequiredPortCS__Group__1__Impl : ( ( rule__RequiredPortCS__IsMandatoryAssignment_1 )? ) ;
    public final void rule__RequiredPortCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1761:1: ( ( ( rule__RequiredPortCS__IsMandatoryAssignment_1 )? ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1762:1: ( ( rule__RequiredPortCS__IsMandatoryAssignment_1 )? )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1762:1: ( ( rule__RequiredPortCS__IsMandatoryAssignment_1 )? )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1763:1: ( rule__RequiredPortCS__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getRequiredPortCSAccess().getIsMandatoryAssignment_1()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1764:1: ( rule__RequiredPortCS__IsMandatoryAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1764:2: rule__RequiredPortCS__IsMandatoryAssignment_1
                    {
                    pushFollow(FOLLOW_rule__RequiredPortCS__IsMandatoryAssignment_1_in_rule__RequiredPortCS__Group__1__Impl3507);
                    rule__RequiredPortCS__IsMandatoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequiredPortCSAccess().getIsMandatoryAssignment_1()); 

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
    // $ANTLR end "rule__RequiredPortCS__Group__1__Impl"


    // $ANTLR start "rule__RequiredPortCS__Group__2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1774:1: rule__RequiredPortCS__Group__2 : rule__RequiredPortCS__Group__2__Impl rule__RequiredPortCS__Group__3 ;
    public final void rule__RequiredPortCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1778:1: ( rule__RequiredPortCS__Group__2__Impl rule__RequiredPortCS__Group__3 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1779:2: rule__RequiredPortCS__Group__2__Impl rule__RequiredPortCS__Group__3
            {
            pushFollow(FOLLOW_rule__RequiredPortCS__Group__2__Impl_in_rule__RequiredPortCS__Group__23538);
            rule__RequiredPortCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredPortCS__Group__3_in_rule__RequiredPortCS__Group__23541);
            rule__RequiredPortCS__Group__3();

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
    // $ANTLR end "rule__RequiredPortCS__Group__2"


    // $ANTLR start "rule__RequiredPortCS__Group__2__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1786:1: rule__RequiredPortCS__Group__2__Impl : ( ( rule__RequiredPortCS__NameAssignment_2 ) ) ;
    public final void rule__RequiredPortCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1790:1: ( ( ( rule__RequiredPortCS__NameAssignment_2 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1791:1: ( ( rule__RequiredPortCS__NameAssignment_2 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1791:1: ( ( rule__RequiredPortCS__NameAssignment_2 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1792:1: ( rule__RequiredPortCS__NameAssignment_2 )
            {
             before(grammarAccess.getRequiredPortCSAccess().getNameAssignment_2()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1793:1: ( rule__RequiredPortCS__NameAssignment_2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1793:2: rule__RequiredPortCS__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RequiredPortCS__NameAssignment_2_in_rule__RequiredPortCS__Group__2__Impl3568);
            rule__RequiredPortCS__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRequiredPortCSAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__RequiredPortCS__Group__2__Impl"


    // $ANTLR start "rule__RequiredPortCS__Group__3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1803:1: rule__RequiredPortCS__Group__3 : rule__RequiredPortCS__Group__3__Impl ;
    public final void rule__RequiredPortCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1807:1: ( rule__RequiredPortCS__Group__3__Impl )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1808:2: rule__RequiredPortCS__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RequiredPortCS__Group__3__Impl_in_rule__RequiredPortCS__Group__33598);
            rule__RequiredPortCS__Group__3__Impl();

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
    // $ANTLR end "rule__RequiredPortCS__Group__3"


    // $ANTLR start "rule__RequiredPortCS__Group__3__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1814:1: rule__RequiredPortCS__Group__3__Impl : ( ( rule__RequiredPortCS__ComponentAssignment_3 )? ) ;
    public final void rule__RequiredPortCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1818:1: ( ( ( rule__RequiredPortCS__ComponentAssignment_3 )? ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1819:1: ( ( rule__RequiredPortCS__ComponentAssignment_3 )? )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1819:1: ( ( rule__RequiredPortCS__ComponentAssignment_3 )? )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1820:1: ( rule__RequiredPortCS__ComponentAssignment_3 )?
            {
             before(grammarAccess.getRequiredPortCSAccess().getComponentAssignment_3()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1821:1: ( rule__RequiredPortCS__ComponentAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1821:2: rule__RequiredPortCS__ComponentAssignment_3
                    {
                    pushFollow(FOLLOW_rule__RequiredPortCS__ComponentAssignment_3_in_rule__RequiredPortCS__Group__3__Impl3625);
                    rule__RequiredPortCS__ComponentAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequiredPortCSAccess().getComponentAssignment_3()); 

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
    // $ANTLR end "rule__RequiredPortCS__Group__3__Impl"


    // $ANTLR start "rule__RequiredExecutionPlatformCS__Group__0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1839:1: rule__RequiredExecutionPlatformCS__Group__0 : rule__RequiredExecutionPlatformCS__Group__0__Impl rule__RequiredExecutionPlatformCS__Group__1 ;
    public final void rule__RequiredExecutionPlatformCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1843:1: ( rule__RequiredExecutionPlatformCS__Group__0__Impl rule__RequiredExecutionPlatformCS__Group__1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1844:2: rule__RequiredExecutionPlatformCS__Group__0__Impl rule__RequiredExecutionPlatformCS__Group__1
            {
            pushFollow(FOLLOW_rule__RequiredExecutionPlatformCS__Group__0__Impl_in_rule__RequiredExecutionPlatformCS__Group__03664);
            rule__RequiredExecutionPlatformCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredExecutionPlatformCS__Group__1_in_rule__RequiredExecutionPlatformCS__Group__03667);
            rule__RequiredExecutionPlatformCS__Group__1();

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
    // $ANTLR end "rule__RequiredExecutionPlatformCS__Group__0"


    // $ANTLR start "rule__RequiredExecutionPlatformCS__Group__0__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1851:1: rule__RequiredExecutionPlatformCS__Group__0__Impl : ( 'execution' ) ;
    public final void rule__RequiredExecutionPlatformCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1855:1: ( ( 'execution' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1856:1: ( 'execution' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1856:1: ( 'execution' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1857:1: 'execution'
            {
             before(grammarAccess.getRequiredExecutionPlatformCSAccess().getExecutionKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__RequiredExecutionPlatformCS__Group__0__Impl3695); 
             after(grammarAccess.getRequiredExecutionPlatformCSAccess().getExecutionKeyword_0()); 

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
    // $ANTLR end "rule__RequiredExecutionPlatformCS__Group__0__Impl"


    // $ANTLR start "rule__RequiredExecutionPlatformCS__Group__1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1870:1: rule__RequiredExecutionPlatformCS__Group__1 : rule__RequiredExecutionPlatformCS__Group__1__Impl rule__RequiredExecutionPlatformCS__Group__2 ;
    public final void rule__RequiredExecutionPlatformCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1874:1: ( rule__RequiredExecutionPlatformCS__Group__1__Impl rule__RequiredExecutionPlatformCS__Group__2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1875:2: rule__RequiredExecutionPlatformCS__Group__1__Impl rule__RequiredExecutionPlatformCS__Group__2
            {
            pushFollow(FOLLOW_rule__RequiredExecutionPlatformCS__Group__1__Impl_in_rule__RequiredExecutionPlatformCS__Group__13726);
            rule__RequiredExecutionPlatformCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredExecutionPlatformCS__Group__2_in_rule__RequiredExecutionPlatformCS__Group__13729);
            rule__RequiredExecutionPlatformCS__Group__2();

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
    // $ANTLR end "rule__RequiredExecutionPlatformCS__Group__1"


    // $ANTLR start "rule__RequiredExecutionPlatformCS__Group__1__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1882:1: rule__RequiredExecutionPlatformCS__Group__1__Impl : ( ( rule__RequiredExecutionPlatformCS__NameAssignment_1 ) ) ;
    public final void rule__RequiredExecutionPlatformCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1886:1: ( ( ( rule__RequiredExecutionPlatformCS__NameAssignment_1 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1887:1: ( ( rule__RequiredExecutionPlatformCS__NameAssignment_1 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1887:1: ( ( rule__RequiredExecutionPlatformCS__NameAssignment_1 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1888:1: ( rule__RequiredExecutionPlatformCS__NameAssignment_1 )
            {
             before(grammarAccess.getRequiredExecutionPlatformCSAccess().getNameAssignment_1()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1889:1: ( rule__RequiredExecutionPlatformCS__NameAssignment_1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1889:2: rule__RequiredExecutionPlatformCS__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RequiredExecutionPlatformCS__NameAssignment_1_in_rule__RequiredExecutionPlatformCS__Group__1__Impl3756);
            rule__RequiredExecutionPlatformCS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequiredExecutionPlatformCSAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RequiredExecutionPlatformCS__Group__1__Impl"


    // $ANTLR start "rule__RequiredExecutionPlatformCS__Group__2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1899:1: rule__RequiredExecutionPlatformCS__Group__2 : rule__RequiredExecutionPlatformCS__Group__2__Impl ;
    public final void rule__RequiredExecutionPlatformCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1903:1: ( rule__RequiredExecutionPlatformCS__Group__2__Impl )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1904:2: rule__RequiredExecutionPlatformCS__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RequiredExecutionPlatformCS__Group__2__Impl_in_rule__RequiredExecutionPlatformCS__Group__23786);
            rule__RequiredExecutionPlatformCS__Group__2__Impl();

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
    // $ANTLR end "rule__RequiredExecutionPlatformCS__Group__2"


    // $ANTLR start "rule__RequiredExecutionPlatformCS__Group__2__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1910:1: rule__RequiredExecutionPlatformCS__Group__2__Impl : ( ( rule__RequiredExecutionPlatformCS__OwnerAssignment_2 )? ) ;
    public final void rule__RequiredExecutionPlatformCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1914:1: ( ( ( rule__RequiredExecutionPlatformCS__OwnerAssignment_2 )? ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1915:1: ( ( rule__RequiredExecutionPlatformCS__OwnerAssignment_2 )? )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1915:1: ( ( rule__RequiredExecutionPlatformCS__OwnerAssignment_2 )? )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1916:1: ( rule__RequiredExecutionPlatformCS__OwnerAssignment_2 )?
            {
             before(grammarAccess.getRequiredExecutionPlatformCSAccess().getOwnerAssignment_2()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1917:1: ( rule__RequiredExecutionPlatformCS__OwnerAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1917:2: rule__RequiredExecutionPlatformCS__OwnerAssignment_2
                    {
                    pushFollow(FOLLOW_rule__RequiredExecutionPlatformCS__OwnerAssignment_2_in_rule__RequiredExecutionPlatformCS__Group__2__Impl3813);
                    rule__RequiredExecutionPlatformCS__OwnerAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequiredExecutionPlatformCSAccess().getOwnerAssignment_2()); 

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
    // $ANTLR end "rule__RequiredExecutionPlatformCS__Group__2__Impl"


    // $ANTLR start "rule__RelationshipCS__Group__0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1933:1: rule__RelationshipCS__Group__0 : rule__RelationshipCS__Group__0__Impl rule__RelationshipCS__Group__1 ;
    public final void rule__RelationshipCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1937:1: ( rule__RelationshipCS__Group__0__Impl rule__RelationshipCS__Group__1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1938:2: rule__RelationshipCS__Group__0__Impl rule__RelationshipCS__Group__1
            {
            pushFollow(FOLLOW_rule__RelationshipCS__Group__0__Impl_in_rule__RelationshipCS__Group__03850);
            rule__RelationshipCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipCS__Group__1_in_rule__RelationshipCS__Group__03853);
            rule__RelationshipCS__Group__1();

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
    // $ANTLR end "rule__RelationshipCS__Group__0"


    // $ANTLR start "rule__RelationshipCS__Group__0__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1945:1: rule__RelationshipCS__Group__0__Impl : ( ( rule__RelationshipCS__NameAssignment_0 ) ) ;
    public final void rule__RelationshipCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1949:1: ( ( ( rule__RelationshipCS__NameAssignment_0 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1950:1: ( ( rule__RelationshipCS__NameAssignment_0 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1950:1: ( ( rule__RelationshipCS__NameAssignment_0 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1951:1: ( rule__RelationshipCS__NameAssignment_0 )
            {
             before(grammarAccess.getRelationshipCSAccess().getNameAssignment_0()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1952:1: ( rule__RelationshipCS__NameAssignment_0 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1952:2: rule__RelationshipCS__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__RelationshipCS__NameAssignment_0_in_rule__RelationshipCS__Group__0__Impl3880);
            rule__RelationshipCS__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipCSAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__RelationshipCS__Group__0__Impl"


    // $ANTLR start "rule__RelationshipCS__Group__1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1962:1: rule__RelationshipCS__Group__1 : rule__RelationshipCS__Group__1__Impl rule__RelationshipCS__Group__2 ;
    public final void rule__RelationshipCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1966:1: ( rule__RelationshipCS__Group__1__Impl rule__RelationshipCS__Group__2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1967:2: rule__RelationshipCS__Group__1__Impl rule__RelationshipCS__Group__2
            {
            pushFollow(FOLLOW_rule__RelationshipCS__Group__1__Impl_in_rule__RelationshipCS__Group__13910);
            rule__RelationshipCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipCS__Group__2_in_rule__RelationshipCS__Group__13913);
            rule__RelationshipCS__Group__2();

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
    // $ANTLR end "rule__RelationshipCS__Group__1"


    // $ANTLR start "rule__RelationshipCS__Group__1__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1974:1: rule__RelationshipCS__Group__1__Impl : ( ':' ) ;
    public final void rule__RelationshipCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1978:1: ( ( ':' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1979:1: ( ':' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1979:1: ( ':' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1980:1: ':'
            {
             before(grammarAccess.getRelationshipCSAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__RelationshipCS__Group__1__Impl3941); 
             after(grammarAccess.getRelationshipCSAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__RelationshipCS__Group__1__Impl"


    // $ANTLR start "rule__RelationshipCS__Group__2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1993:1: rule__RelationshipCS__Group__2 : rule__RelationshipCS__Group__2__Impl rule__RelationshipCS__Group__3 ;
    public final void rule__RelationshipCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1997:1: ( rule__RelationshipCS__Group__2__Impl rule__RelationshipCS__Group__3 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:1998:2: rule__RelationshipCS__Group__2__Impl rule__RelationshipCS__Group__3
            {
            pushFollow(FOLLOW_rule__RelationshipCS__Group__2__Impl_in_rule__RelationshipCS__Group__23972);
            rule__RelationshipCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipCS__Group__3_in_rule__RelationshipCS__Group__23975);
            rule__RelationshipCS__Group__3();

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
    // $ANTLR end "rule__RelationshipCS__Group__2"


    // $ANTLR start "rule__RelationshipCS__Group__2__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2005:1: rule__RelationshipCS__Group__2__Impl : ( ( rule__RelationshipCS__RequiredPortAssignment_2 ) ) ;
    public final void rule__RelationshipCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2009:1: ( ( ( rule__RelationshipCS__RequiredPortAssignment_2 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2010:1: ( ( rule__RelationshipCS__RequiredPortAssignment_2 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2010:1: ( ( rule__RelationshipCS__RequiredPortAssignment_2 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2011:1: ( rule__RelationshipCS__RequiredPortAssignment_2 )
            {
             before(grammarAccess.getRelationshipCSAccess().getRequiredPortAssignment_2()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2012:1: ( rule__RelationshipCS__RequiredPortAssignment_2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2012:2: rule__RelationshipCS__RequiredPortAssignment_2
            {
            pushFollow(FOLLOW_rule__RelationshipCS__RequiredPortAssignment_2_in_rule__RelationshipCS__Group__2__Impl4002);
            rule__RelationshipCS__RequiredPortAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipCSAccess().getRequiredPortAssignment_2()); 

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
    // $ANTLR end "rule__RelationshipCS__Group__2__Impl"


    // $ANTLR start "rule__RelationshipCS__Group__3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2022:1: rule__RelationshipCS__Group__3 : rule__RelationshipCS__Group__3__Impl rule__RelationshipCS__Group__4 ;
    public final void rule__RelationshipCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2026:1: ( rule__RelationshipCS__Group__3__Impl rule__RelationshipCS__Group__4 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2027:2: rule__RelationshipCS__Group__3__Impl rule__RelationshipCS__Group__4
            {
            pushFollow(FOLLOW_rule__RelationshipCS__Group__3__Impl_in_rule__RelationshipCS__Group__34032);
            rule__RelationshipCS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipCS__Group__4_in_rule__RelationshipCS__Group__34035);
            rule__RelationshipCS__Group__4();

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
    // $ANTLR end "rule__RelationshipCS__Group__3"


    // $ANTLR start "rule__RelationshipCS__Group__3__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2034:1: rule__RelationshipCS__Group__3__Impl : ( '=>' ) ;
    public final void rule__RelationshipCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2038:1: ( ( '=>' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2039:1: ( '=>' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2039:1: ( '=>' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2040:1: '=>'
            {
             before(grammarAccess.getRelationshipCSAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__RelationshipCS__Group__3__Impl4063); 
             after(grammarAccess.getRelationshipCSAccess().getEqualsSignGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__RelationshipCS__Group__3__Impl"


    // $ANTLR start "rule__RelationshipCS__Group__4"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2053:1: rule__RelationshipCS__Group__4 : rule__RelationshipCS__Group__4__Impl ;
    public final void rule__RelationshipCS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2057:1: ( rule__RelationshipCS__Group__4__Impl )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2058:2: rule__RelationshipCS__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RelationshipCS__Group__4__Impl_in_rule__RelationshipCS__Group__44094);
            rule__RelationshipCS__Group__4__Impl();

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
    // $ANTLR end "rule__RelationshipCS__Group__4"


    // $ANTLR start "rule__RelationshipCS__Group__4__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2064:1: rule__RelationshipCS__Group__4__Impl : ( ( rule__RelationshipCS__ProvidedPortAssignment_4 ) ) ;
    public final void rule__RelationshipCS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2068:1: ( ( ( rule__RelationshipCS__ProvidedPortAssignment_4 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2069:1: ( ( rule__RelationshipCS__ProvidedPortAssignment_4 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2069:1: ( ( rule__RelationshipCS__ProvidedPortAssignment_4 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2070:1: ( rule__RelationshipCS__ProvidedPortAssignment_4 )
            {
             before(grammarAccess.getRelationshipCSAccess().getProvidedPortAssignment_4()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2071:1: ( rule__RelationshipCS__ProvidedPortAssignment_4 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2071:2: rule__RelationshipCS__ProvidedPortAssignment_4
            {
            pushFollow(FOLLOW_rule__RelationshipCS__ProvidedPortAssignment_4_in_rule__RelationshipCS__Group__4__Impl4121);
            rule__RelationshipCS__ProvidedPortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipCSAccess().getProvidedPortAssignment_4()); 

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
    // $ANTLR end "rule__RelationshipCS__Group__4__Impl"


    // $ANTLR start "rule__ExternalComponentInstanceCS__Group__0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2091:1: rule__ExternalComponentInstanceCS__Group__0 : rule__ExternalComponentInstanceCS__Group__0__Impl rule__ExternalComponentInstanceCS__Group__1 ;
    public final void rule__ExternalComponentInstanceCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2095:1: ( rule__ExternalComponentInstanceCS__Group__0__Impl rule__ExternalComponentInstanceCS__Group__1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2096:2: rule__ExternalComponentInstanceCS__Group__0__Impl rule__ExternalComponentInstanceCS__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalComponentInstanceCS__Group__0__Impl_in_rule__ExternalComponentInstanceCS__Group__04161);
            rule__ExternalComponentInstanceCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalComponentInstanceCS__Group__1_in_rule__ExternalComponentInstanceCS__Group__04164);
            rule__ExternalComponentInstanceCS__Group__1();

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
    // $ANTLR end "rule__ExternalComponentInstanceCS__Group__0"


    // $ANTLR start "rule__ExternalComponentInstanceCS__Group__0__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2103:1: rule__ExternalComponentInstanceCS__Group__0__Impl : ( 'external' ) ;
    public final void rule__ExternalComponentInstanceCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2107:1: ( ( 'external' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2108:1: ( 'external' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2108:1: ( 'external' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2109:1: 'external'
            {
             before(grammarAccess.getExternalComponentInstanceCSAccess().getExternalKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__ExternalComponentInstanceCS__Group__0__Impl4192); 
             after(grammarAccess.getExternalComponentInstanceCSAccess().getExternalKeyword_0()); 

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
    // $ANTLR end "rule__ExternalComponentInstanceCS__Group__0__Impl"


    // $ANTLR start "rule__ExternalComponentInstanceCS__Group__1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2122:1: rule__ExternalComponentInstanceCS__Group__1 : rule__ExternalComponentInstanceCS__Group__1__Impl rule__ExternalComponentInstanceCS__Group__2 ;
    public final void rule__ExternalComponentInstanceCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2126:1: ( rule__ExternalComponentInstanceCS__Group__1__Impl rule__ExternalComponentInstanceCS__Group__2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2127:2: rule__ExternalComponentInstanceCS__Group__1__Impl rule__ExternalComponentInstanceCS__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalComponentInstanceCS__Group__1__Impl_in_rule__ExternalComponentInstanceCS__Group__14223);
            rule__ExternalComponentInstanceCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalComponentInstanceCS__Group__2_in_rule__ExternalComponentInstanceCS__Group__14226);
            rule__ExternalComponentInstanceCS__Group__2();

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
    // $ANTLR end "rule__ExternalComponentInstanceCS__Group__1"


    // $ANTLR start "rule__ExternalComponentInstanceCS__Group__1__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2134:1: rule__ExternalComponentInstanceCS__Group__1__Impl : ( ( rule__ExternalComponentInstanceCS__NameAssignment_1 ) ) ;
    public final void rule__ExternalComponentInstanceCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2138:1: ( ( ( rule__ExternalComponentInstanceCS__NameAssignment_1 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2139:1: ( ( rule__ExternalComponentInstanceCS__NameAssignment_1 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2139:1: ( ( rule__ExternalComponentInstanceCS__NameAssignment_1 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2140:1: ( rule__ExternalComponentInstanceCS__NameAssignment_1 )
            {
             before(grammarAccess.getExternalComponentInstanceCSAccess().getNameAssignment_1()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2141:1: ( rule__ExternalComponentInstanceCS__NameAssignment_1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2141:2: rule__ExternalComponentInstanceCS__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalComponentInstanceCS__NameAssignment_1_in_rule__ExternalComponentInstanceCS__Group__1__Impl4253);
            rule__ExternalComponentInstanceCS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalComponentInstanceCSAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ExternalComponentInstanceCS__Group__1__Impl"


    // $ANTLR start "rule__ExternalComponentInstanceCS__Group__2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2151:1: rule__ExternalComponentInstanceCS__Group__2 : rule__ExternalComponentInstanceCS__Group__2__Impl rule__ExternalComponentInstanceCS__Group__3 ;
    public final void rule__ExternalComponentInstanceCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2155:1: ( rule__ExternalComponentInstanceCS__Group__2__Impl rule__ExternalComponentInstanceCS__Group__3 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2156:2: rule__ExternalComponentInstanceCS__Group__2__Impl rule__ExternalComponentInstanceCS__Group__3
            {
            pushFollow(FOLLOW_rule__ExternalComponentInstanceCS__Group__2__Impl_in_rule__ExternalComponentInstanceCS__Group__24283);
            rule__ExternalComponentInstanceCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalComponentInstanceCS__Group__3_in_rule__ExternalComponentInstanceCS__Group__24286);
            rule__ExternalComponentInstanceCS__Group__3();

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
    // $ANTLR end "rule__ExternalComponentInstanceCS__Group__2"


    // $ANTLR start "rule__ExternalComponentInstanceCS__Group__2__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2163:1: rule__ExternalComponentInstanceCS__Group__2__Impl : ( ':' ) ;
    public final void rule__ExternalComponentInstanceCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2167:1: ( ( ':' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2168:1: ( ':' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2168:1: ( ':' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2169:1: ':'
            {
             before(grammarAccess.getExternalComponentInstanceCSAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__ExternalComponentInstanceCS__Group__2__Impl4314); 
             after(grammarAccess.getExternalComponentInstanceCSAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__ExternalComponentInstanceCS__Group__2__Impl"


    // $ANTLR start "rule__ExternalComponentInstanceCS__Group__3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2182:1: rule__ExternalComponentInstanceCS__Group__3 : rule__ExternalComponentInstanceCS__Group__3__Impl ;
    public final void rule__ExternalComponentInstanceCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2186:1: ( rule__ExternalComponentInstanceCS__Group__3__Impl )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2187:2: rule__ExternalComponentInstanceCS__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExternalComponentInstanceCS__Group__3__Impl_in_rule__ExternalComponentInstanceCS__Group__34345);
            rule__ExternalComponentInstanceCS__Group__3__Impl();

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
    // $ANTLR end "rule__ExternalComponentInstanceCS__Group__3"


    // $ANTLR start "rule__ExternalComponentInstanceCS__Group__3__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2193:1: rule__ExternalComponentInstanceCS__Group__3__Impl : ( ( rule__ExternalComponentInstanceCS__TypeAssignment_3 ) ) ;
    public final void rule__ExternalComponentInstanceCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2197:1: ( ( ( rule__ExternalComponentInstanceCS__TypeAssignment_3 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2198:1: ( ( rule__ExternalComponentInstanceCS__TypeAssignment_3 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2198:1: ( ( rule__ExternalComponentInstanceCS__TypeAssignment_3 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2199:1: ( rule__ExternalComponentInstanceCS__TypeAssignment_3 )
            {
             before(grammarAccess.getExternalComponentInstanceCSAccess().getTypeAssignment_3()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2200:1: ( rule__ExternalComponentInstanceCS__TypeAssignment_3 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2200:2: rule__ExternalComponentInstanceCS__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ExternalComponentInstanceCS__TypeAssignment_3_in_rule__ExternalComponentInstanceCS__Group__3__Impl4372);
            rule__ExternalComponentInstanceCS__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExternalComponentInstanceCSAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__ExternalComponentInstanceCS__Group__3__Impl"


    // $ANTLR start "rule__InternalComponentInstanceCS__Group__0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2218:1: rule__InternalComponentInstanceCS__Group__0 : rule__InternalComponentInstanceCS__Group__0__Impl rule__InternalComponentInstanceCS__Group__1 ;
    public final void rule__InternalComponentInstanceCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2222:1: ( rule__InternalComponentInstanceCS__Group__0__Impl rule__InternalComponentInstanceCS__Group__1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2223:2: rule__InternalComponentInstanceCS__Group__0__Impl rule__InternalComponentInstanceCS__Group__1
            {
            pushFollow(FOLLOW_rule__InternalComponentInstanceCS__Group__0__Impl_in_rule__InternalComponentInstanceCS__Group__04410);
            rule__InternalComponentInstanceCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalComponentInstanceCS__Group__1_in_rule__InternalComponentInstanceCS__Group__04413);
            rule__InternalComponentInstanceCS__Group__1();

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
    // $ANTLR end "rule__InternalComponentInstanceCS__Group__0"


    // $ANTLR start "rule__InternalComponentInstanceCS__Group__0__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2230:1: rule__InternalComponentInstanceCS__Group__0__Impl : ( 'internal' ) ;
    public final void rule__InternalComponentInstanceCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2234:1: ( ( 'internal' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2235:1: ( 'internal' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2235:1: ( 'internal' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2236:1: 'internal'
            {
             before(grammarAccess.getInternalComponentInstanceCSAccess().getInternalKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__InternalComponentInstanceCS__Group__0__Impl4441); 
             after(grammarAccess.getInternalComponentInstanceCSAccess().getInternalKeyword_0()); 

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
    // $ANTLR end "rule__InternalComponentInstanceCS__Group__0__Impl"


    // $ANTLR start "rule__InternalComponentInstanceCS__Group__1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2249:1: rule__InternalComponentInstanceCS__Group__1 : rule__InternalComponentInstanceCS__Group__1__Impl rule__InternalComponentInstanceCS__Group__2 ;
    public final void rule__InternalComponentInstanceCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2253:1: ( rule__InternalComponentInstanceCS__Group__1__Impl rule__InternalComponentInstanceCS__Group__2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2254:2: rule__InternalComponentInstanceCS__Group__1__Impl rule__InternalComponentInstanceCS__Group__2
            {
            pushFollow(FOLLOW_rule__InternalComponentInstanceCS__Group__1__Impl_in_rule__InternalComponentInstanceCS__Group__14472);
            rule__InternalComponentInstanceCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalComponentInstanceCS__Group__2_in_rule__InternalComponentInstanceCS__Group__14475);
            rule__InternalComponentInstanceCS__Group__2();

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
    // $ANTLR end "rule__InternalComponentInstanceCS__Group__1"


    // $ANTLR start "rule__InternalComponentInstanceCS__Group__1__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2261:1: rule__InternalComponentInstanceCS__Group__1__Impl : ( ( rule__InternalComponentInstanceCS__NameAssignment_1 ) ) ;
    public final void rule__InternalComponentInstanceCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2265:1: ( ( ( rule__InternalComponentInstanceCS__NameAssignment_1 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2266:1: ( ( rule__InternalComponentInstanceCS__NameAssignment_1 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2266:1: ( ( rule__InternalComponentInstanceCS__NameAssignment_1 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2267:1: ( rule__InternalComponentInstanceCS__NameAssignment_1 )
            {
             before(grammarAccess.getInternalComponentInstanceCSAccess().getNameAssignment_1()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2268:1: ( rule__InternalComponentInstanceCS__NameAssignment_1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2268:2: rule__InternalComponentInstanceCS__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__InternalComponentInstanceCS__NameAssignment_1_in_rule__InternalComponentInstanceCS__Group__1__Impl4502);
            rule__InternalComponentInstanceCS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInternalComponentInstanceCSAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__InternalComponentInstanceCS__Group__1__Impl"


    // $ANTLR start "rule__InternalComponentInstanceCS__Group__2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2278:1: rule__InternalComponentInstanceCS__Group__2 : rule__InternalComponentInstanceCS__Group__2__Impl rule__InternalComponentInstanceCS__Group__3 ;
    public final void rule__InternalComponentInstanceCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2282:1: ( rule__InternalComponentInstanceCS__Group__2__Impl rule__InternalComponentInstanceCS__Group__3 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2283:2: rule__InternalComponentInstanceCS__Group__2__Impl rule__InternalComponentInstanceCS__Group__3
            {
            pushFollow(FOLLOW_rule__InternalComponentInstanceCS__Group__2__Impl_in_rule__InternalComponentInstanceCS__Group__24532);
            rule__InternalComponentInstanceCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalComponentInstanceCS__Group__3_in_rule__InternalComponentInstanceCS__Group__24535);
            rule__InternalComponentInstanceCS__Group__3();

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
    // $ANTLR end "rule__InternalComponentInstanceCS__Group__2"


    // $ANTLR start "rule__InternalComponentInstanceCS__Group__2__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2290:1: rule__InternalComponentInstanceCS__Group__2__Impl : ( ':' ) ;
    public final void rule__InternalComponentInstanceCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2294:1: ( ( ':' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2295:1: ( ':' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2295:1: ( ':' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2296:1: ':'
            {
             before(grammarAccess.getInternalComponentInstanceCSAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__InternalComponentInstanceCS__Group__2__Impl4563); 
             after(grammarAccess.getInternalComponentInstanceCSAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__InternalComponentInstanceCS__Group__2__Impl"


    // $ANTLR start "rule__InternalComponentInstanceCS__Group__3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2309:1: rule__InternalComponentInstanceCS__Group__3 : rule__InternalComponentInstanceCS__Group__3__Impl ;
    public final void rule__InternalComponentInstanceCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2313:1: ( rule__InternalComponentInstanceCS__Group__3__Impl )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2314:2: rule__InternalComponentInstanceCS__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__InternalComponentInstanceCS__Group__3__Impl_in_rule__InternalComponentInstanceCS__Group__34594);
            rule__InternalComponentInstanceCS__Group__3__Impl();

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
    // $ANTLR end "rule__InternalComponentInstanceCS__Group__3"


    // $ANTLR start "rule__InternalComponentInstanceCS__Group__3__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2320:1: rule__InternalComponentInstanceCS__Group__3__Impl : ( ( rule__InternalComponentInstanceCS__TypeAssignment_3 ) ) ;
    public final void rule__InternalComponentInstanceCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2324:1: ( ( ( rule__InternalComponentInstanceCS__TypeAssignment_3 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2325:1: ( ( rule__InternalComponentInstanceCS__TypeAssignment_3 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2325:1: ( ( rule__InternalComponentInstanceCS__TypeAssignment_3 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2326:1: ( rule__InternalComponentInstanceCS__TypeAssignment_3 )
            {
             before(grammarAccess.getInternalComponentInstanceCSAccess().getTypeAssignment_3()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2327:1: ( rule__InternalComponentInstanceCS__TypeAssignment_3 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2327:2: rule__InternalComponentInstanceCS__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__InternalComponentInstanceCS__TypeAssignment_3_in_rule__InternalComponentInstanceCS__Group__3__Impl4621);
            rule__InternalComponentInstanceCS__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInternalComponentInstanceCSAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__InternalComponentInstanceCS__Group__3__Impl"


    // $ANTLR start "rule__RelationshipInstanceCS__Group__0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2345:1: rule__RelationshipInstanceCS__Group__0 : rule__RelationshipInstanceCS__Group__0__Impl rule__RelationshipInstanceCS__Group__1 ;
    public final void rule__RelationshipInstanceCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2349:1: ( rule__RelationshipInstanceCS__Group__0__Impl rule__RelationshipInstanceCS__Group__1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2350:2: rule__RelationshipInstanceCS__Group__0__Impl rule__RelationshipInstanceCS__Group__1
            {
            pushFollow(FOLLOW_rule__RelationshipInstanceCS__Group__0__Impl_in_rule__RelationshipInstanceCS__Group__04659);
            rule__RelationshipInstanceCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipInstanceCS__Group__1_in_rule__RelationshipInstanceCS__Group__04662);
            rule__RelationshipInstanceCS__Group__1();

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
    // $ANTLR end "rule__RelationshipInstanceCS__Group__0"


    // $ANTLR start "rule__RelationshipInstanceCS__Group__0__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2357:1: rule__RelationshipInstanceCS__Group__0__Impl : ( ( rule__RelationshipInstanceCS__NameAssignment_0 ) ) ;
    public final void rule__RelationshipInstanceCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2361:1: ( ( ( rule__RelationshipInstanceCS__NameAssignment_0 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2362:1: ( ( rule__RelationshipInstanceCS__NameAssignment_0 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2362:1: ( ( rule__RelationshipInstanceCS__NameAssignment_0 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2363:1: ( rule__RelationshipInstanceCS__NameAssignment_0 )
            {
             before(grammarAccess.getRelationshipInstanceCSAccess().getNameAssignment_0()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2364:1: ( rule__RelationshipInstanceCS__NameAssignment_0 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2364:2: rule__RelationshipInstanceCS__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__RelationshipInstanceCS__NameAssignment_0_in_rule__RelationshipInstanceCS__Group__0__Impl4689);
            rule__RelationshipInstanceCS__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipInstanceCSAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__RelationshipInstanceCS__Group__0__Impl"


    // $ANTLR start "rule__RelationshipInstanceCS__Group__1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2374:1: rule__RelationshipInstanceCS__Group__1 : rule__RelationshipInstanceCS__Group__1__Impl rule__RelationshipInstanceCS__Group__2 ;
    public final void rule__RelationshipInstanceCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2378:1: ( rule__RelationshipInstanceCS__Group__1__Impl rule__RelationshipInstanceCS__Group__2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2379:2: rule__RelationshipInstanceCS__Group__1__Impl rule__RelationshipInstanceCS__Group__2
            {
            pushFollow(FOLLOW_rule__RelationshipInstanceCS__Group__1__Impl_in_rule__RelationshipInstanceCS__Group__14719);
            rule__RelationshipInstanceCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipInstanceCS__Group__2_in_rule__RelationshipInstanceCS__Group__14722);
            rule__RelationshipInstanceCS__Group__2();

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
    // $ANTLR end "rule__RelationshipInstanceCS__Group__1"


    // $ANTLR start "rule__RelationshipInstanceCS__Group__1__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2386:1: rule__RelationshipInstanceCS__Group__1__Impl : ( ':' ) ;
    public final void rule__RelationshipInstanceCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2390:1: ( ( ':' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2391:1: ( ':' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2391:1: ( ':' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2392:1: ':'
            {
             before(grammarAccess.getRelationshipInstanceCSAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__RelationshipInstanceCS__Group__1__Impl4750); 
             after(grammarAccess.getRelationshipInstanceCSAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__RelationshipInstanceCS__Group__1__Impl"


    // $ANTLR start "rule__RelationshipInstanceCS__Group__2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2405:1: rule__RelationshipInstanceCS__Group__2 : rule__RelationshipInstanceCS__Group__2__Impl rule__RelationshipInstanceCS__Group__3 ;
    public final void rule__RelationshipInstanceCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2409:1: ( rule__RelationshipInstanceCS__Group__2__Impl rule__RelationshipInstanceCS__Group__3 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2410:2: rule__RelationshipInstanceCS__Group__2__Impl rule__RelationshipInstanceCS__Group__3
            {
            pushFollow(FOLLOW_rule__RelationshipInstanceCS__Group__2__Impl_in_rule__RelationshipInstanceCS__Group__24781);
            rule__RelationshipInstanceCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipInstanceCS__Group__3_in_rule__RelationshipInstanceCS__Group__24784);
            rule__RelationshipInstanceCS__Group__3();

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
    // $ANTLR end "rule__RelationshipInstanceCS__Group__2"


    // $ANTLR start "rule__RelationshipInstanceCS__Group__2__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2417:1: rule__RelationshipInstanceCS__Group__2__Impl : ( ( rule__RelationshipInstanceCS__TypeAssignment_2 ) ) ;
    public final void rule__RelationshipInstanceCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2421:1: ( ( ( rule__RelationshipInstanceCS__TypeAssignment_2 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2422:1: ( ( rule__RelationshipInstanceCS__TypeAssignment_2 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2422:1: ( ( rule__RelationshipInstanceCS__TypeAssignment_2 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2423:1: ( rule__RelationshipInstanceCS__TypeAssignment_2 )
            {
             before(grammarAccess.getRelationshipInstanceCSAccess().getTypeAssignment_2()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2424:1: ( rule__RelationshipInstanceCS__TypeAssignment_2 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2424:2: rule__RelationshipInstanceCS__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__RelationshipInstanceCS__TypeAssignment_2_in_rule__RelationshipInstanceCS__Group__2__Impl4811);
            rule__RelationshipInstanceCS__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipInstanceCSAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__RelationshipInstanceCS__Group__2__Impl"


    // $ANTLR start "rule__RelationshipInstanceCS__Group__3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2434:1: rule__RelationshipInstanceCS__Group__3 : rule__RelationshipInstanceCS__Group__3__Impl rule__RelationshipInstanceCS__Group__4 ;
    public final void rule__RelationshipInstanceCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2438:1: ( rule__RelationshipInstanceCS__Group__3__Impl rule__RelationshipInstanceCS__Group__4 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2439:2: rule__RelationshipInstanceCS__Group__3__Impl rule__RelationshipInstanceCS__Group__4
            {
            pushFollow(FOLLOW_rule__RelationshipInstanceCS__Group__3__Impl_in_rule__RelationshipInstanceCS__Group__34841);
            rule__RelationshipInstanceCS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipInstanceCS__Group__4_in_rule__RelationshipInstanceCS__Group__34844);
            rule__RelationshipInstanceCS__Group__4();

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
    // $ANTLR end "rule__RelationshipInstanceCS__Group__3"


    // $ANTLR start "rule__RelationshipInstanceCS__Group__3__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2446:1: rule__RelationshipInstanceCS__Group__3__Impl : ( ':' ) ;
    public final void rule__RelationshipInstanceCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2450:1: ( ( ':' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2451:1: ( ':' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2451:1: ( ':' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2452:1: ':'
            {
             before(grammarAccess.getRelationshipInstanceCSAccess().getColonKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__RelationshipInstanceCS__Group__3__Impl4872); 
             after(grammarAccess.getRelationshipInstanceCSAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__RelationshipInstanceCS__Group__3__Impl"


    // $ANTLR start "rule__RelationshipInstanceCS__Group__4"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2465:1: rule__RelationshipInstanceCS__Group__4 : rule__RelationshipInstanceCS__Group__4__Impl rule__RelationshipInstanceCS__Group__5 ;
    public final void rule__RelationshipInstanceCS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2469:1: ( rule__RelationshipInstanceCS__Group__4__Impl rule__RelationshipInstanceCS__Group__5 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2470:2: rule__RelationshipInstanceCS__Group__4__Impl rule__RelationshipInstanceCS__Group__5
            {
            pushFollow(FOLLOW_rule__RelationshipInstanceCS__Group__4__Impl_in_rule__RelationshipInstanceCS__Group__44903);
            rule__RelationshipInstanceCS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipInstanceCS__Group__5_in_rule__RelationshipInstanceCS__Group__44906);
            rule__RelationshipInstanceCS__Group__5();

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
    // $ANTLR end "rule__RelationshipInstanceCS__Group__4"


    // $ANTLR start "rule__RelationshipInstanceCS__Group__4__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2477:1: rule__RelationshipInstanceCS__Group__4__Impl : ( ( rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_4 ) ) ;
    public final void rule__RelationshipInstanceCS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2481:1: ( ( ( rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_4 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2482:1: ( ( rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_4 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2482:1: ( ( rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_4 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2483:1: ( rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_4 )
            {
             before(grammarAccess.getRelationshipInstanceCSAccess().getRequiredPortInstanceAssignment_4()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2484:1: ( rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_4 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2484:2: rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_4
            {
            pushFollow(FOLLOW_rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_4_in_rule__RelationshipInstanceCS__Group__4__Impl4933);
            rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipInstanceCSAccess().getRequiredPortInstanceAssignment_4()); 

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
    // $ANTLR end "rule__RelationshipInstanceCS__Group__4__Impl"


    // $ANTLR start "rule__RelationshipInstanceCS__Group__5"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2494:1: rule__RelationshipInstanceCS__Group__5 : rule__RelationshipInstanceCS__Group__5__Impl rule__RelationshipInstanceCS__Group__6 ;
    public final void rule__RelationshipInstanceCS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2498:1: ( rule__RelationshipInstanceCS__Group__5__Impl rule__RelationshipInstanceCS__Group__6 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2499:2: rule__RelationshipInstanceCS__Group__5__Impl rule__RelationshipInstanceCS__Group__6
            {
            pushFollow(FOLLOW_rule__RelationshipInstanceCS__Group__5__Impl_in_rule__RelationshipInstanceCS__Group__54963);
            rule__RelationshipInstanceCS__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationshipInstanceCS__Group__6_in_rule__RelationshipInstanceCS__Group__54966);
            rule__RelationshipInstanceCS__Group__6();

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
    // $ANTLR end "rule__RelationshipInstanceCS__Group__5"


    // $ANTLR start "rule__RelationshipInstanceCS__Group__5__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2506:1: rule__RelationshipInstanceCS__Group__5__Impl : ( '=>' ) ;
    public final void rule__RelationshipInstanceCS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2510:1: ( ( '=>' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2511:1: ( '=>' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2511:1: ( '=>' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2512:1: '=>'
            {
             before(grammarAccess.getRelationshipInstanceCSAccess().getEqualsSignGreaterThanSignKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__RelationshipInstanceCS__Group__5__Impl4994); 
             after(grammarAccess.getRelationshipInstanceCSAccess().getEqualsSignGreaterThanSignKeyword_5()); 

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
    // $ANTLR end "rule__RelationshipInstanceCS__Group__5__Impl"


    // $ANTLR start "rule__RelationshipInstanceCS__Group__6"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2525:1: rule__RelationshipInstanceCS__Group__6 : rule__RelationshipInstanceCS__Group__6__Impl ;
    public final void rule__RelationshipInstanceCS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2529:1: ( rule__RelationshipInstanceCS__Group__6__Impl )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2530:2: rule__RelationshipInstanceCS__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__RelationshipInstanceCS__Group__6__Impl_in_rule__RelationshipInstanceCS__Group__65025);
            rule__RelationshipInstanceCS__Group__6__Impl();

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
    // $ANTLR end "rule__RelationshipInstanceCS__Group__6"


    // $ANTLR start "rule__RelationshipInstanceCS__Group__6__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2536:1: rule__RelationshipInstanceCS__Group__6__Impl : ( ( rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_6 ) ) ;
    public final void rule__RelationshipInstanceCS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2540:1: ( ( ( rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_6 ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2541:1: ( ( rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_6 ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2541:1: ( ( rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_6 ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2542:1: ( rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_6 )
            {
             before(grammarAccess.getRelationshipInstanceCSAccess().getProvidedPortInstanceAssignment_6()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2543:1: ( rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_6 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2543:2: rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_6
            {
            pushFollow(FOLLOW_rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_6_in_rule__RelationshipInstanceCS__Group__6__Impl5052);
            rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipInstanceCSAccess().getProvidedPortInstanceAssignment_6()); 

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
    // $ANTLR end "rule__RelationshipInstanceCS__Group__6__Impl"


    // $ANTLR start "rule__Fqn__Group__0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2567:1: rule__Fqn__Group__0 : rule__Fqn__Group__0__Impl rule__Fqn__Group__1 ;
    public final void rule__Fqn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2571:1: ( rule__Fqn__Group__0__Impl rule__Fqn__Group__1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2572:2: rule__Fqn__Group__0__Impl rule__Fqn__Group__1
            {
            pushFollow(FOLLOW_rule__Fqn__Group__0__Impl_in_rule__Fqn__Group__05096);
            rule__Fqn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fqn__Group__1_in_rule__Fqn__Group__05099);
            rule__Fqn__Group__1();

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
    // $ANTLR end "rule__Fqn__Group__0"


    // $ANTLR start "rule__Fqn__Group__0__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2579:1: rule__Fqn__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Fqn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2583:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2584:1: ( RULE_ID )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2584:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2585:1: RULE_ID
            {
             before(grammarAccess.getFqnAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fqn__Group__0__Impl5126); 
             after(grammarAccess.getFqnAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Fqn__Group__0__Impl"


    // $ANTLR start "rule__Fqn__Group__1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2596:1: rule__Fqn__Group__1 : rule__Fqn__Group__1__Impl ;
    public final void rule__Fqn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2600:1: ( rule__Fqn__Group__1__Impl )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2601:2: rule__Fqn__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Fqn__Group__1__Impl_in_rule__Fqn__Group__15155);
            rule__Fqn__Group__1__Impl();

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
    // $ANTLR end "rule__Fqn__Group__1"


    // $ANTLR start "rule__Fqn__Group__1__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2607:1: rule__Fqn__Group__1__Impl : ( ( rule__Fqn__Group_1__0 )* ) ;
    public final void rule__Fqn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2611:1: ( ( ( rule__Fqn__Group_1__0 )* ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2612:1: ( ( rule__Fqn__Group_1__0 )* )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2612:1: ( ( rule__Fqn__Group_1__0 )* )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2613:1: ( rule__Fqn__Group_1__0 )*
            {
             before(grammarAccess.getFqnAccess().getGroup_1()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2614:1: ( rule__Fqn__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2614:2: rule__Fqn__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Fqn__Group_1__0_in_rule__Fqn__Group__1__Impl5182);
            	    rule__Fqn__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getFqnAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Fqn__Group__1__Impl"


    // $ANTLR start "rule__Fqn__Group_1__0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2628:1: rule__Fqn__Group_1__0 : rule__Fqn__Group_1__0__Impl rule__Fqn__Group_1__1 ;
    public final void rule__Fqn__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2632:1: ( rule__Fqn__Group_1__0__Impl rule__Fqn__Group_1__1 )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2633:2: rule__Fqn__Group_1__0__Impl rule__Fqn__Group_1__1
            {
            pushFollow(FOLLOW_rule__Fqn__Group_1__0__Impl_in_rule__Fqn__Group_1__05217);
            rule__Fqn__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fqn__Group_1__1_in_rule__Fqn__Group_1__05220);
            rule__Fqn__Group_1__1();

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
    // $ANTLR end "rule__Fqn__Group_1__0"


    // $ANTLR start "rule__Fqn__Group_1__0__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2640:1: rule__Fqn__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Fqn__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2644:1: ( ( '.' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2645:1: ( '.' )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2645:1: ( '.' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2646:1: '.'
            {
             before(grammarAccess.getFqnAccess().getFullStopKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Fqn__Group_1__0__Impl5248); 
             after(grammarAccess.getFqnAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__Fqn__Group_1__0__Impl"


    // $ANTLR start "rule__Fqn__Group_1__1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2659:1: rule__Fqn__Group_1__1 : rule__Fqn__Group_1__1__Impl ;
    public final void rule__Fqn__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2663:1: ( rule__Fqn__Group_1__1__Impl )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2664:2: rule__Fqn__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Fqn__Group_1__1__Impl_in_rule__Fqn__Group_1__15279);
            rule__Fqn__Group_1__1__Impl();

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
    // $ANTLR end "rule__Fqn__Group_1__1"


    // $ANTLR start "rule__Fqn__Group_1__1__Impl"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2670:1: rule__Fqn__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Fqn__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2674:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2675:1: ( RULE_ID )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2675:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2676:1: RULE_ID
            {
             before(grammarAccess.getFqnAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fqn__Group_1__1__Impl5306); 
             after(grammarAccess.getFqnAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Fqn__Group_1__1__Impl"


    // $ANTLR start "rule__CloudMLRoot__NameAssignment_1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2692:1: rule__CloudMLRoot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CloudMLRoot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2696:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2697:1: ( RULE_ID )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2697:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2698:1: RULE_ID
            {
             before(grammarAccess.getCloudMLRootAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CloudMLRoot__NameAssignment_15344); 
             after(grammarAccess.getCloudMLRootAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CloudMLRoot__NameAssignment_1"


    // $ANTLR start "rule__CloudMLRoot__ProvidersAssignment_2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2707:1: rule__CloudMLRoot__ProvidersAssignment_2 : ( ruleProviderCS ) ;
    public final void rule__CloudMLRoot__ProvidersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2711:1: ( ( ruleProviderCS ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2712:1: ( ruleProviderCS )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2712:1: ( ruleProviderCS )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2713:1: ruleProviderCS
            {
             before(grammarAccess.getCloudMLRootAccess().getProvidersProviderCSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProviderCS_in_rule__CloudMLRoot__ProvidersAssignment_25375);
            ruleProviderCS();

            state._fsp--;

             after(grammarAccess.getCloudMLRootAccess().getProvidersProviderCSParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CloudMLRoot__ProvidersAssignment_2"


    // $ANTLR start "rule__CloudMLRoot__VmsAssignment_5_0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2722:1: rule__CloudMLRoot__VmsAssignment_5_0 : ( ruleVMCS ) ;
    public final void rule__CloudMLRoot__VmsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2726:1: ( ( ruleVMCS ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2727:1: ( ruleVMCS )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2727:1: ( ruleVMCS )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2728:1: ruleVMCS
            {
             before(grammarAccess.getCloudMLRootAccess().getVmsVMCSParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleVMCS_in_rule__CloudMLRoot__VmsAssignment_5_05406);
            ruleVMCS();

            state._fsp--;

             after(grammarAccess.getCloudMLRootAccess().getVmsVMCSParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__CloudMLRoot__VmsAssignment_5_0"


    // $ANTLR start "rule__CloudMLRoot__InternalComponentsAssignment_5_1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2737:1: rule__CloudMLRoot__InternalComponentsAssignment_5_1 : ( ruleInternalComponentCS ) ;
    public final void rule__CloudMLRoot__InternalComponentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2741:1: ( ( ruleInternalComponentCS ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2742:1: ( ruleInternalComponentCS )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2742:1: ( ruleInternalComponentCS )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2743:1: ruleInternalComponentCS
            {
             before(grammarAccess.getCloudMLRootAccess().getInternalComponentsInternalComponentCSParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleInternalComponentCS_in_rule__CloudMLRoot__InternalComponentsAssignment_5_15437);
            ruleInternalComponentCS();

            state._fsp--;

             after(grammarAccess.getCloudMLRootAccess().getInternalComponentsInternalComponentCSParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__CloudMLRoot__InternalComponentsAssignment_5_1"


    // $ANTLR start "rule__CloudMLRoot__ExternalComponentsAssignment_5_2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2752:1: rule__CloudMLRoot__ExternalComponentsAssignment_5_2 : ( ruleExternalComponentCS ) ;
    public final void rule__CloudMLRoot__ExternalComponentsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2756:1: ( ( ruleExternalComponentCS ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2757:1: ( ruleExternalComponentCS )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2757:1: ( ruleExternalComponentCS )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2758:1: ruleExternalComponentCS
            {
             before(grammarAccess.getCloudMLRootAccess().getExternalComponentsExternalComponentCSParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleExternalComponentCS_in_rule__CloudMLRoot__ExternalComponentsAssignment_5_25468);
            ruleExternalComponentCS();

            state._fsp--;

             after(grammarAccess.getCloudMLRootAccess().getExternalComponentsExternalComponentCSParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__CloudMLRoot__ExternalComponentsAssignment_5_2"


    // $ANTLR start "rule__CloudMLRoot__RelationshipsAssignment_6"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2767:1: rule__CloudMLRoot__RelationshipsAssignment_6 : ( ruleRelationshipCS ) ;
    public final void rule__CloudMLRoot__RelationshipsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2771:1: ( ( ruleRelationshipCS ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2772:1: ( ruleRelationshipCS )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2772:1: ( ruleRelationshipCS )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2773:1: ruleRelationshipCS
            {
             before(grammarAccess.getCloudMLRootAccess().getRelationshipsRelationshipCSParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRelationshipCS_in_rule__CloudMLRoot__RelationshipsAssignment_65499);
            ruleRelationshipCS();

            state._fsp--;

             after(grammarAccess.getCloudMLRootAccess().getRelationshipsRelationshipCSParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__CloudMLRoot__RelationshipsAssignment_6"


    // $ANTLR start "rule__CloudMLRoot__ComponentInstancesAssignment_10_0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2782:1: rule__CloudMLRoot__ComponentInstancesAssignment_10_0 : ( ruleInternalComponentInstanceCS ) ;
    public final void rule__CloudMLRoot__ComponentInstancesAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2786:1: ( ( ruleInternalComponentInstanceCS ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2787:1: ( ruleInternalComponentInstanceCS )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2787:1: ( ruleInternalComponentInstanceCS )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2788:1: ruleInternalComponentInstanceCS
            {
             before(grammarAccess.getCloudMLRootAccess().getComponentInstancesInternalComponentInstanceCSParserRuleCall_10_0_0()); 
            pushFollow(FOLLOW_ruleInternalComponentInstanceCS_in_rule__CloudMLRoot__ComponentInstancesAssignment_10_05530);
            ruleInternalComponentInstanceCS();

            state._fsp--;

             after(grammarAccess.getCloudMLRootAccess().getComponentInstancesInternalComponentInstanceCSParserRuleCall_10_0_0()); 

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
    // $ANTLR end "rule__CloudMLRoot__ComponentInstancesAssignment_10_0"


    // $ANTLR start "rule__CloudMLRoot__ComponentInstancesAssignment_10_1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2797:1: rule__CloudMLRoot__ComponentInstancesAssignment_10_1 : ( ruleExternalComponentInstanceCS ) ;
    public final void rule__CloudMLRoot__ComponentInstancesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2801:1: ( ( ruleExternalComponentInstanceCS ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2802:1: ( ruleExternalComponentInstanceCS )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2802:1: ( ruleExternalComponentInstanceCS )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2803:1: ruleExternalComponentInstanceCS
            {
             before(grammarAccess.getCloudMLRootAccess().getComponentInstancesExternalComponentInstanceCSParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_ruleExternalComponentInstanceCS_in_rule__CloudMLRoot__ComponentInstancesAssignment_10_15561);
            ruleExternalComponentInstanceCS();

            state._fsp--;

             after(grammarAccess.getCloudMLRootAccess().getComponentInstancesExternalComponentInstanceCSParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__CloudMLRoot__ComponentInstancesAssignment_10_1"


    // $ANTLR start "rule__CloudMLRoot__RelationshipInstancesAssignment_11"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2812:1: rule__CloudMLRoot__RelationshipInstancesAssignment_11 : ( ruleRelationshipInstanceCS ) ;
    public final void rule__CloudMLRoot__RelationshipInstancesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2816:1: ( ( ruleRelationshipInstanceCS ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2817:1: ( ruleRelationshipInstanceCS )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2817:1: ( ruleRelationshipInstanceCS )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2818:1: ruleRelationshipInstanceCS
            {
             before(grammarAccess.getCloudMLRootAccess().getRelationshipInstancesRelationshipInstanceCSParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleRelationshipInstanceCS_in_rule__CloudMLRoot__RelationshipInstancesAssignment_115592);
            ruleRelationshipInstanceCS();

            state._fsp--;

             after(grammarAccess.getCloudMLRootAccess().getRelationshipInstancesRelationshipInstanceCSParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__CloudMLRoot__RelationshipInstancesAssignment_11"


    // $ANTLR start "rule__ProviderCS__NameAssignment_1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2827:1: rule__ProviderCS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProviderCS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2831:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2832:1: ( RULE_ID )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2832:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2833:1: RULE_ID
            {
             before(grammarAccess.getProviderCSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProviderCS__NameAssignment_15623); 
             after(grammarAccess.getProviderCSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ProviderCS__NameAssignment_1"


    // $ANTLR start "rule__ProviderCS__CredentialsAssignment_3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2842:1: rule__ProviderCS__CredentialsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ProviderCS__CredentialsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2846:1: ( ( RULE_STRING ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2847:1: ( RULE_STRING )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2847:1: ( RULE_STRING )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2848:1: RULE_STRING
            {
             before(grammarAccess.getProviderCSAccess().getCredentialsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ProviderCS__CredentialsAssignment_35654); 
             after(grammarAccess.getProviderCSAccess().getCredentialsSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ProviderCS__CredentialsAssignment_3"


    // $ANTLR start "rule__VMCS__NameAssignment_1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2857:1: rule__VMCS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VMCS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2861:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2862:1: ( RULE_ID )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2862:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2863:1: RULE_ID
            {
             before(grammarAccess.getVMCSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VMCS__NameAssignment_15685); 
             after(grammarAccess.getVMCSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VMCS__NameAssignment_1"


    // $ANTLR start "rule__VMCS__ProvidedAssignment_3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2872:1: rule__VMCS__ProvidedAssignment_3 : ( ruleVMPortCS ) ;
    public final void rule__VMCS__ProvidedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2876:1: ( ( ruleVMPortCS ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2877:1: ( ruleVMPortCS )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2877:1: ( ruleVMPortCS )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2878:1: ruleVMPortCS
            {
             before(grammarAccess.getVMCSAccess().getProvidedVMPortCSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVMPortCS_in_rule__VMCS__ProvidedAssignment_35716);
            ruleVMPortCS();

            state._fsp--;

             after(grammarAccess.getVMCSAccess().getProvidedVMPortCSParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__VMCS__ProvidedAssignment_3"


    // $ANTLR start "rule__VMPortCS__NameAssignment"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2887:1: rule__VMPortCS__NameAssignment : ( RULE_ID ) ;
    public final void rule__VMPortCS__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2891:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2892:1: ( RULE_ID )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2892:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2893:1: RULE_ID
            {
             before(grammarAccess.getVMPortCSAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VMPortCS__NameAssignment5747); 
             after(grammarAccess.getVMPortCSAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__VMPortCS__NameAssignment"


    // $ANTLR start "rule__ExternalComponentCS__NameAssignment_1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2902:1: rule__ExternalComponentCS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalComponentCS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2906:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2907:1: ( RULE_ID )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2907:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2908:1: RULE_ID
            {
             before(grammarAccess.getExternalComponentCSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalComponentCS__NameAssignment_15778); 
             after(grammarAccess.getExternalComponentCSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExternalComponentCS__NameAssignment_1"


    // $ANTLR start "rule__ExternalComponentCS__ProvidedPortsAssignment_3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2917:1: rule__ExternalComponentCS__ProvidedPortsAssignment_3 : ( ruleProvidedPortCS ) ;
    public final void rule__ExternalComponentCS__ProvidedPortsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2921:1: ( ( ruleProvidedPortCS ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2922:1: ( ruleProvidedPortCS )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2922:1: ( ruleProvidedPortCS )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2923:1: ruleProvidedPortCS
            {
             before(grammarAccess.getExternalComponentCSAccess().getProvidedPortsProvidedPortCSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProvidedPortCS_in_rule__ExternalComponentCS__ProvidedPortsAssignment_35809);
            ruleProvidedPortCS();

            state._fsp--;

             after(grammarAccess.getExternalComponentCSAccess().getProvidedPortsProvidedPortCSParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ExternalComponentCS__ProvidedPortsAssignment_3"


    // $ANTLR start "rule__ProvidedPortCS__IsLocalAssignment_1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2932:1: rule__ProvidedPortCS__IsLocalAssignment_1 : ( ( 'local' ) ) ;
    public final void rule__ProvidedPortCS__IsLocalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2936:1: ( ( ( 'local' ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2937:1: ( ( 'local' ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2937:1: ( ( 'local' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2938:1: ( 'local' )
            {
             before(grammarAccess.getProvidedPortCSAccess().getIsLocalLocalKeyword_1_0()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2939:1: ( 'local' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2940:1: 'local'
            {
             before(grammarAccess.getProvidedPortCSAccess().getIsLocalLocalKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__ProvidedPortCS__IsLocalAssignment_15845); 
             after(grammarAccess.getProvidedPortCSAccess().getIsLocalLocalKeyword_1_0()); 

            }

             after(grammarAccess.getProvidedPortCSAccess().getIsLocalLocalKeyword_1_0()); 

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
    // $ANTLR end "rule__ProvidedPortCS__IsLocalAssignment_1"


    // $ANTLR start "rule__ProvidedPortCS__NameAssignment_2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2955:1: rule__ProvidedPortCS__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ProvidedPortCS__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2959:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2960:1: ( RULE_ID )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2960:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2961:1: RULE_ID
            {
             before(grammarAccess.getProvidedPortCSAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProvidedPortCS__NameAssignment_25884); 
             after(grammarAccess.getProvidedPortCSAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ProvidedPortCS__NameAssignment_2"


    // $ANTLR start "rule__ProvidedPortCS__ComponentAssignment_3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2970:1: rule__ProvidedPortCS__ComponentAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ProvidedPortCS__ComponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2974:1: ( ( ( RULE_ID ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2975:1: ( ( RULE_ID ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2975:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2976:1: ( RULE_ID )
            {
             before(grammarAccess.getProvidedPortCSAccess().getComponentComponentCrossReference_3_0()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2977:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2978:1: RULE_ID
            {
             before(grammarAccess.getProvidedPortCSAccess().getComponentComponentIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProvidedPortCS__ComponentAssignment_35919); 
             after(grammarAccess.getProvidedPortCSAccess().getComponentComponentIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getProvidedPortCSAccess().getComponentComponentCrossReference_3_0()); 

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
    // $ANTLR end "rule__ProvidedPortCS__ComponentAssignment_3"


    // $ANTLR start "rule__InternalComponentCS__NameAssignment_1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2989:1: rule__InternalComponentCS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InternalComponentCS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2993:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2994:1: ( RULE_ID )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2994:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:2995:1: RULE_ID
            {
             before(grammarAccess.getInternalComponentCSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InternalComponentCS__NameAssignment_15954); 
             after(grammarAccess.getInternalComponentCSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__InternalComponentCS__NameAssignment_1"


    // $ANTLR start "rule__InternalComponentCS__ProvidedPortsAssignment_3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3004:1: rule__InternalComponentCS__ProvidedPortsAssignment_3 : ( ruleProvidedPortCS ) ;
    public final void rule__InternalComponentCS__ProvidedPortsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3008:1: ( ( ruleProvidedPortCS ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3009:1: ( ruleProvidedPortCS )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3009:1: ( ruleProvidedPortCS )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3010:1: ruleProvidedPortCS
            {
             before(grammarAccess.getInternalComponentCSAccess().getProvidedPortsProvidedPortCSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProvidedPortCS_in_rule__InternalComponentCS__ProvidedPortsAssignment_35985);
            ruleProvidedPortCS();

            state._fsp--;

             after(grammarAccess.getInternalComponentCSAccess().getProvidedPortsProvidedPortCSParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__InternalComponentCS__ProvidedPortsAssignment_3"


    // $ANTLR start "rule__InternalComponentCS__RequiredPortsAssignment_4"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3019:1: rule__InternalComponentCS__RequiredPortsAssignment_4 : ( ruleRequiredPortCS ) ;
    public final void rule__InternalComponentCS__RequiredPortsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3023:1: ( ( ruleRequiredPortCS ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3024:1: ( ruleRequiredPortCS )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3024:1: ( ruleRequiredPortCS )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3025:1: ruleRequiredPortCS
            {
             before(grammarAccess.getInternalComponentCSAccess().getRequiredPortsRequiredPortCSParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRequiredPortCS_in_rule__InternalComponentCS__RequiredPortsAssignment_46016);
            ruleRequiredPortCS();

            state._fsp--;

             after(grammarAccess.getInternalComponentCSAccess().getRequiredPortsRequiredPortCSParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__InternalComponentCS__RequiredPortsAssignment_4"


    // $ANTLR start "rule__InternalComponentCS__RequiredExecutionPlatformAssignment_5"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3034:1: rule__InternalComponentCS__RequiredExecutionPlatformAssignment_5 : ( ruleRequiredExecutionPlatformCS ) ;
    public final void rule__InternalComponentCS__RequiredExecutionPlatformAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3038:1: ( ( ruleRequiredExecutionPlatformCS ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3039:1: ( ruleRequiredExecutionPlatformCS )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3039:1: ( ruleRequiredExecutionPlatformCS )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3040:1: ruleRequiredExecutionPlatformCS
            {
             before(grammarAccess.getInternalComponentCSAccess().getRequiredExecutionPlatformRequiredExecutionPlatformCSParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleRequiredExecutionPlatformCS_in_rule__InternalComponentCS__RequiredExecutionPlatformAssignment_56047);
            ruleRequiredExecutionPlatformCS();

            state._fsp--;

             after(grammarAccess.getInternalComponentCSAccess().getRequiredExecutionPlatformRequiredExecutionPlatformCSParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__InternalComponentCS__RequiredExecutionPlatformAssignment_5"


    // $ANTLR start "rule__RequiredPortCS__IsMandatoryAssignment_1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3049:1: rule__RequiredPortCS__IsMandatoryAssignment_1 : ( ( 'mandatory' ) ) ;
    public final void rule__RequiredPortCS__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3053:1: ( ( ( 'mandatory' ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3054:1: ( ( 'mandatory' ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3054:1: ( ( 'mandatory' ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3055:1: ( 'mandatory' )
            {
             before(grammarAccess.getRequiredPortCSAccess().getIsMandatoryMandatoryKeyword_1_0()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3056:1: ( 'mandatory' )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3057:1: 'mandatory'
            {
             before(grammarAccess.getRequiredPortCSAccess().getIsMandatoryMandatoryKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__RequiredPortCS__IsMandatoryAssignment_16083); 
             after(grammarAccess.getRequiredPortCSAccess().getIsMandatoryMandatoryKeyword_1_0()); 

            }

             after(grammarAccess.getRequiredPortCSAccess().getIsMandatoryMandatoryKeyword_1_0()); 

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
    // $ANTLR end "rule__RequiredPortCS__IsMandatoryAssignment_1"


    // $ANTLR start "rule__RequiredPortCS__NameAssignment_2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3072:1: rule__RequiredPortCS__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RequiredPortCS__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3076:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3077:1: ( RULE_ID )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3077:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3078:1: RULE_ID
            {
             before(grammarAccess.getRequiredPortCSAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequiredPortCS__NameAssignment_26122); 
             after(grammarAccess.getRequiredPortCSAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RequiredPortCS__NameAssignment_2"


    // $ANTLR start "rule__RequiredPortCS__ComponentAssignment_3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3087:1: rule__RequiredPortCS__ComponentAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredPortCS__ComponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3091:1: ( ( ( RULE_ID ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3092:1: ( ( RULE_ID ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3092:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3093:1: ( RULE_ID )
            {
             before(grammarAccess.getRequiredPortCSAccess().getComponentComponentCrossReference_3_0()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3094:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3095:1: RULE_ID
            {
             before(grammarAccess.getRequiredPortCSAccess().getComponentComponentIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequiredPortCS__ComponentAssignment_36157); 
             after(grammarAccess.getRequiredPortCSAccess().getComponentComponentIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRequiredPortCSAccess().getComponentComponentCrossReference_3_0()); 

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
    // $ANTLR end "rule__RequiredPortCS__ComponentAssignment_3"


    // $ANTLR start "rule__RequiredExecutionPlatformCS__NameAssignment_1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3106:1: rule__RequiredExecutionPlatformCS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RequiredExecutionPlatformCS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3110:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3111:1: ( RULE_ID )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3111:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3112:1: RULE_ID
            {
             before(grammarAccess.getRequiredExecutionPlatformCSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequiredExecutionPlatformCS__NameAssignment_16192); 
             after(grammarAccess.getRequiredExecutionPlatformCSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RequiredExecutionPlatformCS__NameAssignment_1"


    // $ANTLR start "rule__RequiredExecutionPlatformCS__OwnerAssignment_2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3121:1: rule__RequiredExecutionPlatformCS__OwnerAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredExecutionPlatformCS__OwnerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3125:1: ( ( ( RULE_ID ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3126:1: ( ( RULE_ID ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3126:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3127:1: ( RULE_ID )
            {
             before(grammarAccess.getRequiredExecutionPlatformCSAccess().getOwnerComponentCrossReference_2_0()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3128:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3129:1: RULE_ID
            {
             before(grammarAccess.getRequiredExecutionPlatformCSAccess().getOwnerComponentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequiredExecutionPlatformCS__OwnerAssignment_26227); 
             after(grammarAccess.getRequiredExecutionPlatformCSAccess().getOwnerComponentIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRequiredExecutionPlatformCSAccess().getOwnerComponentCrossReference_2_0()); 

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
    // $ANTLR end "rule__RequiredExecutionPlatformCS__OwnerAssignment_2"


    // $ANTLR start "rule__RelationshipCS__NameAssignment_0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3140:1: rule__RelationshipCS__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RelationshipCS__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3144:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3145:1: ( RULE_ID )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3145:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3146:1: RULE_ID
            {
             before(grammarAccess.getRelationshipCSAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RelationshipCS__NameAssignment_06262); 
             after(grammarAccess.getRelationshipCSAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__RelationshipCS__NameAssignment_0"


    // $ANTLR start "rule__RelationshipCS__RequiredPortAssignment_2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3155:1: rule__RelationshipCS__RequiredPortAssignment_2 : ( ( ruleFqn ) ) ;
    public final void rule__RelationshipCS__RequiredPortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3159:1: ( ( ( ruleFqn ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3160:1: ( ( ruleFqn ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3160:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3161:1: ( ruleFqn )
            {
             before(grammarAccess.getRelationshipCSAccess().getRequiredPortRequiredPortCrossReference_2_0()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3162:1: ( ruleFqn )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3163:1: ruleFqn
            {
             before(grammarAccess.getRelationshipCSAccess().getRequiredPortRequiredPortFqnParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleFqn_in_rule__RelationshipCS__RequiredPortAssignment_26297);
            ruleFqn();

            state._fsp--;

             after(grammarAccess.getRelationshipCSAccess().getRequiredPortRequiredPortFqnParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRelationshipCSAccess().getRequiredPortRequiredPortCrossReference_2_0()); 

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
    // $ANTLR end "rule__RelationshipCS__RequiredPortAssignment_2"


    // $ANTLR start "rule__RelationshipCS__ProvidedPortAssignment_4"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3174:1: rule__RelationshipCS__ProvidedPortAssignment_4 : ( ( ruleFqn ) ) ;
    public final void rule__RelationshipCS__ProvidedPortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3178:1: ( ( ( ruleFqn ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3179:1: ( ( ruleFqn ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3179:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3180:1: ( ruleFqn )
            {
             before(grammarAccess.getRelationshipCSAccess().getProvidedPortProvidedPortCrossReference_4_0()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3181:1: ( ruleFqn )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3182:1: ruleFqn
            {
             before(grammarAccess.getRelationshipCSAccess().getProvidedPortProvidedPortFqnParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleFqn_in_rule__RelationshipCS__ProvidedPortAssignment_46336);
            ruleFqn();

            state._fsp--;

             after(grammarAccess.getRelationshipCSAccess().getProvidedPortProvidedPortFqnParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRelationshipCSAccess().getProvidedPortProvidedPortCrossReference_4_0()); 

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
    // $ANTLR end "rule__RelationshipCS__ProvidedPortAssignment_4"


    // $ANTLR start "rule__ExternalComponentInstanceCS__NameAssignment_1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3193:1: rule__ExternalComponentInstanceCS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalComponentInstanceCS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3197:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3198:1: ( RULE_ID )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3198:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3199:1: RULE_ID
            {
             before(grammarAccess.getExternalComponentInstanceCSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalComponentInstanceCS__NameAssignment_16371); 
             after(grammarAccess.getExternalComponentInstanceCSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExternalComponentInstanceCS__NameAssignment_1"


    // $ANTLR start "rule__ExternalComponentInstanceCS__TypeAssignment_3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3208:1: rule__ExternalComponentInstanceCS__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ExternalComponentInstanceCS__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3212:1: ( ( ( RULE_ID ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3213:1: ( ( RULE_ID ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3213:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3214:1: ( RULE_ID )
            {
             before(grammarAccess.getExternalComponentInstanceCSAccess().getTypeExternalComponentCrossReference_3_0()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3215:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3216:1: RULE_ID
            {
             before(grammarAccess.getExternalComponentInstanceCSAccess().getTypeExternalComponentIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalComponentInstanceCS__TypeAssignment_36406); 
             after(grammarAccess.getExternalComponentInstanceCSAccess().getTypeExternalComponentIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getExternalComponentInstanceCSAccess().getTypeExternalComponentCrossReference_3_0()); 

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
    // $ANTLR end "rule__ExternalComponentInstanceCS__TypeAssignment_3"


    // $ANTLR start "rule__InternalComponentInstanceCS__NameAssignment_1"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3227:1: rule__InternalComponentInstanceCS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InternalComponentInstanceCS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3231:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3232:1: ( RULE_ID )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3232:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3233:1: RULE_ID
            {
             before(grammarAccess.getInternalComponentInstanceCSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InternalComponentInstanceCS__NameAssignment_16441); 
             after(grammarAccess.getInternalComponentInstanceCSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__InternalComponentInstanceCS__NameAssignment_1"


    // $ANTLR start "rule__InternalComponentInstanceCS__TypeAssignment_3"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3242:1: rule__InternalComponentInstanceCS__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InternalComponentInstanceCS__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3246:1: ( ( ( RULE_ID ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3247:1: ( ( RULE_ID ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3247:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3248:1: ( RULE_ID )
            {
             before(grammarAccess.getInternalComponentInstanceCSAccess().getTypeInternalComponentCrossReference_3_0()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3249:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3250:1: RULE_ID
            {
             before(grammarAccess.getInternalComponentInstanceCSAccess().getTypeInternalComponentIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InternalComponentInstanceCS__TypeAssignment_36476); 
             after(grammarAccess.getInternalComponentInstanceCSAccess().getTypeInternalComponentIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInternalComponentInstanceCSAccess().getTypeInternalComponentCrossReference_3_0()); 

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
    // $ANTLR end "rule__InternalComponentInstanceCS__TypeAssignment_3"


    // $ANTLR start "rule__RelationshipInstanceCS__NameAssignment_0"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3261:1: rule__RelationshipInstanceCS__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RelationshipInstanceCS__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3265:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3266:1: ( RULE_ID )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3266:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3267:1: RULE_ID
            {
             before(grammarAccess.getRelationshipInstanceCSAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RelationshipInstanceCS__NameAssignment_06511); 
             after(grammarAccess.getRelationshipInstanceCSAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__RelationshipInstanceCS__NameAssignment_0"


    // $ANTLR start "rule__RelationshipInstanceCS__TypeAssignment_2"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3276:1: rule__RelationshipInstanceCS__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RelationshipInstanceCS__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3280:1: ( ( ( RULE_ID ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3281:1: ( ( RULE_ID ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3281:1: ( ( RULE_ID ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3282:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationshipInstanceCSAccess().getTypeRelationshipCrossReference_2_0()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3283:1: ( RULE_ID )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3284:1: RULE_ID
            {
             before(grammarAccess.getRelationshipInstanceCSAccess().getTypeRelationshipIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RelationshipInstanceCS__TypeAssignment_26546); 
             after(grammarAccess.getRelationshipInstanceCSAccess().getTypeRelationshipIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRelationshipInstanceCSAccess().getTypeRelationshipCrossReference_2_0()); 

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
    // $ANTLR end "rule__RelationshipInstanceCS__TypeAssignment_2"


    // $ANTLR start "rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_4"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3295:1: rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_4 : ( ( ruleFqn ) ) ;
    public final void rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3299:1: ( ( ( ruleFqn ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3300:1: ( ( ruleFqn ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3300:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3301:1: ( ruleFqn )
            {
             before(grammarAccess.getRelationshipInstanceCSAccess().getRequiredPortInstanceRequiredPortInstanceCrossReference_4_0()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3302:1: ( ruleFqn )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3303:1: ruleFqn
            {
             before(grammarAccess.getRelationshipInstanceCSAccess().getRequiredPortInstanceRequiredPortInstanceFqnParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleFqn_in_rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_46585);
            ruleFqn();

            state._fsp--;

             after(grammarAccess.getRelationshipInstanceCSAccess().getRequiredPortInstanceRequiredPortInstanceFqnParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRelationshipInstanceCSAccess().getRequiredPortInstanceRequiredPortInstanceCrossReference_4_0()); 

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
    // $ANTLR end "rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_4"


    // $ANTLR start "rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_6"
    // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3314:1: rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_6 : ( ( ruleFqn ) ) ;
    public final void rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3318:1: ( ( ( ruleFqn ) ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3319:1: ( ( ruleFqn ) )
            {
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3319:1: ( ( ruleFqn ) )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3320:1: ( ruleFqn )
            {
             before(grammarAccess.getRelationshipInstanceCSAccess().getProvidedPortInstanceProvidedPortInstanceCrossReference_6_0()); 
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3321:1: ( ruleFqn )
            // ../org.cloudml.dsl.ui/src-gen/org/cloudml/dsl/ui/contentassist/antlr/internal/InternalCloudML.g:3322:1: ruleFqn
            {
             before(grammarAccess.getRelationshipInstanceCSAccess().getProvidedPortInstanceProvidedPortInstanceFqnParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_ruleFqn_in_rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_66624);
            ruleFqn();

            state._fsp--;

             after(grammarAccess.getRelationshipInstanceCSAccess().getProvidedPortInstanceProvidedPortInstanceFqnParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRelationshipInstanceCSAccess().getProvidedPortInstanceProvidedPortInstanceCrossReference_6_0()); 

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
    // $ANTLR end "rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCloudMLRoot_in_entryRuleCloudMLRoot61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCloudMLRoot68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__0_in_ruleCloudMLRoot94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderCS_in_entryRuleProviderCS121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProviderCS128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderCS__Group__0_in_ruleProviderCS154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVMCS_in_entryRuleVMCS181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVMCS188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VMCS__Group__0_in_ruleVMCS214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVMPortCS_in_entryRuleVMPortCS241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVMPortCS248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VMPortCS__NameAssignment_in_ruleVMPortCS274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalComponentCS_in_entryRuleExternalComponentCS301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalComponentCS308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalComponentCS__Group__0_in_ruleExternalComponentCS334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedPortCS_in_entryRuleProvidedPortCS361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedPortCS368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPortCS__Group__0_in_ruleProvidedPortCS394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalComponentCS_in_entryRuleInternalComponentCS421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalComponentCS428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__Group__0_in_ruleInternalComponentCS454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredPortCS_in_entryRuleRequiredPortCS481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredPortCS488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPortCS__Group__0_in_ruleRequiredPortCS514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredExecutionPlatformCS_in_entryRuleRequiredExecutionPlatformCS541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredExecutionPlatformCS548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredExecutionPlatformCS__Group__0_in_ruleRequiredExecutionPlatformCS574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipCS_in_entryRuleRelationshipCS601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipCS608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipCS__Group__0_in_ruleRelationshipCS634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalComponentInstanceCS_in_entryRuleExternalComponentInstanceCS661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalComponentInstanceCS668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalComponentInstanceCS__Group__0_in_ruleExternalComponentInstanceCS694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalComponentInstanceCS_in_entryRuleInternalComponentInstanceCS721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalComponentInstanceCS728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentInstanceCS__Group__0_in_ruleInternalComponentInstanceCS754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipInstanceCS_in_entryRuleRelationshipInstanceCS781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipInstanceCS788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__Group__0_in_ruleRelationshipInstanceCS814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqn_in_entryRuleFqn841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqn848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fqn__Group__0_in_ruleFqn874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__VmsAssignment_5_0_in_rule__CloudMLRoot__Alternatives_5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__InternalComponentsAssignment_5_1_in_rule__CloudMLRoot__Alternatives_5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__ExternalComponentsAssignment_5_2_in_rule__CloudMLRoot__Alternatives_5946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__ComponentInstancesAssignment_10_0_in_rule__CloudMLRoot__Alternatives_10979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__ComponentInstancesAssignment_10_1_in_rule__CloudMLRoot__Alternatives_10997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__0__Impl_in_rule__CloudMLRoot__Group__01028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__1_in_rule__CloudMLRoot__Group__01031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CloudMLRoot__Group__0__Impl1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__1__Impl_in_rule__CloudMLRoot__Group__11090 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__2_in_rule__CloudMLRoot__Group__11093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__NameAssignment_1_in_rule__CloudMLRoot__Group__1__Impl1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__2__Impl_in_rule__CloudMLRoot__Group__21150 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__3_in_rule__CloudMLRoot__Group__21153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__ProvidersAssignment_2_in_rule__CloudMLRoot__Group__2__Impl1180 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__3__Impl_in_rule__CloudMLRoot__Group__31211 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__4_in_rule__CloudMLRoot__Group__31214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CloudMLRoot__Group__3__Impl1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__4__Impl_in_rule__CloudMLRoot__Group__41273 = new BitSet(new long[]{0x00000000002C4010L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__5_in_rule__CloudMLRoot__Group__41276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CloudMLRoot__Group__4__Impl1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__5__Impl_in_rule__CloudMLRoot__Group__51335 = new BitSet(new long[]{0x00000000002C4010L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__6_in_rule__CloudMLRoot__Group__51338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Alternatives_5_in_rule__CloudMLRoot__Group__5__Impl1365 = new BitSet(new long[]{0x00000000002C0002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__6__Impl_in_rule__CloudMLRoot__Group__61396 = new BitSet(new long[]{0x00000000002C4010L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__7_in_rule__CloudMLRoot__Group__61399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__RelationshipsAssignment_6_in_rule__CloudMLRoot__Group__6__Impl1426 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__7__Impl_in_rule__CloudMLRoot__Group__71457 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__8_in_rule__CloudMLRoot__Group__71460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CloudMLRoot__Group__7__Impl1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__8__Impl_in_rule__CloudMLRoot__Group__81519 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__9_in_rule__CloudMLRoot__Group__81522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CloudMLRoot__Group__8__Impl1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__9__Impl_in_rule__CloudMLRoot__Group__91581 = new BitSet(new long[]{0x0000000000284010L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__10_in_rule__CloudMLRoot__Group__91584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CloudMLRoot__Group__9__Impl1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__10__Impl_in_rule__CloudMLRoot__Group__101643 = new BitSet(new long[]{0x0000000000284010L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__11_in_rule__CloudMLRoot__Group__101646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Alternatives_10_in_rule__CloudMLRoot__Group__10__Impl1673 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__11__Impl_in_rule__CloudMLRoot__Group__111704 = new BitSet(new long[]{0x0000000000284010L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__12_in_rule__CloudMLRoot__Group__111707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__RelationshipInstancesAssignment_11_in_rule__CloudMLRoot__Group__11__Impl1734 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__CloudMLRoot__Group__12__Impl_in_rule__CloudMLRoot__Group__121765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CloudMLRoot__Group__12__Impl1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderCS__Group__0__Impl_in_rule__ProviderCS__Group__01850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProviderCS__Group__1_in_rule__ProviderCS__Group__01853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ProviderCS__Group__0__Impl1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderCS__Group__1__Impl_in_rule__ProviderCS__Group__11912 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ProviderCS__Group__2_in_rule__ProviderCS__Group__11915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderCS__NameAssignment_1_in_rule__ProviderCS__Group__1__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderCS__Group__2__Impl_in_rule__ProviderCS__Group__21972 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProviderCS__Group__3_in_rule__ProviderCS__Group__21975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ProviderCS__Group__2__Impl2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderCS__Group__3__Impl_in_rule__ProviderCS__Group__32034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderCS__CredentialsAssignment_3_in_rule__ProviderCS__Group__3__Impl2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VMCS__Group__0__Impl_in_rule__VMCS__Group__02099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VMCS__Group__1_in_rule__VMCS__Group__02102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VMCS__Group__0__Impl2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VMCS__Group__1__Impl_in_rule__VMCS__Group__12161 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__VMCS__Group__2_in_rule__VMCS__Group__12164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VMCS__NameAssignment_1_in_rule__VMCS__Group__1__Impl2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VMCS__Group__2__Impl_in_rule__VMCS__Group__22221 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__VMCS__Group__3_in_rule__VMCS__Group__22224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VMCS__Group__2__Impl2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VMCS__Group__3__Impl_in_rule__VMCS__Group__32283 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__VMCS__Group__4_in_rule__VMCS__Group__32286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VMCS__ProvidedAssignment_3_in_rule__VMCS__Group__3__Impl2313 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__VMCS__Group__4__Impl_in_rule__VMCS__Group__42344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VMCS__Group__4__Impl2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalComponentCS__Group__0__Impl_in_rule__ExternalComponentCS__Group__02413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalComponentCS__Group__1_in_rule__ExternalComponentCS__Group__02416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ExternalComponentCS__Group__0__Impl2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalComponentCS__Group__1__Impl_in_rule__ExternalComponentCS__Group__12475 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ExternalComponentCS__Group__2_in_rule__ExternalComponentCS__Group__12478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalComponentCS__NameAssignment_1_in_rule__ExternalComponentCS__Group__1__Impl2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalComponentCS__Group__2__Impl_in_rule__ExternalComponentCS__Group__22535 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_rule__ExternalComponentCS__Group__3_in_rule__ExternalComponentCS__Group__22538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ExternalComponentCS__Group__2__Impl2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalComponentCS__Group__3__Impl_in_rule__ExternalComponentCS__Group__32597 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_rule__ExternalComponentCS__Group__4_in_rule__ExternalComponentCS__Group__32600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalComponentCS__ProvidedPortsAssignment_3_in_rule__ExternalComponentCS__Group__3__Impl2627 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__ExternalComponentCS__Group__4__Impl_in_rule__ExternalComponentCS__Group__42658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ExternalComponentCS__Group__4__Impl2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPortCS__Group__0__Impl_in_rule__ProvidedPortCS__Group__02727 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__ProvidedPortCS__Group__1_in_rule__ProvidedPortCS__Group__02730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ProvidedPortCS__Group__0__Impl2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPortCS__Group__1__Impl_in_rule__ProvidedPortCS__Group__12789 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__ProvidedPortCS__Group__2_in_rule__ProvidedPortCS__Group__12792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPortCS__IsLocalAssignment_1_in_rule__ProvidedPortCS__Group__1__Impl2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPortCS__Group__2__Impl_in_rule__ProvidedPortCS__Group__22850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProvidedPortCS__Group__3_in_rule__ProvidedPortCS__Group__22853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPortCS__NameAssignment_2_in_rule__ProvidedPortCS__Group__2__Impl2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPortCS__Group__3__Impl_in_rule__ProvidedPortCS__Group__32910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPortCS__ComponentAssignment_3_in_rule__ProvidedPortCS__Group__3__Impl2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__Group__0__Impl_in_rule__InternalComponentCS__Group__02976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__Group__1_in_rule__InternalComponentCS__Group__02979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__InternalComponentCS__Group__0__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__Group__1__Impl_in_rule__InternalComponentCS__Group__13038 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__Group__2_in_rule__InternalComponentCS__Group__13041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__NameAssignment_1_in_rule__InternalComponentCS__Group__1__Impl3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__Group__2__Impl_in_rule__InternalComponentCS__Group__23098 = new BitSet(new long[]{0x0000000000D00000L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__Group__3_in_rule__InternalComponentCS__Group__23101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__InternalComponentCS__Group__2__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__Group__3__Impl_in_rule__InternalComponentCS__Group__33160 = new BitSet(new long[]{0x0000000000D00000L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__Group__4_in_rule__InternalComponentCS__Group__33163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__ProvidedPortsAssignment_3_in_rule__InternalComponentCS__Group__3__Impl3190 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__Group__4__Impl_in_rule__InternalComponentCS__Group__43221 = new BitSet(new long[]{0x0000000000D00000L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__Group__5_in_rule__InternalComponentCS__Group__43224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__RequiredPortsAssignment_4_in_rule__InternalComponentCS__Group__4__Impl3251 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__Group__5__Impl_in_rule__InternalComponentCS__Group__53282 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__Group__6_in_rule__InternalComponentCS__Group__53285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__RequiredExecutionPlatformAssignment_5_in_rule__InternalComponentCS__Group__5__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentCS__Group__6__Impl_in_rule__InternalComponentCS__Group__63342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__InternalComponentCS__Group__6__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPortCS__Group__0__Impl_in_rule__RequiredPortCS__Group__03415 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__RequiredPortCS__Group__1_in_rule__RequiredPortCS__Group__03418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RequiredPortCS__Group__0__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPortCS__Group__1__Impl_in_rule__RequiredPortCS__Group__13477 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__RequiredPortCS__Group__2_in_rule__RequiredPortCS__Group__13480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPortCS__IsMandatoryAssignment_1_in_rule__RequiredPortCS__Group__1__Impl3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPortCS__Group__2__Impl_in_rule__RequiredPortCS__Group__23538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RequiredPortCS__Group__3_in_rule__RequiredPortCS__Group__23541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPortCS__NameAssignment_2_in_rule__RequiredPortCS__Group__2__Impl3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPortCS__Group__3__Impl_in_rule__RequiredPortCS__Group__33598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPortCS__ComponentAssignment_3_in_rule__RequiredPortCS__Group__3__Impl3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredExecutionPlatformCS__Group__0__Impl_in_rule__RequiredExecutionPlatformCS__Group__03664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RequiredExecutionPlatformCS__Group__1_in_rule__RequiredExecutionPlatformCS__Group__03667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RequiredExecutionPlatformCS__Group__0__Impl3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredExecutionPlatformCS__Group__1__Impl_in_rule__RequiredExecutionPlatformCS__Group__13726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RequiredExecutionPlatformCS__Group__2_in_rule__RequiredExecutionPlatformCS__Group__13729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredExecutionPlatformCS__NameAssignment_1_in_rule__RequiredExecutionPlatformCS__Group__1__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredExecutionPlatformCS__Group__2__Impl_in_rule__RequiredExecutionPlatformCS__Group__23786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredExecutionPlatformCS__OwnerAssignment_2_in_rule__RequiredExecutionPlatformCS__Group__2__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipCS__Group__0__Impl_in_rule__RelationshipCS__Group__03850 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RelationshipCS__Group__1_in_rule__RelationshipCS__Group__03853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipCS__NameAssignment_0_in_rule__RelationshipCS__Group__0__Impl3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipCS__Group__1__Impl_in_rule__RelationshipCS__Group__13910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RelationshipCS__Group__2_in_rule__RelationshipCS__Group__13913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RelationshipCS__Group__1__Impl3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipCS__Group__2__Impl_in_rule__RelationshipCS__Group__23972 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__RelationshipCS__Group__3_in_rule__RelationshipCS__Group__23975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipCS__RequiredPortAssignment_2_in_rule__RelationshipCS__Group__2__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipCS__Group__3__Impl_in_rule__RelationshipCS__Group__34032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RelationshipCS__Group__4_in_rule__RelationshipCS__Group__34035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RelationshipCS__Group__3__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipCS__Group__4__Impl_in_rule__RelationshipCS__Group__44094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipCS__ProvidedPortAssignment_4_in_rule__RelationshipCS__Group__4__Impl4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalComponentInstanceCS__Group__0__Impl_in_rule__ExternalComponentInstanceCS__Group__04161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalComponentInstanceCS__Group__1_in_rule__ExternalComponentInstanceCS__Group__04164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ExternalComponentInstanceCS__Group__0__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalComponentInstanceCS__Group__1__Impl_in_rule__ExternalComponentInstanceCS__Group__14223 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ExternalComponentInstanceCS__Group__2_in_rule__ExternalComponentInstanceCS__Group__14226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalComponentInstanceCS__NameAssignment_1_in_rule__ExternalComponentInstanceCS__Group__1__Impl4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalComponentInstanceCS__Group__2__Impl_in_rule__ExternalComponentInstanceCS__Group__24283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalComponentInstanceCS__Group__3_in_rule__ExternalComponentInstanceCS__Group__24286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ExternalComponentInstanceCS__Group__2__Impl4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalComponentInstanceCS__Group__3__Impl_in_rule__ExternalComponentInstanceCS__Group__34345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalComponentInstanceCS__TypeAssignment_3_in_rule__ExternalComponentInstanceCS__Group__3__Impl4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentInstanceCS__Group__0__Impl_in_rule__InternalComponentInstanceCS__Group__04410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InternalComponentInstanceCS__Group__1_in_rule__InternalComponentInstanceCS__Group__04413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__InternalComponentInstanceCS__Group__0__Impl4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentInstanceCS__Group__1__Impl_in_rule__InternalComponentInstanceCS__Group__14472 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__InternalComponentInstanceCS__Group__2_in_rule__InternalComponentInstanceCS__Group__14475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentInstanceCS__NameAssignment_1_in_rule__InternalComponentInstanceCS__Group__1__Impl4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentInstanceCS__Group__2__Impl_in_rule__InternalComponentInstanceCS__Group__24532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InternalComponentInstanceCS__Group__3_in_rule__InternalComponentInstanceCS__Group__24535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__InternalComponentInstanceCS__Group__2__Impl4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentInstanceCS__Group__3__Impl_in_rule__InternalComponentInstanceCS__Group__34594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalComponentInstanceCS__TypeAssignment_3_in_rule__InternalComponentInstanceCS__Group__3__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__Group__0__Impl_in_rule__RelationshipInstanceCS__Group__04659 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__Group__1_in_rule__RelationshipInstanceCS__Group__04662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__NameAssignment_0_in_rule__RelationshipInstanceCS__Group__0__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__Group__1__Impl_in_rule__RelationshipInstanceCS__Group__14719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__Group__2_in_rule__RelationshipInstanceCS__Group__14722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RelationshipInstanceCS__Group__1__Impl4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__Group__2__Impl_in_rule__RelationshipInstanceCS__Group__24781 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__Group__3_in_rule__RelationshipInstanceCS__Group__24784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__TypeAssignment_2_in_rule__RelationshipInstanceCS__Group__2__Impl4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__Group__3__Impl_in_rule__RelationshipInstanceCS__Group__34841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__Group__4_in_rule__RelationshipInstanceCS__Group__34844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RelationshipInstanceCS__Group__3__Impl4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__Group__4__Impl_in_rule__RelationshipInstanceCS__Group__44903 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__Group__5_in_rule__RelationshipInstanceCS__Group__44906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_4_in_rule__RelationshipInstanceCS__Group__4__Impl4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__Group__5__Impl_in_rule__RelationshipInstanceCS__Group__54963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__Group__6_in_rule__RelationshipInstanceCS__Group__54966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RelationshipInstanceCS__Group__5__Impl4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__Group__6__Impl_in_rule__RelationshipInstanceCS__Group__65025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_6_in_rule__RelationshipInstanceCS__Group__6__Impl5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fqn__Group__0__Impl_in_rule__Fqn__Group__05096 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Fqn__Group__1_in_rule__Fqn__Group__05099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fqn__Group__0__Impl5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fqn__Group__1__Impl_in_rule__Fqn__Group__15155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fqn__Group_1__0_in_rule__Fqn__Group__1__Impl5182 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Fqn__Group_1__0__Impl_in_rule__Fqn__Group_1__05217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fqn__Group_1__1_in_rule__Fqn__Group_1__05220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Fqn__Group_1__0__Impl5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fqn__Group_1__1__Impl_in_rule__Fqn__Group_1__15279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fqn__Group_1__1__Impl5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CloudMLRoot__NameAssignment_15344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderCS_in_rule__CloudMLRoot__ProvidersAssignment_25375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVMCS_in_rule__CloudMLRoot__VmsAssignment_5_05406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalComponentCS_in_rule__CloudMLRoot__InternalComponentsAssignment_5_15437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalComponentCS_in_rule__CloudMLRoot__ExternalComponentsAssignment_5_25468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipCS_in_rule__CloudMLRoot__RelationshipsAssignment_65499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalComponentInstanceCS_in_rule__CloudMLRoot__ComponentInstancesAssignment_10_05530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalComponentInstanceCS_in_rule__CloudMLRoot__ComponentInstancesAssignment_10_15561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipInstanceCS_in_rule__CloudMLRoot__RelationshipInstancesAssignment_115592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProviderCS__NameAssignment_15623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ProviderCS__CredentialsAssignment_35654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VMCS__NameAssignment_15685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVMPortCS_in_rule__VMCS__ProvidedAssignment_35716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VMPortCS__NameAssignment5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalComponentCS__NameAssignment_15778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedPortCS_in_rule__ExternalComponentCS__ProvidedPortsAssignment_35809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ProvidedPortCS__IsLocalAssignment_15845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProvidedPortCS__NameAssignment_25884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProvidedPortCS__ComponentAssignment_35919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InternalComponentCS__NameAssignment_15954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedPortCS_in_rule__InternalComponentCS__ProvidedPortsAssignment_35985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredPortCS_in_rule__InternalComponentCS__RequiredPortsAssignment_46016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredExecutionPlatformCS_in_rule__InternalComponentCS__RequiredExecutionPlatformAssignment_56047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RequiredPortCS__IsMandatoryAssignment_16083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequiredPortCS__NameAssignment_26122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequiredPortCS__ComponentAssignment_36157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequiredExecutionPlatformCS__NameAssignment_16192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequiredExecutionPlatformCS__OwnerAssignment_26227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RelationshipCS__NameAssignment_06262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqn_in_rule__RelationshipCS__RequiredPortAssignment_26297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqn_in_rule__RelationshipCS__ProvidedPortAssignment_46336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalComponentInstanceCS__NameAssignment_16371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalComponentInstanceCS__TypeAssignment_36406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InternalComponentInstanceCS__NameAssignment_16441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InternalComponentInstanceCS__TypeAssignment_36476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RelationshipInstanceCS__NameAssignment_06511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RelationshipInstanceCS__TypeAssignment_26546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqn_in_rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_46585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqn_in_rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_66624 = new BitSet(new long[]{0x0000000000000002L});

}