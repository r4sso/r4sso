## My blog posts
{{range rss "https://dagleaves.com/atom.xml" 5}}
- [{{.Title}}]({{.URL}})
{{- end}}
