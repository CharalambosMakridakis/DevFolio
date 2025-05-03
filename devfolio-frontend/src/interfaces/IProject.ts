export interface ProjectData {
  id: number;
  title: string;
  description: string;
  repositoryUrl: string;
  tools: ToolData[];
}

export interface ToolData {
  id: number;
  title: string;
}
