-- Functor is defined in the Prelude 
-- class Functor f where
--   fmap :: (a -> b) -> f a -> f b

data Tree a where
  Leaf :: a -> Tree a
  Node :: (Tree a) -> (Tree a) -> Tree a
  deriving Show

instance Functor Tree where
  fmap :: (a -> b) -> Tree a -> Tree b
  fmap f (Leaf a)= Leaf (f a)
  fmap f (Node l r) = Node (fmap f l) (fmap f r)
