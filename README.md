cloudml-dsl is a text-based domain-specific language for writing CloudML models. See a made-up example below:

```
deployment model Test

types{
	internal component IM1{
		required communication ReqC
		required host ReqH
	}
	vm VM1 {
		imageID : 'something'
		provided communication ProC 
	}
	communication Com{
		from IM1.ReqC to VM1.ProC
	}	
}
instances{
	vm vm1 typed VM1
	internal component im1 typed IM1
	connect im1.ReqC to vm1.ProC typed Com named somename 
	host im1.ReqH on vm1.ProH
}
```

A real example for SensApp deployment can be found here: [org.cloudml.dsl/sample/sensapp.cloudml] (https://github.com/SINTEF-9012/cloudml-dsl/blob/master/org.cloudml.dsl/sample/sensapp.cloudml)

#Download and Install

To use the editor of this language:

- Set up Eclipse Luna with Xtext, or directly download [Eclipse IDE for Java and DSL Developers](https://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/lunar)
- Install the Eclipse OCL plugin from Eclipse Marketplace
- Import all the projects in this repository into Eclipse
- Run the projects as "Eclipse Application"
- Create a new empty project in the new Eclipse, and a new file with extension ".cloudml"
- Copy the code above into the file, and save
- A <name>.xmi file and a <name>.json file will be generated in the src-gen folder, and you can use either of them for deployment using [cloudml](https://github.com/SINTEF-9012/cloudml/).


More examples can be found in the *samples* folder toghether with the source code
