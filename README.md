cloudml-dsl is a text-based domain-specific language for writing CloudML models. See a made-up example below:

```
deployment model SomeModel
provider aws:'./credential'
types{
	internal C1{
		provided port prv
		required execution exec
	}
	internal C2{
		required port req
		required execution exec
	}
	vm VM1{
		location:'eu', core:1..5, ram:5.., provider:aws
		provided execution exec
	}
	connect C2.req to C1.prv named R1
}
instances{
	internal c1 typed C1
	internal c2 typed C2
	vm v1 typed VM1
	connect c2.req to c1.prv typed R1
	host c1.exec on v1.exec
	host c2.exec on v1.exec
}

```

A real example for SensApp deployment can be found here: [org.cloudml.dsl/sample/sensapp.mydsl] (https://github.com/SINTEF-9012/cloudml-dsl/blob/master/org.cloudml.dsl/sample/sensapp.mydsl)

To use the editor of this language:

- Set up Eclipse Luna with Xtext, or directly download [Eclipse IDE for Java and DSL Developers](https://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/lunar)
- Install the Eclipse OCL plugin from Eclipse Marketplace
- Import all the projects in this repository into Eclipse
- Run the projects as "Eclipse Application"
- Create a new empty project in the new Eclipse, and a new file with extension ".mydsl"
- Copy the code above into the file, and save
- A <name>.xmi file and a <name>.json file will be generated in the src-gen folder, and you can use either of them for deployment using [cloudml](https://github.com/SINTEF-9012/cloudml/).


More examples can be found in the *samples* folder toghether with the source code
