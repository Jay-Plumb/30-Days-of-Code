    // Constructor
    public Difference(int[] elements) {
        this.elements = elements;
    }

    public int computeDifference() {
        // Compare each element to find the maximum difference
        this.maximumDifference = 0;
        for (int i = 0; i < elements.length; i++) {
            for (int j = i; j < elements.length; j++) {
                if (i == j) {
                    /*this compares itself so no need*/
                } else if (elements[i] >= 1 && elements[i] <= 100) { // Make sure it is +ve and within the constraints
                    int currentDifference = Math.abs(elements[i] - elements[j]);
                   // System.out.println(currentDifference + " hi");
                    if (currentDifference > this.maximumDifference) {
                        this.maximumDifference = currentDifference;
                    }
                }
            }
        }
      
        return maximumDifference;
    } 


