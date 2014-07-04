cloudml-dsl is a text-based domain-specific language for writing CloudML models. See the first (and so far the only) example below:

```
model MyModel
provider AWS:'credentials'
components{
	internal Mine {
		required Myreq
		execution Myexec  
	}
	external Yours{
		provided Yourprv
	}
	R1 : Mine.Myreq => Yours.Yourprv
}
instances{
	internal mine : Mine
	external yours : Yours
	r1 : R1 : mine.myreq => yours.yourprv
}
```

To use the editor of this language:

- Set up Eclipse Luna with Xtext, or directly download [Eclipse IDE for Java and DSL Developers](https://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/lunar)
- Import all the projects in this repository into Eclipse
- Run the projects as "Eclipse Application"
- Create a new empty project in the new Eclipse, and a new file with extension ".mydsl"
- Copy the code above into the file, and save
- A new result.xmi file will be generated in the src-gen folder, and you can use this xmi file for deployment.
