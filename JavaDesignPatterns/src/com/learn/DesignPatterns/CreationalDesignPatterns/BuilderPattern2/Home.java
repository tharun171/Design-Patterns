package com.learn.DesignPatterns.CreationalDesignPatterns.BuilderPattern2;

public class Home{
	
    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    // Private constructor to enforce the use of Builder
    private Home(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.interior = builder.interior;
    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", structure=" + structure + 
               ", roof=" + roof + ", interior=" + interior + "]";
    }
    
    

    public String getFoundation() {
		return foundation;
	}

	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public String getInterior() {
		return interior;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}



	// Static Builder Class
    public static class HouseBuilder {
        private String foundation;
        private String structure;
        private String roof;
        private String interior;

        //no need to have name as setFoundation, can have buildFoundation or anything
        //not a Rule to have set
        public HouseBuilder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public HouseBuilder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setInterior(String interior) {
            this.interior = interior;
            return this;
        }

        public Home build() {
            return new Home(this);
        }
    }
}
