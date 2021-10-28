package com.yaroslav;

public class Kettle {
        private String model;
        private int weight;
        private int timeToBoil;
        private int waterTemp;
        private boolean isPlugged = false;

        public Kettle (String model, int weight, int timeToBoil)
        {
            this.model = model;
            this.weight = weight;
            this.timeToBoil = timeToBoil;
        }

        public Kettle (String model, int timeToBoil)
        {
            this.model = model;
            this.timeToBoil = timeToBoil;
        }

        public int boilWater()
        {
            this.waterTemp = 100;
            return this.waterTemp;
        }

        public void plugKettle()
        {
            if(isPlugged == false)
            {
                isPlugged = true;
            }
        }

        @Override
        public String toString()
        {
            return "Model: " + model + "\nTime to boil: " + timeToBoil;
        }

        @Override
        public boolean equals(Object obj)
        {
            if (obj == this) return true;

            if (!(obj instanceof Kettle))
            {
                return false;
            }

            Kettle myKettle = (Kettle) obj;

            return myKettle.model.equals(model) && myKettle.timeToBoil == timeToBoil;
        }

        @Override
        public int hashCode()
        {
            int result = 17;
            result = 31 * result + model.hashCode();
            result = 31 * result + timeToBoil;
            return result;
        }

        public String getModel()
        {
            return this.model;
        }

        public void setModel(String model)
        {
            this.model = model;
        }

        public int getWeight()
        {
            return this.weight;
        }

        public void setWeight(int weight)
        {
            this.weight = weight;
        }

        public int getTimeToBoil()
        {
            return this.timeToBoil;
        }

        public void setTimeToBoil(int timeToBoil)
        {
            this.timeToBoil = timeToBoil;
        }
}
