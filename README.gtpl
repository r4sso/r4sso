### Recent Blog Posts
{{- range rss "https://r4sso.github.io/rss.xml" 5 }}
- [{{ .Title }}]({{ .URL }}) ({{ .PublishedAt.Format "Jan 02, 2006" }})
{{- end }}
