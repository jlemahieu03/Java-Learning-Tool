main <- function(){
  
  args <- commandArgs(trailingOnly = TRUE)
  args_numeric <- as.numeric(args)
  
  library(ggplot2)
  library(magrittr)
  
  
  # Create a data frame
  df <- data.frame(Module_Name = c('Module 1', 'Module 2', 'Module 3', 'Module 4'),
                   Module_Percent = c(args_numeric[1], args_numeric[2], args_numeric[3], args_numeric[4]))
  
  library(ggplot2)
  
  # Create the graph
  graph <- ggplot(df, aes(x = Module_Name,
                          y = Module_Percent,
                          fill = Module_Name)) +
    geom_bar(stat = "identity", show.legend = F) +
    ylim(0,100) +
    labs(title = "Module Percentages", 
         x = "Module", 
         y = "Percentage")
  
  # Save the graph as a PNG image
  ggsave("percent_graph.png", 
         plot = graph,
         device = "png",
         path = "..\\Infinite-Loop")
}

main()

