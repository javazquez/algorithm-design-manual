(ns algorithm-design-manual.chapter1)

(defn- s-helper
  "assumes that the collection is already sorted"
  [item  coll ]
  (if (empty? coll)
     item
     (let [mp (group-by #(<= % item) coll)] ; (lt) (gt)
       (concat (get mp true)  
               (list item) 
               (get mp false)))))    


(defn insertion-sort
  "Incremently split a list to be sorted recursively."
  [coll]
  (loop [idx 1
         [l-coll r-coll :as whole] (split-at idx coll)]
    (cond
      (empty? r-coll) l-coll
      :else (recur (inc idx)
                   (split-at (inc idx) 
                             (concat (s-helper (first r-coll)
                                               l-coll)
                                     (rest r-coll)))))))
