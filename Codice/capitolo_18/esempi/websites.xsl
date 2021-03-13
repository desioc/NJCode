<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
  <html>
  <body>
    <h2>Websites</h2>
    <table border="0">
      <tr bgcolor="lightgrey">
        <th>Name</th>
        <th>Description</th>
      </tr>
	  <!--<xsl:for-each select="websites/website">-->
	  <xsl:for-each select="//website">
      <tr>
        <td><xsl:value-of select="address"/></td>
        <td><xsl:value-of select="description"/></td>
      </tr>
	  </xsl:for-each>
    </table>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>
