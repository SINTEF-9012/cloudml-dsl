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



