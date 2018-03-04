pipelineJob("job2")
pipelineJob("job3")
pipelineJob("job4")
{
definition {
        cps {
            script(readFileFromWorkspace('Jenkinsfile'))
            sandbox()
        }
    }

}
