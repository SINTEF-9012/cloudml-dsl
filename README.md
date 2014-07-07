cloudml-dsl is a text-based domain-specific language for writing CloudML models. See a made-up example below:

```
model MyModel2
provider AWS:'credentials'

components{
    internal Mine {
        required port req
        required execution exec
    }
    vm VM{
    	provided execution exec
    }
    external Yours{
        provided port prv
    }
    relationship R1 : Mine.req => Yours.prv
}
instances{
	internal Mine mine 
	external Yours yours 
	vm VM vm1
	relationship R1 r1 : mine.req => yours.prv
	execute mineVm : mine.exec => vm1.exec
}
```

A real example for SensApp deployment can be found here: [org.cloudml.dsl/sample/sensapp.mydsl] (https://github.com/SINTEF-9012/cloudml-dsl/blob/master/org.cloudml.dsl/sample/sensapp.mydsl)

To use the editor of this language:

- Set up Eclipse Luna with Xtext, or directly download [Eclipse IDE for Java and DSL Developers](https://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/lunar)
- Import all the projects in this repository into Eclipse
- Run the projects as "Eclipse Application"
- Create a new empty project in the new Eclipse, and a new file with extension ".mydsl"
- Copy the code above into the file, and save
- A new result.xmi file will be generated in the src-gen folder, and you can use this xmi file for deployment.
