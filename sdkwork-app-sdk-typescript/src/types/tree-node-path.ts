import type { PathNode } from './path-node';

export interface TreeNodePath {
  nodes?: PathNode[];
  level?: number;
  depth?: number;
  pathName?: string;
  rootNode?: PathNode;
  parentNode?: PathNode;
  pathIds?: number[];
  currentNode?: PathNode;
}
